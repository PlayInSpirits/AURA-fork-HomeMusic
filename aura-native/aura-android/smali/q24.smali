.class public final Lq24;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Li30;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Lss2;

.field public i:Z

.field public final j:Lr24;

.field public final k:J

.field public final l:Lpz1;

.field public final m:Ljava/util/LinkedHashSet;

.field public final n:Ljava/util/LinkedHashSet;

.field public final o:Ljava/util/ArrayList;

.field public p:Z

.field public q:Z

.field public final r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lq24;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lq24;->e:Ljava/util/ArrayList;

    .line 20
    .line 21
    sget-object v0, Lr24;->n:Lr24;

    .line 22
    .line 23
    iput-object v0, p0, Lq24;->j:Lr24;

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    iput-wide v0, p0, Lq24;->k:J

    .line 28
    .line 29
    new-instance v0, Lpz1;

    .line 30
    .line 31
    const/16 v1, 0x13

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lpz1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lq24;->l:Lpz1;

    .line 37
    .line 38
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lq24;->m:Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lq24;->n:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lq24;->o:Ljava/util/ArrayList;

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Lq24;->p:Z

    .line 61
    .line 62
    iput-boolean v0, p0, Lq24;->r:Z

    .line 63
    .line 64
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, p0, Lq24;->a:Li30;

    .line 69
    .line 70
    iput-object p1, p0, Lq24;->b:Landroid/content/Context;

    .line 71
    .line 72
    iput-object p3, p0, Lq24;->c:Ljava/lang/String;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final varargs a([Ljw2;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    iget v4, v3, Ljw2;->a:I

    .line 9
    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, Lq24;->n:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget v3, v3, Ljw2;->b:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v0, p1

    .line 32
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [Ljw2;

    .line 37
    .line 38
    iget-object p0, p0, Lq24;->l:Lpz1;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    array-length v0, p1

    .line 44
    :goto_1
    if-ge v1, v0, :cond_1

    .line 45
    .line 46
    aget-object v2, p1, v1

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lpz1;->n(Ljw2;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    return-void
.end method

.method public final b()Ls24;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq24;->f:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    sget-object v1, Lei;->l:Ldi;

    .line 12
    .line 13
    iput-object v1, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object v1, v0, Lq24;->f:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v2, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-object v1, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    iput-object v1, v0, Lq24;->f:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    :cond_2
    :goto_0
    iget-object v1, v0, Lq24;->n:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v15, v0, Lq24;->m:Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x0

    .line 48
    if-nez v2, :cond_4

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "

    .line 82
    .line 83
    invoke-static {v2, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_4
    iget-object v1, v0, Lq24;->h:Lss2;

    .line 92
    .line 93
    const/16 v2, 0x10

    .line 94
    .line 95
    if-nez v1, :cond_5

    .line 96
    .line 97
    new-instance v1, Ly41;

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ly41;-><init>(I)V

    .line 100
    .line 101
    .line 102
    :cond_5
    move-object v5, v1

    .line 103
    iget-wide v6, v0, Lq24;->k:J

    .line 104
    .line 105
    const-wide/16 v8, 0x0

    .line 106
    .line 107
    cmp-long v1, v6, v8

    .line 108
    .line 109
    const/16 v24, 0x0

    .line 110
    .line 111
    const/4 v4, 0x1

    .line 112
    if-lez v1, :cond_6

    .line 113
    .line 114
    move v1, v4

    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move/from16 v1, v24

    .line 117
    .line 118
    :goto_2
    const-string v6, "Required value was null."

    .line 119
    .line 120
    if-eqz v1, :cond_8

    .line 121
    .line 122
    iget-object v0, v0, Lq24;->c:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v3

    .line 130
    :cond_7
    const-string v0, "Cannot create auto-closing database for an in-memory database."

    .line 131
    .line 132
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v3

    .line 136
    :cond_8
    move v1, v2

    .line 137
    new-instance v2, Lli0;

    .line 138
    .line 139
    iget-boolean v8, v0, Lq24;->i:Z

    .line 140
    .line 141
    iget-object v7, v0, Lq24;->j:Lr24;

    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-object v9, v3

    .line 147
    iget-object v3, v0, Lq24;->b:Landroid/content/Context;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v10, Lr24;->n:Lr24;

    .line 153
    .line 154
    if-eq v7, v10, :cond_9

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_9
    const-string v7, "activity"

    .line 158
    .line 159
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    instance-of v10, v7, Landroid/app/ActivityManager;

    .line 164
    .line 165
    if-eqz v10, :cond_a

    .line 166
    .line 167
    check-cast v7, Landroid/app/ActivityManager;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    move-object v7, v9

    .line 171
    :goto_3
    if-eqz v7, :cond_b

    .line 172
    .line 173
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-nez v7, :cond_b

    .line 178
    .line 179
    sget-object v7, Lr24;->p:Lr24;

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_b
    sget-object v7, Lr24;->o:Lr24;

    .line 183
    .line 184
    :goto_4
    iget-object v10, v0, Lq24;->f:Ljava/util/concurrent/Executor;

    .line 185
    .line 186
    if-eqz v10, :cond_36

    .line 187
    .line 188
    iget-object v11, v0, Lq24;->g:Ljava/util/concurrent/Executor;

    .line 189
    .line 190
    if-eqz v11, :cond_35

    .line 191
    .line 192
    iget-boolean v13, v0, Lq24;->p:Z

    .line 193
    .line 194
    iget-boolean v14, v0, Lq24;->q:Z

    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x0

    .line 199
    .line 200
    move v6, v4

    .line 201
    iget-object v4, v0, Lq24;->c:Ljava/lang/String;

    .line 202
    .line 203
    move v12, v6

    .line 204
    iget-object v6, v0, Lq24;->l:Lpz1;

    .line 205
    .line 206
    move-object/from16 v16, v9

    .line 207
    .line 208
    move-object v9, v7

    .line 209
    iget-object v7, v0, Lq24;->d:Ljava/util/ArrayList;

    .line 210
    .line 211
    move/from16 v17, v12

    .line 212
    .line 213
    move-object/from16 v18, v16

    .line 214
    .line 215
    const/16 v16, 0x0

    .line 216
    .line 217
    move/from16 v19, v17

    .line 218
    .line 219
    const/16 v17, 0x0

    .line 220
    .line 221
    move-object/from16 v20, v18

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    iget-object v1, v0, Lq24;->e:Ljava/util/ArrayList;

    .line 226
    .line 227
    iget-object v12, v0, Lq24;->o:Ljava/util/ArrayList;

    .line 228
    .line 229
    const/16 v26, 0x10

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    move/from16 v20, v19

    .line 234
    .line 235
    move-object/from16 v19, v1

    .line 236
    .line 237
    move/from16 v1, v20

    .line 238
    .line 239
    move-object/from16 v20, v12

    .line 240
    .line 241
    const/4 v12, 0x0

    .line 242
    invoke-direct/range {v2 .. v23}, Lli0;-><init>(Landroid/content/Context;Ljava/lang/String;Lro4;Lpz1;Ljava/util/List;ZLr24;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLy34;Lne0;)V

    .line 243
    .line 244
    .line 245
    iget-boolean v3, v0, Lq24;->r:Z

    .line 246
    .line 247
    iput-boolean v3, v2, Lli0;->v:Z

    .line 248
    .line 249
    iget-object v0, v0, Lq24;->a:Li30;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Li30;->a()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_c

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-nez v0, :cond_d

    .line 272
    .line 273
    :cond_c
    const-string v0, ""

    .line 274
    .line 275
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_e

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    add-int/2addr v5, v1

    .line 294
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    :goto_5
    const/16 v5, 0x5f

    .line 299
    .line 300
    const/16 v6, 0x2e

    .line 301
    .line 302
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    const-string v5, "_Impl"

    .line 310
    .line 311
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-nez v5, :cond_f

    .line 320
    .line 321
    move-object v0, v4

    .line 322
    goto :goto_6

    .line 323
    :cond_f
    new-instance v5, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-static {v0, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    const/4 v9, 0x0

    .line 353
    invoke-virtual {v0, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 361
    check-cast v0, Ls24;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-boolean v3, v2, Lli0;->v:Z

    .line 367
    .line 368
    iput-boolean v3, v0, Ls24;->j:Z

    .line 369
    .line 370
    :try_start_1
    invoke-virtual {v0}, Ls24;->e()Lqz0;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Lp63; {:try_start_1 .. :try_end_1} :catch_0

    .line 375
    .line 376
    .line 377
    goto :goto_7

    .line 378
    :catch_0
    const/4 v3, 0x0

    .line 379
    :goto_7
    if-nez v3, :cond_10

    .line 380
    .line 381
    new-instance v3, Lp24;

    .line 382
    .line 383
    new-instance v4, Lkl3;

    .line 384
    .line 385
    const/4 v5, 0x4

    .line 386
    invoke-direct {v4, v5, v0}, Lkl3;-><init>(ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-direct {v3, v2, v4}, Lp24;-><init>(Lli0;Lkl3;)V

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_10
    new-instance v4, Lp24;

    .line 394
    .line 395
    invoke-direct {v4, v2, v3}, Lp24;-><init>(Lli0;Lqz0;)V

    .line 396
    .line 397
    .line 398
    move-object v3, v4

    .line 399
    :goto_8
    iput-object v3, v0, Ls24;->d:Lp24;

    .line 400
    .line 401
    invoke-virtual {v0}, Ls24;->d()Ls12;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    iput-object v3, v0, Ls24;->e:Ls12;

    .line 406
    .line 407
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 408
    .line 409
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ls24;->k()Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, Ljava/lang/Iterable;

    .line 417
    .line 418
    new-instance v5, Ljava/util/ArrayList;

    .line 419
    .line 420
    const/16 v6, 0xa

    .line 421
    .line 422
    invoke-static {v4, v6}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    if-eqz v7, :cond_11

    .line 438
    .line 439
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    check-cast v7, Ljava/lang/Class;

    .line 444
    .line 445
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {v7}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    goto :goto_9

    .line 456
    :cond_11
    invoke-static {v5}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    new-array v7, v5, [Z

    .line 465
    .line 466
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    const/4 v9, -0x1

    .line 475
    iget-object v10, v2, Lli0;->r:Ljava/util/List;

    .line 476
    .line 477
    if-eqz v8, :cond_16

    .line 478
    .line 479
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    check-cast v8, Li30;

    .line 484
    .line 485
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    add-int/2addr v11, v9

    .line 490
    if-ltz v11, :cond_14

    .line 491
    .line 492
    :goto_b
    add-int/lit8 v12, v11, -0x1

    .line 493
    .line 494
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v13

    .line 498
    invoke-virtual {v8, v13}, Li30;->d(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v13

    .line 502
    if-eqz v13, :cond_12

    .line 503
    .line 504
    aput-boolean v1, v7, v11

    .line 505
    .line 506
    move v9, v11

    .line 507
    goto :goto_c

    .line 508
    :cond_12
    if-gez v12, :cond_13

    .line 509
    .line 510
    goto :goto_c

    .line 511
    :cond_13
    move v11, v12

    .line 512
    goto :goto_b

    .line 513
    :cond_14
    :goto_c
    if-ltz v9, :cond_15

    .line 514
    .line 515
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v9

    .line 519
    invoke-interface {v3, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_15
    invoke-virtual {v8}, Li30;->b()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v1, ") is missing in the database configuration."

    .line 528
    .line 529
    const-string v2, "A required auto migration spec ("

    .line 530
    .line 531
    invoke-static {v0, v1, v2}, Lnz2;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    const/16 v25, 0x0

    .line 535
    .line 536
    return-object v25

    .line 537
    :cond_16
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    add-int/2addr v4, v9

    .line 542
    if-ltz v4, :cond_19

    .line 543
    .line 544
    :goto_d
    add-int/lit8 v8, v4, -0x1

    .line 545
    .line 546
    if-ge v4, v5, :cond_18

    .line 547
    .line 548
    aget-boolean v4, v7, v4

    .line 549
    .line 550
    if-eqz v4, :cond_18

    .line 551
    .line 552
    if-gez v8, :cond_17

    .line 553
    .line 554
    goto :goto_e

    .line 555
    :cond_17
    move v4, v8

    .line 556
    goto :goto_d

    .line 557
    :cond_18
    const-string v0, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    .line 558
    .line 559
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    const/16 v25, 0x0

    .line 563
    .line 564
    return-object v25

    .line 565
    :cond_19
    :goto_e
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 566
    .line 567
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    invoke-static {v5}, Llg2;->W(I)I

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    check-cast v3, Ljava/lang/Iterable;

    .line 583
    .line 584
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    if-eqz v5, :cond_1a

    .line 593
    .line 594
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    check-cast v5, Ljava/util/Map$Entry;

    .line 599
    .line 600
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    check-cast v7, Li30;

    .line 605
    .line 606
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v7}, Li30;->a()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v7

    .line 613
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    goto :goto_f

    .line 624
    :cond_1a
    invoke-virtual {v0, v4}, Ls24;->g(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    :cond_1b
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v4

    .line 636
    if-eqz v4, :cond_1e

    .line 637
    .line 638
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    check-cast v4, Ljw2;

    .line 643
    .line 644
    iget v5, v4, Ljw2;->a:I

    .line 645
    .line 646
    iget v7, v4, Ljw2;->b:I

    .line 647
    .line 648
    iget-object v8, v2, Lli0;->d:Lpz1;

    .line 649
    .line 650
    iget-object v10, v8, Lpz1;->o:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v10, Ljava/util/LinkedHashMap;

    .line 653
    .line 654
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v11

    .line 658
    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    if-eqz v11, :cond_1d

    .line 663
    .line 664
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    check-cast v5, Ljava/util/Map;

    .line 673
    .line 674
    if-nez v5, :cond_1c

    .line 675
    .line 676
    sget-object v5, Lv01;->n:Lv01;

    .line 677
    .line 678
    :cond_1c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 679
    .line 680
    .line 681
    move-result-object v7

    .line 682
    invoke-interface {v5, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    goto :goto_11

    .line 687
    :cond_1d
    move/from16 v5, v24

    .line 688
    .line 689
    :goto_11
    if-nez v5, :cond_1b

    .line 690
    .line 691
    invoke-virtual {v8, v4}, Lpz1;->n(Ljw2;)V

    .line 692
    .line 693
    .line 694
    goto :goto_10

    .line 695
    :cond_1e
    invoke-virtual {v0}, Ls24;->l()Ljava/util/Map;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    check-cast v3, Ljava/lang/Iterable;

    .line 704
    .line 705
    invoke-static {v3, v6}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 706
    .line 707
    .line 708
    move-result v4

    .line 709
    invoke-static {v4}, Llg2;->W(I)I

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    const/16 v5, 0x10

    .line 714
    .line 715
    if-ge v4, v5, :cond_1f

    .line 716
    .line 717
    move v4, v5

    .line 718
    :cond_1f
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 719
    .line 720
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 721
    .line 722
    .line 723
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    if-eqz v4, :cond_21

    .line 732
    .line 733
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    check-cast v4, Ljava/util/Map$Entry;

    .line 738
    .line 739
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v7

    .line 743
    check-cast v7, Ljava/lang/Class;

    .line 744
    .line 745
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    check-cast v4, Ljava/util/List;

    .line 750
    .line 751
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {v7}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 755
    .line 756
    .line 757
    move-result-object v7

    .line 758
    new-instance v8, Ljava/util/ArrayList;

    .line 759
    .line 760
    invoke-static {v4, v6}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 761
    .line 762
    .line 763
    move-result v10

    .line 764
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 772
    .line 773
    .line 774
    move-result v10

    .line 775
    if-eqz v10, :cond_20

    .line 776
    .line 777
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v10

    .line 781
    check-cast v10, Ljava/lang/Class;

    .line 782
    .line 783
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    invoke-static {v10}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 787
    .line 788
    .line 789
    move-result-object v10

    .line 790
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    goto :goto_13

    .line 794
    :cond_20
    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    goto :goto_12

    .line 798
    :cond_21
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    new-array v3, v3, [Z

    .line 803
    .line 804
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    :cond_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    iget-object v6, v2, Lli0;->q:Ljava/util/List;

    .line 817
    .line 818
    if-eqz v5, :cond_27

    .line 819
    .line 820
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    check-cast v5, Ljava/util/Map$Entry;

    .line 825
    .line 826
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    check-cast v7, Li30;

    .line 831
    .line 832
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    check-cast v5, Ljava/util/List;

    .line 837
    .line 838
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    if-eqz v8, :cond_22

    .line 847
    .line 848
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v8

    .line 852
    check-cast v8, Li30;

    .line 853
    .line 854
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 855
    .line 856
    .line 857
    move-result v10

    .line 858
    add-int/2addr v10, v9

    .line 859
    if-ltz v10, :cond_25

    .line 860
    .line 861
    :goto_15
    add-int/lit8 v11, v10, -0x1

    .line 862
    .line 863
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v12

    .line 867
    invoke-virtual {v8, v12}, Li30;->d(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v12

    .line 871
    if-eqz v12, :cond_23

    .line 872
    .line 873
    aput-boolean v1, v3, v10

    .line 874
    .line 875
    goto :goto_17

    .line 876
    :cond_23
    if-gez v11, :cond_24

    .line 877
    .line 878
    goto :goto_16

    .line 879
    :cond_24
    move v10, v11

    .line 880
    goto :goto_15

    .line 881
    :cond_25
    :goto_16
    move v10, v9

    .line 882
    :goto_17
    if-ltz v10, :cond_26

    .line 883
    .line 884
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v10

    .line 888
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    iget-object v11, v0, Ls24;->i:Ljava/util/LinkedHashMap;

    .line 895
    .line 896
    invoke-interface {v11, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    goto :goto_14

    .line 900
    :cond_26
    invoke-virtual {v8}, Li30;->b()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-virtual {v7}, Li30;->b()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    new-instance v2, Ljava/lang/StringBuilder;

    .line 909
    .line 910
    const-string v3, "A required type converter ("

    .line 911
    .line 912
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 916
    .line 917
    .line 918
    const-string v0, ") for "

    .line 919
    .line 920
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    const-string v0, " is missing in the database configuration."

    .line 927
    .line 928
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 936
    .line 937
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    throw v1

    .line 945
    :cond_27
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    add-int/2addr v4, v9

    .line 950
    if-ltz v4, :cond_2a

    .line 951
    .line 952
    :goto_18
    add-int/lit8 v5, v4, -0x1

    .line 953
    .line 954
    aget-boolean v7, v3, v4

    .line 955
    .line 956
    if-eqz v7, :cond_29

    .line 957
    .line 958
    if-gez v5, :cond_28

    .line 959
    .line 960
    goto :goto_19

    .line 961
    :cond_28
    move v4, v5

    .line 962
    goto :goto_18

    .line 963
    :cond_29
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    const-string v1, "Unexpected type converter "

    .line 968
    .line 969
    const-string v2, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    .line 970
    .line 971
    invoke-static {v0, v2, v1}, Lnz2;->A(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    const/16 v25, 0x0

    .line 975
    .line 976
    return-object v25

    .line 977
    :cond_2a
    :goto_19
    iget-object v3, v2, Lli0;->h:Ljava/util/concurrent/Executor;

    .line 978
    .line 979
    iput-object v3, v0, Ls24;->b:Ljava/util/concurrent/Executor;

    .line 980
    .line 981
    new-instance v3, Lia4;

    .line 982
    .line 983
    iget-object v4, v2, Lli0;->i:Ljava/util/concurrent/Executor;

    .line 984
    .line 985
    invoke-direct {v3, v4, v1}, Lia4;-><init>(Ljava/util/concurrent/Executor;I)V

    .line 986
    .line 987
    .line 988
    iput-object v3, v0, Ls24;->c:Lia4;

    .line 989
    .line 990
    iget-object v1, v0, Ls24;->b:Ljava/util/concurrent/Executor;

    .line 991
    .line 992
    if-eqz v1, :cond_34

    .line 993
    .line 994
    invoke-static {v1}, Lkb4;->w(Ljava/util/concurrent/Executor;)Lpe0;

    .line 995
    .line 996
    .line 997
    move-result-object v1

    .line 998
    new-instance v3, Lfo4;

    .line 999
    .line 1000
    const/4 v9, 0x0

    .line 1001
    invoke-direct {v3, v9}, Lt22;-><init>(Ls22;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-static {v1, v3}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-static {v1}, Lte5;->a(Lne0;)Ltd0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v1

    .line 1012
    iput-object v1, v0, Ls24;->a:Ltd0;

    .line 1013
    .line 1014
    iget-object v1, v1, Ltd0;->n:Lne0;

    .line 1015
    .line 1016
    iget-object v3, v0, Ls24;->c:Lia4;

    .line 1017
    .line 1018
    if-eqz v3, :cond_33

    .line 1019
    .line 1020
    invoke-static {v3}, Lkb4;->w(Ljava/util/concurrent/Executor;)Lpe0;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    invoke-interface {v1, v3}, Lne0;->J(Lne0;)Lne0;

    .line 1025
    .line 1026
    .line 1027
    iget-boolean v1, v2, Lli0;->f:Z

    .line 1028
    .line 1029
    iput-boolean v1, v0, Ls24;->g:Z

    .line 1030
    .line 1031
    iget-object v1, v0, Ls24;->d:Lp24;

    .line 1032
    .line 1033
    const-string v2, "connectionManager"

    .line 1034
    .line 1035
    if-eqz v1, :cond_32

    .line 1036
    .line 1037
    invoke-virtual {v1}, Lp24;->c()Lso4;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    if-nez v1, :cond_2c

    .line 1042
    .line 1043
    :cond_2b
    const/4 v3, 0x0

    .line 1044
    goto :goto_1b

    .line 1045
    :cond_2c
    move-object v3, v1

    .line 1046
    :goto_1a
    nop

    .line 1047
    instance-of v1, v3, Llo3;

    .line 1048
    .line 1049
    if-eqz v1, :cond_2d

    .line 1050
    .line 1051
    goto :goto_1b

    .line 1052
    :cond_2d
    instance-of v1, v3, Lgo0;

    .line 1053
    .line 1054
    if-eqz v1, :cond_2b

    .line 1055
    .line 1056
    check-cast v3, Lgo0;

    .line 1057
    .line 1058
    invoke-interface {v3}, Lgo0;->b()Lso4;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    goto :goto_1a

    .line 1063
    :goto_1b
    check-cast v3, Llo3;

    .line 1064
    .line 1065
    iget-object v1, v0, Ls24;->d:Lp24;

    .line 1066
    .line 1067
    if-eqz v1, :cond_31

    .line 1068
    .line 1069
    invoke-virtual {v1}, Lp24;->c()Lso4;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v1

    .line 1073
    if-nez v1, :cond_2f

    .line 1074
    .line 1075
    :cond_2e
    const/4 v3, 0x0

    .line 1076
    goto :goto_1d

    .line 1077
    :cond_2f
    move-object v3, v1

    .line 1078
    :goto_1c
    nop

    .line 1079
    instance-of v1, v3, Lpn;

    .line 1080
    .line 1081
    if-eqz v1, :cond_30

    .line 1082
    .line 1083
    goto :goto_1d

    .line 1084
    :cond_30
    instance-of v1, v3, Lgo0;

    .line 1085
    .line 1086
    if-eqz v1, :cond_2e

    .line 1087
    .line 1088
    check-cast v3, Lgo0;

    .line 1089
    .line 1090
    invoke-interface {v3}, Lgo0;->b()Lso4;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v3

    .line 1094
    goto :goto_1c

    .line 1095
    :goto_1d
    check-cast v3, Lpn;

    .line 1096
    .line 1097
    return-object v0

    .line 1098
    :cond_31
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    const/16 v25, 0x0

    .line 1102
    .line 1103
    throw v25

    .line 1104
    :cond_32
    const/16 v25, 0x0

    .line 1105
    .line 1106
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    throw v25

    .line 1110
    :cond_33
    const/16 v25, 0x0

    .line 1111
    .line 1112
    const-string v0, "internalTransactionExecutor"

    .line 1113
    .line 1114
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    throw v25

    .line 1118
    :cond_34
    const/16 v25, 0x0

    .line 1119
    .line 1120
    const-string v0, "internalQueryExecutor"

    .line 1121
    .line 1122
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    throw v25

    .line 1126
    :catch_1
    move-exception v0

    .line 1127
    goto :goto_1e

    .line 1128
    :catch_2
    move-exception v0

    .line 1129
    goto :goto_1f

    .line 1130
    :catch_3
    move-exception v0

    .line 1131
    goto :goto_20

    .line 1132
    :goto_1e
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1133
    .line 1134
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    const-string v4, "Failed to create an instance of "

    .line 1141
    .line 1142
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1153
    .line 1154
    .line 1155
    throw v1

    .line 1156
    :goto_1f
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1157
    .line 1158
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v2

    .line 1162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    const-string v4, "Cannot access the constructor "

    .line 1165
    .line 1166
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1177
    .line 1178
    .line 1179
    throw v1

    .line 1180
    :goto_20
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1181
    .line 1182
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    const-string v5, "Cannot find implementation for "

    .line 1189
    .line 1190
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1194
    .line 1195
    .line 1196
    const-string v2, ". "

    .line 1197
    .line 1198
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1202
    .line 1203
    .line 1204
    const-string v2, " does not exist. Is Room annotation processor correctly configured?"

    .line 1205
    .line 1206
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1214
    .line 1215
    .line 1216
    throw v1

    .line 1217
    :cond_35
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    const/16 v25, 0x0

    .line 1221
    .line 1222
    return-object v25

    .line 1223
    :cond_36
    move-object/from16 v25, v9

    .line 1224
    .line 1225
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    return-object v25
.end method
