package hanoi.towers.data.pages.game

import hanoi.towers.data.hanoi.Moves
import hanoi.towers.data.pages.game.component.HanoiGame
import lib.language.Lang
import lib.optics.Lensify
import lib.optics.ReadOnly
import lib.optics.ReadWrite
import lib.optics.lens.Lens

@Lensify data class HanoiGamePage(
    @ReadOnly val texts: Lang.Block,
    @ReadWrite val game: HanoiGame,
    @ReadWrite val numberOfSlices: Int,
    @ReadWrite val numberOfMoves: Int,
    @ReadWrite val moves: Moves,
    @ReadWrite val isComputingMoves: Boolean,
    @ReadWrite val indexOfCurrentMove: Int,
    @ReadWrite val error: String?
)

/**
 * Autogenerated ReadOnly Lens.
 * Read [HanoiGamePage.texts]
 */
@ReadOnly val texts: Lens<HanoiGamePage, Lang.Block> by lazy{ Lens(
    get = {whole -> whole.texts},
    set = {{it}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.game]
 */
@ReadWrite val game: Lens<HanoiGamePage, HanoiGame> by lazy{ Lens(
    get = {whole -> whole.game},
    set = {part -> {whole -> whole.copy(game = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.numberOfSlices]
 */
@ReadWrite val numberOfSlices: Lens<HanoiGamePage, Int> by lazy{ Lens(
    get = {whole -> whole.numberOfSlices},
    set = {part -> {whole -> whole.copy(numberOfSlices = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.numberOfMoves]
 */
@ReadWrite val numberOfMoves: Lens<HanoiGamePage, Int> by lazy{ Lens(
    get = {whole -> whole.numberOfMoves},
    set = {part -> {whole -> whole.copy(numberOfMoves = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.moves]
 */
@ReadWrite val moves: Lens<HanoiGamePage, Moves> by lazy{ Lens(
    get = {whole -> whole.moves},
    set = {part -> {whole -> whole.copy(moves = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.isComputingMoves]
 */
@ReadWrite val isComputingMoves: Lens<HanoiGamePage, Boolean> by lazy{ Lens(
    get = {whole -> whole.isComputingMoves},
    set = {part -> {whole -> whole.copy(isComputingMoves = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.indexOfCurrentMove]
 */
@ReadWrite val indexOfCurrentMove: Lens<HanoiGamePage, Int> by lazy{ Lens(
    get = {whole -> whole.indexOfCurrentMove},
    set = {part -> {whole -> whole.copy(indexOfCurrentMove = part)}}
) }

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGamePage.error]
 */
@ReadWrite val error: Lens<HanoiGamePage, String?> by lazy{ Lens(
    get = {whole -> whole.error},
    set = {part -> {whole -> whole.copy(error = part)}}
) }