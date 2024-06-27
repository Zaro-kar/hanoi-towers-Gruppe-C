package hanoi.towers.data.hanoi

import lib.compose.dnd.Coordinates
import lib.optics.Ignore
import lib.optics.Lensify
import lib.optics.ReadWrite
import lib.optics.lens.Lens


@Lensify data class DragEvent(
    @ReadWrite val coordinates: Coordinates,
    @ReadWrite val slice: Int,
    @ReadWrite val target: Int? = null,
    @Ignore val drop: (slice: Int)->Unit = { _ -> Unit}
)


/**
 * Autogenerated Lens.
 * Read and manipulate [DragEvent.coordinates]
 */
@ReadWrite val coordinates: Lens<DragEvent, Coordinates> by lazy{ Lens(
    get = {whole -> whole.coordinates},
    set = {part -> {whole -> whole.copy(coordinates = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [DragEvent.slice]
 */
@ReadWrite val slice: Lens<DragEvent, Int> by lazy{ Lens(
    get = {whole -> whole.slice},
    set = {part -> {whole -> whole.copy(slice = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [DragEvent.target]
 */
@ReadWrite val target: Lens<DragEvent, Int?> by lazy{ Lens(
    get = {whole -> whole.target},
    set = {part -> {whole -> whole.copy(target = part)}}
) }
