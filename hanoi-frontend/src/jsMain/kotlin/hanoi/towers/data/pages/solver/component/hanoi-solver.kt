@file:Suppress("MatchingDeclarationName")
package hanoi.towers.data.pages.solver.component

import hanoi.towers.data.hanoi.Hanoi
import lib.language.Lang
import lib.optics.Lensify
import lib.optics.ReadOnly
import lib.optics.ReadWrite
import lib.optics.lens.Lens


@Lensify data class HanoiSolver(
    @ReadWrite val hanoi: Hanoi,
    @ReadOnly val texts: Lang,
    /*
    val moves: Moves,
    val indexOfCurrentMove: Int,
    val numberOfMoves: Int,
    val isComputingMoves: Boolean,
    val isPlaying: Boolean,
    val movesPerSecond: Int,
    */
)


/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolver.hanoi]
 */
@ReadWrite val hanoi: Lens<HanoiSolver, Hanoi> by lazy{ Lens(
    get = {whole -> whole.hanoi},
    set = {part -> {whole -> whole.copy(hanoi = part)}}
) }

/**
 * Autogenerated ReadOnly Lens.
 * Read [HanoiSolver.texts]
 */
@ReadOnly val texts: Lens<HanoiSolver, Lang> by lazy{ Lens(
    get = {whole -> whole.texts},
    set = {{it}}
) }
