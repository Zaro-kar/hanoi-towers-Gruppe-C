@file:Suppress("MatchingDeclarationName")
package hanoi.towers.data.pages.game.component

import hanoi.towers.data.hanoi.Hanoi
import lib.language.Lang
import lib.optics.Lensify
import lib.optics.ReadOnly
import lib.optics.ReadWrite
import lib.optics.lens.Lens


@Lensify data class HanoiGame(
    @ReadWrite val hanoi: Hanoi,
    @ReadOnly val texts: Lang,
    @ReadOnly val maxNumberOfSlices: Int = 10
)

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiGame.hanoi]
 */
@ReadWrite val hanoi: Lens<HanoiGame, Hanoi> by lazy{ Lens(
    get = {whole -> whole.hanoi},
    set = {part -> {whole -> whole.copy(hanoi = part)}}
) }

/**
 * Autogenerated ReadOnly Lens.
 * Read [HanoiGame.texts]
 */
@ReadOnly val texts: Lens<HanoiGame, Lang> by lazy{ Lens(
    get = {whole -> whole.texts},
    set = {{it}}
) }

/**
 * Autogenerated ReadOnly Lens.
 * Read [HanoiGame.maxNumberOfSlices]
 */
@ReadOnly val maxNumberOfSlices: Lens<HanoiGame, Int> by lazy{ Lens(
    get = {whole -> whole.maxNumberOfSlices},
    set = {{it}}
) }
