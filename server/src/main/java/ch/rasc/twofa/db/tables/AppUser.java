/*
 * This file is generated by jOOQ.
 */
package ch.rasc.twofa.db.tables;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ch.rasc.twofa.db.DefaultSchema;
import ch.rasc.twofa.db.Keys;
import ch.rasc.twofa.db.tables.records.AppUserRecord;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppUser extends TableImpl<AppUserRecord> {

  private static final long serialVersionUID = 2031297271;

  /**
   * The reference instance of <code>APP_USER</code>
   */
  public static final AppUser APP_USER = new AppUser();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<AppUserRecord> getRecordType() {
    return AppUserRecord.class;
  }

  /**
   * The column <code>APP_USER.ID</code>.
   */
  public final TableField<AppUserRecord, Long> ID = createField(DSL.name("ID"),
      org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

  /**
   * The column <code>APP_USER.USERNAME</code>.
   */
  public final TableField<AppUserRecord, String> USERNAME = createField(
      DSL.name("USERNAME"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this,
      "");

  /**
   * The column <code>APP_USER.PASSWORD_HASH</code>.
   */
  public final TableField<AppUserRecord, String> PASSWORD_HASH = createField(
      DSL.name("PASSWORD_HASH"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>APP_USER.SECRET</code>.
   */
  public final TableField<AppUserRecord, String> SECRET = createField(DSL.name("SECRET"),
      org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

  /**
   * The column <code>APP_USER.ENABLED</code>.
   */
  public final TableField<AppUserRecord, Boolean> ENABLED = createField(
      DSL.name("ENABLED"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

  /**
   * The column <code>APP_USER.ADDITIONAL_SECURITY</code>.
   */
  public final TableField<AppUserRecord, Boolean> ADDITIONAL_SECURITY = createField(
      DSL.name("ADDITIONAL_SECURITY"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false),
      this, "");

  /**
   * Create a <code>APP_USER</code> table reference
   */
  public AppUser() {
    this(DSL.name("APP_USER"), null);
  }

  /**
   * Create an aliased <code>APP_USER</code> table reference
   */
  public AppUser(String alias) {
    this(DSL.name(alias), APP_USER);
  }

  /**
   * Create an aliased <code>APP_USER</code> table reference
   */
  public AppUser(Name alias) {
    this(alias, APP_USER);
  }

  private AppUser(Name alias, Table<AppUserRecord> aliased) {
    this(alias, aliased, null);
  }

  private AppUser(Name alias, Table<AppUserRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  public <O extends Record> AppUser(Table<O> child, ForeignKey<O, AppUserRecord> key) {
    super(child, key, APP_USER);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public Identity<AppUserRecord, Long> getIdentity() {
    return Keys.IDENTITY_APP_USER;
  }

  @Override
  public UniqueKey<AppUserRecord> getPrimaryKey() {
    return Keys.CONSTRAINT_7;
  }

  @Override
  public List<UniqueKey<AppUserRecord>> getKeys() {
    return Arrays.<UniqueKey<AppUserRecord>>asList(Keys.CONSTRAINT_7, Keys.CONSTRAINT_76);
  }

  @Override
  public AppUser as(String alias) {
    return new AppUser(DSL.name(alias), this);
  }

  @Override
  public AppUser as(Name alias) {
    return new AppUser(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public AppUser rename(String name) {
    return new AppUser(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public AppUser rename(Name name) {
    return new AppUser(name, null);
  }

  // -------------------------------------------------------------------------
  // Row6 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row6<Long, String, String, String, Boolean, Boolean> fieldsRow() {
    return (Row6) super.fieldsRow();
  }
}
