package hanoi.towers.module.db.migrations

import org.evoleq.exposedx.migrations.Migration
import org.jetbrains.exposed.sql.Database

/**
 * Autogenerated [List] of [Migration]s. Alter with care!
 */
val dbMigrations: ArrayList<Database.()-> Migration> by lazy{
    arrayListOf<Database.()-> Migration>(
        { Migration1712001749830(this) }
    )
}
