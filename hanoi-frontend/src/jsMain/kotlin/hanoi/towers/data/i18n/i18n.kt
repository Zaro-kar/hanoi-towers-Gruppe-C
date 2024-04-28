package hanoi.towers.data.i18n

import lib.language.Lang
import lib.optics.Lensify
import lib.optics.ReadOnly
import lib.optics.ReadWrite
import lib.optics.lens.Lens

@Lensify data class I18N(
    @ReadWrite val locale: String,
    @ReadOnly val locales: List<String>,
    @ReadOnly val language: Lang,
)


/**
 * Autogenerated Lens.
 * Read and manipulate [I18N.locale]
 */
@ReadWrite val locale: Lens<I18N, String> by lazy{ Lens(
    get = {whole -> whole.locale},
    set = {part -> {whole -> whole.copy(locale = part)}}
) }

/**
 * Autogenerated ReadOnly Lens.
 * Read [I18N.locales]
 */
@ReadOnly val locales: Lens<I18N, List<String>> by lazy{ Lens(
    get = {whole -> whole.locales},
    set = {{it}}
) }

/**
 * Autogenerated ReadOnly Lens.
 * Read [I18N.language]
 */
@ReadOnly val language: Lens<I18N, Lang> by lazy{ Lens(
    get = {whole -> whole.language},
    set = {{it}}
) }

/*
val locale: Lens<I18N, String> = Lens(
    {data -> data.locale},
    {part -> {whole -> whole.copy(locale = part)}}
)

val locales: Lens<I18N, List<String>> = Lens(
    {data -> data.locales},
    {part -> {whole -> whole.copy(locales = part)}}
)

val language: Lens<I18N, Lang> = Lens(
    {data -> data.language},
    {part -> {whole -> whole.copy(language = part)}}
)

 */