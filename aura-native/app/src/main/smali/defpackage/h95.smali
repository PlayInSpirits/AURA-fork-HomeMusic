.class public final Ldefpackage/h95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/zy3;


# instance fields
.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/ba2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/h95;->n:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 15
    iput-object p1, p0, Ldefpackage/h95;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldefpackage/we1;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/we1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const-string v0, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x\'\', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static b(Ldefpackage/we1;)Ldefpackage/u24;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ldefpackage/oq4;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v4, 0x1

    .line 14
    const-string v6, "work_spec_id"

    .line 15
    .line 16
    const-string v7, "TEXT"

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    invoke-direct/range {v3 .. v9}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v4, "work_spec_id"

    .line 23
    .line 24
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v5, Ldefpackage/oq4;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v6, 0x2

    .line 32
    const-string v8, "prerequisite_id"

    .line 33
    .line 34
    const-string v9, "TEXT"

    .line 35
    .line 36
    const/4 v11, 0x1

    .line 37
    invoke-direct/range {v5 .. v11}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const-string v3, "prerequisite_id"

    .line 41
    .line 42
    invoke-static {v1, v3, v5, v2}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v6, Ldefpackage/pq4;

    .line 47
    .line 48
    filled-new-array {v4}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    const-string v12, "id"

    .line 57
    .line 58
    filled-new-array {v12}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    const-string v7, "WorkSpec"

    .line 67
    .line 68
    const-string v8, "CASCADE"

    .line 69
    .line 70
    const-string v9, "CASCADE"

    .line 71
    .line 72
    invoke-direct/range {v6 .. v11}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    new-instance v13, Ldefpackage/pq4;

    .line 79
    .line 80
    filled-new-array {v3}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v17

    .line 88
    filled-new-array {v12}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v18

    .line 96
    const-string v14, "WorkSpec"

    .line 97
    .line 98
    const-string v15, "CASCADE"

    .line 99
    .line 100
    const-string v16, "CASCADE"

    .line 101
    .line 102
    invoke-direct/range {v13 .. v18}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    new-instance v6, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 111
    .line 112
    .line 113
    new-instance v7, Ldefpackage/qq4;

    .line 114
    .line 115
    filled-new-array {v4}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    const-string v9, "ASC"

    .line 124
    .line 125
    filled-new-array {v9}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    const-string v11, "index_Dependency_work_spec_id"

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    invoke-direct {v7, v11, v13, v8, v10}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    new-instance v7, Ldefpackage/qq4;

    .line 143
    .line 144
    filled-new-array {v3}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    filled-new-array {v9}, [Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const-string v10, "index_Dependency_prerequisite_id"

    .line 161
    .line 162
    invoke-direct {v7, v10, v13, v3, v8}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    new-instance v3, Ldefpackage/rq4;

    .line 169
    .line 170
    const-string v7, "Dependency"

    .line 171
    .line 172
    invoke-direct {v3, v7, v1, v5, v6}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v7}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v3, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    const-string v6, "\n Found:\n"

    .line 184
    .line 185
    if-nez v5, :cond_0

    .line 186
    .line 187
    new-instance v0, Ldefpackage/u24;

    .line 188
    .line 189
    const-string v2, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"

    .line 190
    .line 191
    invoke-static {v2, v3, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 200
    .line 201
    const/16 v3, 0x20

    .line 202
    .line 203
    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 204
    .line 205
    .line 206
    new-instance v14, Ldefpackage/oq4;

    .line 207
    .line 208
    const/16 v19, 0x0

    .line 209
    .line 210
    const/16 v16, 0x1

    .line 211
    .line 212
    const/16 v20, 0x1

    .line 213
    .line 214
    const/4 v15, 0x1

    .line 215
    const-string v17, "id"

    .line 216
    .line 217
    const-string v18, "TEXT"

    .line 218
    .line 219
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v12, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    new-instance v15, Ldefpackage/oq4;

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    const/16 v17, 0x1

    .line 230
    .line 231
    const/16 v21, 0x1

    .line 232
    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    const-string v18, "state"

    .line 236
    .line 237
    const-string v19, "INTEGER"

    .line 238
    .line 239
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 240
    .line 241
    .line 242
    const-string v3, "state"

    .line 243
    .line 244
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    new-instance v16, Ldefpackage/oq4;

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const/16 v18, 0x1

    .line 252
    .line 253
    const/16 v22, 0x1

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    const-string v19, "worker_class_name"

    .line 258
    .line 259
    const-string v20, "TEXT"

    .line 260
    .line 261
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    move-object/from16 v3, v16

    .line 265
    .line 266
    const-string v5, "worker_class_name"

    .line 267
    .line 268
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    new-instance v14, Ldefpackage/oq4;

    .line 272
    .line 273
    const/16 v19, 0x0

    .line 274
    .line 275
    const/16 v16, 0x1

    .line 276
    .line 277
    const/16 v20, 0x1

    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    const-string v17, "input_merger_class_name"

    .line 281
    .line 282
    const-string v18, "TEXT"

    .line 283
    .line 284
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 285
    .line 286
    .line 287
    const-string v3, "input_merger_class_name"

    .line 288
    .line 289
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    new-instance v15, Ldefpackage/oq4;

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    const/16 v17, 0x1

    .line 297
    .line 298
    const/16 v21, 0x1

    .line 299
    .line 300
    const/16 v16, 0x0

    .line 301
    .line 302
    const-string v18, "input"

    .line 303
    .line 304
    const-string v19, "BLOB"

    .line 305
    .line 306
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 307
    .line 308
    .line 309
    const-string v3, "input"

    .line 310
    .line 311
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    new-instance v16, Ldefpackage/oq4;

    .line 315
    .line 316
    const/16 v21, 0x0

    .line 317
    .line 318
    const/16 v18, 0x1

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const-string v19, "output"

    .line 323
    .line 324
    const-string v20, "BLOB"

    .line 325
    .line 326
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 327
    .line 328
    .line 329
    move-object/from16 v3, v16

    .line 330
    .line 331
    const-string v5, "output"

    .line 332
    .line 333
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    new-instance v14, Ldefpackage/oq4;

    .line 337
    .line 338
    const/16 v19, 0x0

    .line 339
    .line 340
    const/16 v16, 0x1

    .line 341
    .line 342
    const/16 v20, 0x1

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    const-string v17, "initial_delay"

    .line 346
    .line 347
    const-string v18, "INTEGER"

    .line 348
    .line 349
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 350
    .line 351
    .line 352
    const-string v3, "initial_delay"

    .line 353
    .line 354
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    new-instance v15, Ldefpackage/oq4;

    .line 358
    .line 359
    const/16 v20, 0x0

    .line 360
    .line 361
    const/16 v17, 0x1

    .line 362
    .line 363
    const/16 v21, 0x1

    .line 364
    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    const-string v18, "interval_duration"

    .line 368
    .line 369
    const-string v19, "INTEGER"

    .line 370
    .line 371
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 372
    .line 373
    .line 374
    const-string v3, "interval_duration"

    .line 375
    .line 376
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    new-instance v16, Ldefpackage/oq4;

    .line 380
    .line 381
    const/16 v21, 0x0

    .line 382
    .line 383
    const/16 v18, 0x1

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const-string v19, "flex_duration"

    .line 388
    .line 389
    const-string v20, "INTEGER"

    .line 390
    .line 391
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 392
    .line 393
    .line 394
    move-object/from16 v3, v16

    .line 395
    .line 396
    const-string v5, "flex_duration"

    .line 397
    .line 398
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    new-instance v14, Ldefpackage/oq4;

    .line 402
    .line 403
    const/16 v19, 0x0

    .line 404
    .line 405
    const/16 v16, 0x1

    .line 406
    .line 407
    const/16 v20, 0x1

    .line 408
    .line 409
    const/4 v15, 0x0

    .line 410
    const-string v17, "run_attempt_count"

    .line 411
    .line 412
    const-string v18, "INTEGER"

    .line 413
    .line 414
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 415
    .line 416
    .line 417
    const-string v3, "run_attempt_count"

    .line 418
    .line 419
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    new-instance v15, Ldefpackage/oq4;

    .line 423
    .line 424
    const/16 v20, 0x0

    .line 425
    .line 426
    const/16 v17, 0x1

    .line 427
    .line 428
    const/16 v21, 0x1

    .line 429
    .line 430
    const/16 v16, 0x0

    .line 431
    .line 432
    const-string v18, "backoff_policy"

    .line 433
    .line 434
    const-string v19, "INTEGER"

    .line 435
    .line 436
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 437
    .line 438
    .line 439
    const-string v3, "backoff_policy"

    .line 440
    .line 441
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    new-instance v16, Ldefpackage/oq4;

    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    const/16 v18, 0x1

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const-string v19, "backoff_delay_duration"

    .line 453
    .line 454
    const-string v20, "INTEGER"

    .line 455
    .line 456
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 457
    .line 458
    .line 459
    move-object/from16 v3, v16

    .line 460
    .line 461
    const-string v5, "backoff_delay_duration"

    .line 462
    .line 463
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    new-instance v14, Ldefpackage/oq4;

    .line 467
    .line 468
    const-string v19, "-1"

    .line 469
    .line 470
    const/16 v16, 0x1

    .line 471
    .line 472
    const/16 v20, 0x1

    .line 473
    .line 474
    const/4 v15, 0x0

    .line 475
    const-string v17, "last_enqueue_time"

    .line 476
    .line 477
    const-string v18, "INTEGER"

    .line 478
    .line 479
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 480
    .line 481
    .line 482
    const-string v3, "last_enqueue_time"

    .line 483
    .line 484
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    new-instance v15, Ldefpackage/oq4;

    .line 488
    .line 489
    const/16 v20, 0x0

    .line 490
    .line 491
    const/16 v17, 0x1

    .line 492
    .line 493
    const/16 v21, 0x1

    .line 494
    .line 495
    const/16 v16, 0x0

    .line 496
    .line 497
    const-string v18, "minimum_retention_duration"

    .line 498
    .line 499
    const-string v19, "INTEGER"

    .line 500
    .line 501
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 502
    .line 503
    .line 504
    const-string v5, "minimum_retention_duration"

    .line 505
    .line 506
    invoke-virtual {v1, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    new-instance v16, Ldefpackage/oq4;

    .line 510
    .line 511
    const/16 v21, 0x0

    .line 512
    .line 513
    const/16 v18, 0x1

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    const-string v19, "schedule_requested_at"

    .line 518
    .line 519
    const-string v20, "INTEGER"

    .line 520
    .line 521
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 522
    .line 523
    .line 524
    move-object/from16 v5, v16

    .line 525
    .line 526
    const-string v7, "schedule_requested_at"

    .line 527
    .line 528
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    new-instance v14, Ldefpackage/oq4;

    .line 532
    .line 533
    const/16 v19, 0x0

    .line 534
    .line 535
    const/16 v16, 0x1

    .line 536
    .line 537
    const/16 v20, 0x1

    .line 538
    .line 539
    const/4 v15, 0x0

    .line 540
    const-string v17, "run_in_foreground"

    .line 541
    .line 542
    const-string v18, "INTEGER"

    .line 543
    .line 544
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 545
    .line 546
    .line 547
    const-string v5, "run_in_foreground"

    .line 548
    .line 549
    invoke-virtual {v1, v5, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    new-instance v15, Ldefpackage/oq4;

    .line 553
    .line 554
    const/16 v20, 0x0

    .line 555
    .line 556
    const/16 v17, 0x1

    .line 557
    .line 558
    const/16 v21, 0x1

    .line 559
    .line 560
    const/16 v16, 0x0

    .line 561
    .line 562
    const-string v18, "out_of_quota_policy"

    .line 563
    .line 564
    const-string v19, "INTEGER"

    .line 565
    .line 566
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 567
    .line 568
    .line 569
    const-string v5, "out_of_quota_policy"

    .line 570
    .line 571
    invoke-virtual {v1, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    new-instance v16, Ldefpackage/oq4;

    .line 575
    .line 576
    const-string v21, "0"

    .line 577
    .line 578
    const/16 v18, 0x1

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const-string v19, "period_count"

    .line 583
    .line 584
    const-string v20, "INTEGER"

    .line 585
    .line 586
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 587
    .line 588
    .line 589
    move-object/from16 v5, v16

    .line 590
    .line 591
    const-string v8, "period_count"

    .line 592
    .line 593
    invoke-virtual {v1, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    new-instance v14, Ldefpackage/oq4;

    .line 597
    .line 598
    const-string v19, "0"

    .line 599
    .line 600
    const/16 v16, 0x1

    .line 601
    .line 602
    const/16 v20, 0x1

    .line 603
    .line 604
    const/4 v15, 0x0

    .line 605
    const-string v17, "generation"

    .line 606
    .line 607
    const-string v18, "INTEGER"

    .line 608
    .line 609
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 610
    .line 611
    .line 612
    const-string v5, "generation"

    .line 613
    .line 614
    invoke-virtual {v1, v5, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    new-instance v15, Ldefpackage/oq4;

    .line 618
    .line 619
    const-string v20, "9223372036854775807"

    .line 620
    .line 621
    const/16 v17, 0x1

    .line 622
    .line 623
    const/16 v21, 0x1

    .line 624
    .line 625
    const/16 v16, 0x0

    .line 626
    .line 627
    const-string v18, "next_schedule_time_override"

    .line 628
    .line 629
    const-string v19, "INTEGER"

    .line 630
    .line 631
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 632
    .line 633
    .line 634
    const-string v8, "next_schedule_time_override"

    .line 635
    .line 636
    invoke-virtual {v1, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    new-instance v16, Ldefpackage/oq4;

    .line 640
    .line 641
    const-string v21, "0"

    .line 642
    .line 643
    const/16 v18, 0x1

    .line 644
    .line 645
    const/16 v17, 0x0

    .line 646
    .line 647
    const-string v19, "next_schedule_time_override_generation"

    .line 648
    .line 649
    const-string v20, "INTEGER"

    .line 650
    .line 651
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v8, v16

    .line 655
    .line 656
    const-string v10, "next_schedule_time_override_generation"

    .line 657
    .line 658
    invoke-virtual {v1, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    new-instance v14, Ldefpackage/oq4;

    .line 662
    .line 663
    const-string v19, "-256"

    .line 664
    .line 665
    const/16 v16, 0x1

    .line 666
    .line 667
    const/16 v20, 0x1

    .line 668
    .line 669
    const/4 v15, 0x0

    .line 670
    const-string v17, "stop_reason"

    .line 671
    .line 672
    const-string v18, "INTEGER"

    .line 673
    .line 674
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 675
    .line 676
    .line 677
    const-string v8, "stop_reason"

    .line 678
    .line 679
    invoke-virtual {v1, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    new-instance v15, Ldefpackage/oq4;

    .line 683
    .line 684
    const/16 v20, 0x0

    .line 685
    .line 686
    const/16 v17, 0x1

    .line 687
    .line 688
    const/16 v21, 0x0

    .line 689
    .line 690
    const/16 v16, 0x0

    .line 691
    .line 692
    const-string v18, "trace_tag"

    .line 693
    .line 694
    const-string v19, "TEXT"

    .line 695
    .line 696
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 697
    .line 698
    .line 699
    const-string v8, "trace_tag"

    .line 700
    .line 701
    invoke-virtual {v1, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    new-instance v16, Ldefpackage/oq4;

    .line 705
    .line 706
    const/16 v21, 0x0

    .line 707
    .line 708
    const/16 v18, 0x1

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const-string v19, "required_network_type"

    .line 713
    .line 714
    const-string v20, "INTEGER"

    .line 715
    .line 716
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 717
    .line 718
    .line 719
    move-object/from16 v8, v16

    .line 720
    .line 721
    const-string v10, "required_network_type"

    .line 722
    .line 723
    invoke-virtual {v1, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    new-instance v14, Ldefpackage/oq4;

    .line 727
    .line 728
    const-string v19, "x\'\'"

    .line 729
    .line 730
    const/16 v16, 0x1

    .line 731
    .line 732
    const/16 v20, 0x1

    .line 733
    .line 734
    const/4 v15, 0x0

    .line 735
    const-string v17, "required_network_request"

    .line 736
    .line 737
    const-string v18, "BLOB"

    .line 738
    .line 739
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 740
    .line 741
    .line 742
    const-string v8, "required_network_request"

    .line 743
    .line 744
    invoke-virtual {v1, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    new-instance v15, Ldefpackage/oq4;

    .line 748
    .line 749
    const/16 v20, 0x0

    .line 750
    .line 751
    const/16 v17, 0x1

    .line 752
    .line 753
    const/16 v21, 0x1

    .line 754
    .line 755
    const/16 v16, 0x0

    .line 756
    .line 757
    const-string v18, "requires_charging"

    .line 758
    .line 759
    const-string v19, "INTEGER"

    .line 760
    .line 761
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 762
    .line 763
    .line 764
    const-string v8, "requires_charging"

    .line 765
    .line 766
    invoke-virtual {v1, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    new-instance v16, Ldefpackage/oq4;

    .line 770
    .line 771
    const/16 v21, 0x0

    .line 772
    .line 773
    const/16 v18, 0x1

    .line 774
    .line 775
    const/16 v17, 0x0

    .line 776
    .line 777
    const-string v19, "requires_device_idle"

    .line 778
    .line 779
    const-string v20, "INTEGER"

    .line 780
    .line 781
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 782
    .line 783
    .line 784
    move-object/from16 v8, v16

    .line 785
    .line 786
    const-string v10, "requires_device_idle"

    .line 787
    .line 788
    invoke-virtual {v1, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    new-instance v14, Ldefpackage/oq4;

    .line 792
    .line 793
    const/16 v19, 0x0

    .line 794
    .line 795
    const/16 v16, 0x1

    .line 796
    .line 797
    const/16 v20, 0x1

    .line 798
    .line 799
    const/4 v15, 0x0

    .line 800
    const-string v17, "requires_battery_not_low"

    .line 801
    .line 802
    const-string v18, "INTEGER"

    .line 803
    .line 804
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 805
    .line 806
    .line 807
    const-string v8, "requires_battery_not_low"

    .line 808
    .line 809
    invoke-virtual {v1, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    new-instance v15, Ldefpackage/oq4;

    .line 813
    .line 814
    const/16 v20, 0x0

    .line 815
    .line 816
    const/16 v17, 0x1

    .line 817
    .line 818
    const/16 v21, 0x1

    .line 819
    .line 820
    const/16 v16, 0x0

    .line 821
    .line 822
    const-string v18, "requires_storage_not_low"

    .line 823
    .line 824
    const-string v19, "INTEGER"

    .line 825
    .line 826
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 827
    .line 828
    .line 829
    const-string v8, "requires_storage_not_low"

    .line 830
    .line 831
    invoke-virtual {v1, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    new-instance v16, Ldefpackage/oq4;

    .line 835
    .line 836
    const/16 v21, 0x0

    .line 837
    .line 838
    const/16 v18, 0x1

    .line 839
    .line 840
    const/16 v17, 0x0

    .line 841
    .line 842
    const-string v19, "trigger_content_update_delay"

    .line 843
    .line 844
    const-string v20, "INTEGER"

    .line 845
    .line 846
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 847
    .line 848
    .line 849
    move-object/from16 v8, v16

    .line 850
    .line 851
    const-string v10, "trigger_content_update_delay"

    .line 852
    .line 853
    invoke-virtual {v1, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    new-instance v14, Ldefpackage/oq4;

    .line 857
    .line 858
    const/16 v19, 0x0

    .line 859
    .line 860
    const/16 v16, 0x1

    .line 861
    .line 862
    const/16 v20, 0x1

    .line 863
    .line 864
    const/4 v15, 0x0

    .line 865
    const-string v17, "trigger_max_content_delay"

    .line 866
    .line 867
    const-string v18, "INTEGER"

    .line 868
    .line 869
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 870
    .line 871
    .line 872
    const-string v8, "trigger_max_content_delay"

    .line 873
    .line 874
    invoke-virtual {v1, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    new-instance v15, Ldefpackage/oq4;

    .line 878
    .line 879
    const/16 v20, 0x0

    .line 880
    .line 881
    const/16 v17, 0x1

    .line 882
    .line 883
    const/16 v21, 0x1

    .line 884
    .line 885
    const/16 v16, 0x0

    .line 886
    .line 887
    const-string v18, "content_uri_triggers"

    .line 888
    .line 889
    const-string v19, "BLOB"

    .line 890
    .line 891
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 892
    .line 893
    .line 894
    const-string v8, "content_uri_triggers"

    .line 895
    .line 896
    invoke-static {v1, v8, v15, v13}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 897
    .line 898
    .line 899
    move-result-object v8

    .line 900
    new-instance v10, Ljava/util/HashSet;

    .line 901
    .line 902
    invoke-direct {v10, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 903
    .line 904
    .line 905
    new-instance v11, Ldefpackage/qq4;

    .line 906
    .line 907
    filled-new-array {v7}, [Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v7

    .line 915
    filled-new-array {v9}, [Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v14

    .line 919
    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 920
    .line 921
    .line 922
    move-result-object v14

    .line 923
    const-string v15, "index_WorkSpec_schedule_requested_at"

    .line 924
    .line 925
    invoke-direct {v11, v15, v13, v7, v14}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v10, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    new-instance v7, Ldefpackage/qq4;

    .line 932
    .line 933
    filled-new-array {v3}, [Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    filled-new-array {v9}, [Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v11

    .line 945
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 946
    .line 947
    .line 948
    move-result-object v11

    .line 949
    const-string v14, "index_WorkSpec_last_enqueue_time"

    .line 950
    .line 951
    invoke-direct {v7, v14, v13, v3, v11}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v10, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    new-instance v3, Ldefpackage/rq4;

    .line 958
    .line 959
    const-string v7, "WorkSpec"

    .line 960
    .line 961
    invoke-direct {v3, v7, v1, v8, v10}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 962
    .line 963
    .line 964
    invoke-static {v0, v7}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    invoke-virtual {v3, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v7

    .line 972
    if-nez v7, :cond_1

    .line 973
    .line 974
    new-instance v0, Ldefpackage/u24;

    .line 975
    .line 976
    const-string v2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"

    .line 977
    .line 978
    invoke-static {v2, v3, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 983
    .line 984
    .line 985
    return-object v0

    .line 986
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 987
    .line 988
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 989
    .line 990
    .line 991
    new-instance v14, Ldefpackage/oq4;

    .line 992
    .line 993
    const/16 v19, 0x0

    .line 994
    .line 995
    const/16 v16, 0x1

    .line 996
    .line 997
    const/4 v15, 0x1

    .line 998
    const-string v17, "tag"

    .line 999
    .line 1000
    const-string v18, "TEXT"

    .line 1001
    .line 1002
    const/16 v20, 0x1

    .line 1003
    .line 1004
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1005
    .line 1006
    .line 1007
    const-string v3, "tag"

    .line 1008
    .line 1009
    invoke-virtual {v1, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    new-instance v15, Ldefpackage/oq4;

    .line 1013
    .line 1014
    const/16 v20, 0x0

    .line 1015
    .line 1016
    const/16 v17, 0x1

    .line 1017
    .line 1018
    const/16 v16, 0x2

    .line 1019
    .line 1020
    const-string v18, "work_spec_id"

    .line 1021
    .line 1022
    const-string v19, "TEXT"

    .line 1023
    .line 1024
    const/16 v21, 0x1

    .line 1025
    .line 1026
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1027
    .line 1028
    .line 1029
    const/4 v3, 0x1

    .line 1030
    invoke-static {v1, v4, v15, v3}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v7

    .line 1034
    new-instance v14, Ldefpackage/pq4;

    .line 1035
    .line 1036
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v8

    .line 1040
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v18

    .line 1044
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v8

    .line 1048
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v19

    .line 1052
    const-string v15, "WorkSpec"

    .line 1053
    .line 1054
    const-string v16, "CASCADE"

    .line 1055
    .line 1056
    const-string v17, "CASCADE"

    .line 1057
    .line 1058
    invoke-direct/range {v14 .. v19}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v7, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1062
    .line 1063
    .line 1064
    new-instance v8, Ljava/util/HashSet;

    .line 1065
    .line 1066
    invoke-direct {v8, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 1067
    .line 1068
    .line 1069
    new-instance v10, Ldefpackage/qq4;

    .line 1070
    .line 1071
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v11

    .line 1075
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v11

    .line 1079
    filled-new-array {v9}, [Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v14

    .line 1083
    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v14

    .line 1087
    const-string v15, "index_WorkTag_work_spec_id"

    .line 1088
    .line 1089
    invoke-direct {v10, v15, v13, v11, v14}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    new-instance v10, Ldefpackage/rq4;

    .line 1096
    .line 1097
    const-string v11, "WorkTag"

    .line 1098
    .line 1099
    invoke-direct {v10, v11, v1, v7, v8}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1100
    .line 1101
    .line 1102
    invoke-static {v0, v11}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    invoke-virtual {v10, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v7

    .line 1110
    if-nez v7, :cond_2

    .line 1111
    .line 1112
    new-instance v0, Ldefpackage/u24;

    .line 1113
    .line 1114
    const-string v2, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"

    .line 1115
    .line 1116
    invoke-static {v2, v10, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :cond_2
    new-instance v1, Ljava/util/HashMap;

    .line 1125
    .line 1126
    const/4 v7, 0x3

    .line 1127
    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    .line 1128
    .line 1129
    .line 1130
    new-instance v14, Ldefpackage/oq4;

    .line 1131
    .line 1132
    const/16 v19, 0x0

    .line 1133
    .line 1134
    const/16 v16, 0x1

    .line 1135
    .line 1136
    const/4 v15, 0x1

    .line 1137
    const-string v17, "work_spec_id"

    .line 1138
    .line 1139
    const-string v18, "TEXT"

    .line 1140
    .line 1141
    const/16 v20, 0x1

    .line 1142
    .line 1143
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v1, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    new-instance v15, Ldefpackage/oq4;

    .line 1150
    .line 1151
    const-string v20, "0"

    .line 1152
    .line 1153
    const/16 v17, 0x1

    .line 1154
    .line 1155
    const/16 v16, 0x2

    .line 1156
    .line 1157
    const-string v18, "generation"

    .line 1158
    .line 1159
    const-string v19, "INTEGER"

    .line 1160
    .line 1161
    const/16 v21, 0x1

    .line 1162
    .line 1163
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v1, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    new-instance v16, Ldefpackage/oq4;

    .line 1170
    .line 1171
    const/16 v21, 0x0

    .line 1172
    .line 1173
    const/16 v18, 0x1

    .line 1174
    .line 1175
    const/16 v17, 0x0

    .line 1176
    .line 1177
    const-string v19, "system_id"

    .line 1178
    .line 1179
    const-string v20, "INTEGER"

    .line 1180
    .line 1181
    const/16 v22, 0x1

    .line 1182
    .line 1183
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1184
    .line 1185
    .line 1186
    move-object/from16 v5, v16

    .line 1187
    .line 1188
    const-string v7, "system_id"

    .line 1189
    .line 1190
    invoke-static {v1, v7, v5, v3}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v5

    .line 1194
    new-instance v14, Ldefpackage/pq4;

    .line 1195
    .line 1196
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v7

    .line 1200
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v18

    .line 1204
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v7

    .line 1208
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v19

    .line 1212
    const-string v15, "WorkSpec"

    .line 1213
    .line 1214
    const-string v16, "CASCADE"

    .line 1215
    .line 1216
    const-string v17, "CASCADE"

    .line 1217
    .line 1218
    invoke-direct/range {v14 .. v19}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v5, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    new-instance v7, Ljava/util/HashSet;

    .line 1225
    .line 1226
    invoke-direct {v7, v13}, Ljava/util/HashSet;-><init>(I)V

    .line 1227
    .line 1228
    .line 1229
    new-instance v8, Ldefpackage/rq4;

    .line 1230
    .line 1231
    const-string v10, "SystemIdInfo"

    .line 1232
    .line 1233
    invoke-direct {v8, v10, v1, v5, v7}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1234
    .line 1235
    .line 1236
    invoke-static {v0, v10}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    invoke-virtual {v8, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v5

    .line 1244
    if-nez v5, :cond_3

    .line 1245
    .line 1246
    new-instance v0, Ldefpackage/u24;

    .line 1247
    .line 1248
    const-string v2, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"

    .line 1249
    .line 1250
    invoke-static {v2, v8, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 1259
    .line 1260
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1261
    .line 1262
    .line 1263
    new-instance v14, Ldefpackage/oq4;

    .line 1264
    .line 1265
    const/16 v19, 0x0

    .line 1266
    .line 1267
    const/16 v16, 0x1

    .line 1268
    .line 1269
    const/4 v15, 0x1

    .line 1270
    const-string v17, "name"

    .line 1271
    .line 1272
    const-string v18, "TEXT"

    .line 1273
    .line 1274
    const/16 v20, 0x1

    .line 1275
    .line 1276
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1277
    .line 1278
    .line 1279
    const-string v5, "name"

    .line 1280
    .line 1281
    invoke-virtual {v1, v5, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    new-instance v15, Ldefpackage/oq4;

    .line 1285
    .line 1286
    const/16 v20, 0x0

    .line 1287
    .line 1288
    const/16 v17, 0x1

    .line 1289
    .line 1290
    const/16 v16, 0x2

    .line 1291
    .line 1292
    const-string v18, "work_spec_id"

    .line 1293
    .line 1294
    const-string v19, "TEXT"

    .line 1295
    .line 1296
    const/16 v21, 0x1

    .line 1297
    .line 1298
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1299
    .line 1300
    .line 1301
    invoke-static {v1, v4, v15, v3}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v5

    .line 1305
    new-instance v14, Ldefpackage/pq4;

    .line 1306
    .line 1307
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v7

    .line 1311
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v18

    .line 1315
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v7

    .line 1319
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v19

    .line 1323
    const-string v15, "WorkSpec"

    .line 1324
    .line 1325
    const-string v16, "CASCADE"

    .line 1326
    .line 1327
    const-string v17, "CASCADE"

    .line 1328
    .line 1329
    invoke-direct/range {v14 .. v19}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v5, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    new-instance v7, Ljava/util/HashSet;

    .line 1336
    .line 1337
    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 1338
    .line 1339
    .line 1340
    new-instance v8, Ldefpackage/qq4;

    .line 1341
    .line 1342
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v10

    .line 1346
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v10

    .line 1350
    filled-new-array {v9}, [Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v9

    .line 1354
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v9

    .line 1358
    const-string v11, "index_WorkName_work_spec_id"

    .line 1359
    .line 1360
    invoke-direct {v8, v11, v13, v10, v9}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    new-instance v8, Ldefpackage/rq4;

    .line 1367
    .line 1368
    const-string v9, "WorkName"

    .line 1369
    .line 1370
    invoke-direct {v8, v9, v1, v5, v7}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1371
    .line 1372
    .line 1373
    invoke-static {v0, v9}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    invoke-virtual {v8, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v5

    .line 1381
    if-nez v5, :cond_4

    .line 1382
    .line 1383
    new-instance v0, Ldefpackage/u24;

    .line 1384
    .line 1385
    const-string v2, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"

    .line 1386
    .line 1387
    invoke-static {v2, v8, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    return-object v0

    .line 1395
    :cond_4
    new-instance v1, Ljava/util/HashMap;

    .line 1396
    .line 1397
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1398
    .line 1399
    .line 1400
    new-instance v14, Ldefpackage/oq4;

    .line 1401
    .line 1402
    const/16 v19, 0x0

    .line 1403
    .line 1404
    const/16 v16, 0x1

    .line 1405
    .line 1406
    const/4 v15, 0x1

    .line 1407
    const-string v17, "work_spec_id"

    .line 1408
    .line 1409
    const-string v18, "TEXT"

    .line 1410
    .line 1411
    const/16 v20, 0x1

    .line 1412
    .line 1413
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v1, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1417
    .line 1418
    .line 1419
    new-instance v15, Ldefpackage/oq4;

    .line 1420
    .line 1421
    const/16 v20, 0x0

    .line 1422
    .line 1423
    const/16 v17, 0x1

    .line 1424
    .line 1425
    const/16 v16, 0x0

    .line 1426
    .line 1427
    const-string v18, "progress"

    .line 1428
    .line 1429
    const-string v19, "BLOB"

    .line 1430
    .line 1431
    const/16 v21, 0x1

    .line 1432
    .line 1433
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1434
    .line 1435
    .line 1436
    const-string v5, "progress"

    .line 1437
    .line 1438
    invoke-static {v1, v5, v15, v3}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    new-instance v14, Ldefpackage/pq4;

    .line 1443
    .line 1444
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v4

    .line 1448
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v18

    .line 1452
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v4

    .line 1456
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v19

    .line 1460
    const-string v15, "WorkSpec"

    .line 1461
    .line 1462
    const-string v16, "CASCADE"

    .line 1463
    .line 1464
    const-string v17, "CASCADE"

    .line 1465
    .line 1466
    invoke-direct/range {v14 .. v19}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v5, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1470
    .line 1471
    .line 1472
    new-instance v4, Ljava/util/HashSet;

    .line 1473
    .line 1474
    invoke-direct {v4, v13}, Ljava/util/HashSet;-><init>(I)V

    .line 1475
    .line 1476
    .line 1477
    new-instance v7, Ldefpackage/rq4;

    .line 1478
    .line 1479
    const-string v8, "WorkProgress"

    .line 1480
    .line 1481
    invoke-direct {v7, v8, v1, v5, v4}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1482
    .line 1483
    .line 1484
    invoke-static {v0, v8}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v1

    .line 1488
    invoke-virtual {v7, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v4

    .line 1492
    if-nez v4, :cond_5

    .line 1493
    .line 1494
    new-instance v0, Ldefpackage/u24;

    .line 1495
    .line 1496
    const-string v2, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"

    .line 1497
    .line 1498
    invoke-static {v2, v7, v6, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    invoke-direct {v0, v13, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1503
    .line 1504
    .line 1505
    return-object v0

    .line 1506
    :cond_5
    new-instance v1, Ljava/util/HashMap;

    .line 1507
    .line 1508
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1509
    .line 1510
    .line 1511
    new-instance v14, Ldefpackage/oq4;

    .line 1512
    .line 1513
    const/16 v19, 0x0

    .line 1514
    .line 1515
    const/16 v16, 0x1

    .line 1516
    .line 1517
    const/4 v15, 0x1

    .line 1518
    const-string v17, "key"

    .line 1519
    .line 1520
    const-string v18, "TEXT"

    .line 1521
    .line 1522
    const/16 v20, 0x1

    .line 1523
    .line 1524
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1525
    .line 1526
    .line 1527
    const-string v2, "key"

    .line 1528
    .line 1529
    invoke-virtual {v1, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    new-instance v15, Ldefpackage/oq4;

    .line 1533
    .line 1534
    const/16 v20, 0x0

    .line 1535
    .line 1536
    const/16 v17, 0x1

    .line 1537
    .line 1538
    const/16 v16, 0x0

    .line 1539
    .line 1540
    const-string v18, "long_value"

    .line 1541
    .line 1542
    const-string v19, "INTEGER"

    .line 1543
    .line 1544
    const/16 v21, 0x0

    .line 1545
    .line 1546
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1547
    .line 1548
    .line 1549
    const-string v2, "long_value"

    .line 1550
    .line 1551
    invoke-static {v1, v2, v15, v13}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v2

    .line 1555
    new-instance v4, Ljava/util/HashSet;

    .line 1556
    .line 1557
    invoke-direct {v4, v13}, Ljava/util/HashSet;-><init>(I)V

    .line 1558
    .line 1559
    .line 1560
    new-instance v5, Ldefpackage/rq4;

    .line 1561
    .line 1562
    const-string v7, "Preference"

    .line 1563
    .line 1564
    invoke-direct {v5, v7, v1, v2, v4}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1565
    .line 1566
    .line 1567
    invoke-static {v0, v7}, Ldefpackage/rq4;->a(Ldefpackage/we1;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    invoke-virtual {v5, v0}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    move-result v1

    .line 1575
    if-nez v1, :cond_6

    .line 1576
    .line 1577
    new-instance v1, Ldefpackage/u24;

    .line 1578
    .line 1579
    const-string v2, "Preference(androidx.work.impl.model.Preference).\n Expected:\n"

    .line 1580
    .line 1581
    invoke-static {v2, v5, v6, v0}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    invoke-direct {v1, v13, v0}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    return-object v1

    .line 1589
    :cond_6
    new-instance v0, Ldefpackage/u24;

    .line 1590
    .line 1591
    const/4 v1, 0x0

    .line 1592
    invoke-direct {v0, v3, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    return-object v0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ldefpackage/fg5;

    .line 2
    .line 3
    check-cast p2, Ldefpackage/cr4;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ldefpackage/bg5;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/h95;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/kr4;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p1, Ldefpackage/af5;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget v1, Ldefpackage/mf5;->a:I

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v2}, Ldefpackage/kr4;->writeToParcel(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    :try_start_0
    iget-object p0, p1, Ldefpackage/af5;->f:Landroid/os/IBinder;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-interface {p0, v1, v0, p1, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ldefpackage/cr4;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 55
    .line 56
    .line 57
    throw p0
.end method
