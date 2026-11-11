.class public final Lxm0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxm0;->a:Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static final f(Landroid/view/ViewGroup;Lld1;)Lxm0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lld1;->G()Ly41;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x7f0a05a9

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Lxm0;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Lxm0;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Lxm0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lxm0;-><init>(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method


# virtual methods
.method public final a(IILfe1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lgz;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p3, Lfe1;->c:Lkc1;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lxm0;->d(Lkc1;)Lpj4;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, p1, p2}, Lpj4;->c(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :try_start_1
    new-instance v2, Lpj4;

    .line 28
    .line 29
    invoke-direct {v2, p1, p2, p3, v1}, Lpj4;-><init>(IILfe1;Lgz;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance p1, Loj4;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-direct {p1, p0, v2, p2}, Loj4;-><init>(Lxm0;Lpj4;I)V

    .line 41
    .line 42
    .line 43
    iget-object p2, v2, Lpj4;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Loj4;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-direct {p1, p0, v2, p2}, Loj4;-><init>(Lxm0;Lpj4;I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, v2, Lpj4;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :goto_0
    monitor-exit v0

    .line 62
    throw p0
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 13
    const-string v7, "Unknown visibility "

    .line 14
    .line 15
    const/16 v8, 0x8

    .line 16
    .line 17
    const/4 v9, 0x4

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x2

    .line 20
    if-ge v4, v3, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v12

    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    move-object v13, v12

    .line 29
    check-cast v13, Lpj4;

    .line 30
    .line 31
    iget-object v14, v13, Lpj4;->c:Lkc1;

    .line 32
    .line 33
    iget-object v14, v14, Lkc1;->T:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v14}, Landroid/view/View;->getAlpha()F

    .line 39
    .line 40
    .line 41
    move-result v15

    .line 42
    cmpg-float v15, v15, v10

    .line 43
    .line 44
    if-nez v15, :cond_1

    .line 45
    .line 46
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 47
    .line 48
    .line 49
    move-result v15

    .line 50
    if-nez v15, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 54
    .line 55
    .line 56
    move-result v14

    .line 57
    if-eqz v14, :cond_3

    .line 58
    .line 59
    if-eq v14, v9, :cond_0

    .line 60
    .line 61
    if-ne v14, v8, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {v14, v7}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    iget v13, v13, Lpj4;->a:I

    .line 73
    .line 74
    if-eq v13, v11, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move-object v12, v5

    .line 78
    :goto_1
    check-cast v12, Lpj4;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :cond_5
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_9

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    move-object v13, v4

    .line 99
    check-cast v13, Lpj4;

    .line 100
    .line 101
    iget-object v14, v13, Lpj4;->c:Lkc1;

    .line 102
    .line 103
    iget-object v14, v14, Lkc1;->T:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v14}, Landroid/view/View;->getAlpha()F

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    cmpg-float v15, v15, v10

    .line 113
    .line 114
    if-nez v15, :cond_6

    .line 115
    .line 116
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-nez v15, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    if-eqz v14, :cond_5

    .line 128
    .line 129
    if-eq v14, v9, :cond_8

    .line 130
    .line 131
    if-ne v14, v8, :cond_7

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-static {v14, v7}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    :goto_2
    iget v13, v13, Lpj4;->a:I

    .line 143
    .line 144
    if-ne v13, v11, :cond_5

    .line 145
    .line 146
    move-object v5, v4

    .line 147
    :cond_9
    move-object v7, v5

    .line 148
    check-cast v7, Lpj4;

    .line 149
    .line 150
    invoke-static {v11}, Lld1;->I(I)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const-string v8, " to "

    .line 155
    .line 156
    const-string v9, "FragmentManager"

    .line 157
    .line 158
    if-eqz v3, :cond_a

    .line 159
    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v4, "Executing operations from "

    .line 163
    .line 164
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v9, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    :cond_a
    new-instance v10, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v3, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    new-instance v13, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Lpj4;

    .line 203
    .line 204
    iget-object v4, v4, Lpj4;->c:Lkc1;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    const/4 v14, 0x0

    .line 211
    :goto_3
    if-ge v14, v5, :cond_b

    .line 212
    .line 213
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    add-int/lit8 v14, v14, 0x1

    .line 218
    .line 219
    check-cast v15, Lpj4;

    .line 220
    .line 221
    iget-object v15, v15, Lpj4;->c:Lkc1;

    .line 222
    .line 223
    iget-object v15, v15, Lkc1;->W:Lhc1;

    .line 224
    .line 225
    iget-object v6, v4, Lkc1;->W:Lhc1;

    .line 226
    .line 227
    iget v11, v6, Lhc1;->b:I

    .line 228
    .line 229
    iput v11, v15, Lhc1;->b:I

    .line 230
    .line 231
    iget v11, v6, Lhc1;->c:I

    .line 232
    .line 233
    iput v11, v15, Lhc1;->c:I

    .line 234
    .line 235
    iget v11, v6, Lhc1;->d:I

    .line 236
    .line 237
    iput v11, v15, Lhc1;->d:I

    .line 238
    .line 239
    iget v6, v6, Lhc1;->e:I

    .line 240
    .line 241
    iput v6, v15, Lhc1;->e:I

    .line 242
    .line 243
    const/4 v11, 0x2

    .line 244
    goto :goto_3

    .line 245
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    const/4 v5, 0x0

    .line 250
    :goto_4
    if-ge v5, v4, :cond_15

    .line 251
    .line 252
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    add-int/lit8 v5, v5, 0x1

    .line 257
    .line 258
    check-cast v11, Lpj4;

    .line 259
    .line 260
    new-instance v14, Lgz;

    .line 261
    .line 262
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v11}, Lpj4;->d()V

    .line 266
    .line 267
    .line 268
    iget-object v15, v11, Lpj4;->e:Ljava/util/LinkedHashSet;

    .line 269
    .line 270
    invoke-interface {v15, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    new-instance v6, Ltm0;

    .line 274
    .line 275
    invoke-direct {v6, v11, v14, v2}, Ltm0;-><init>(Lpj4;Lgz;Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    new-instance v6, Lgz;

    .line 282
    .line 283
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v11}, Lpj4;->d()V

    .line 287
    .line 288
    .line 289
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    new-instance v14, Lum0;

    .line 293
    .line 294
    if-eqz v2, :cond_d

    .line 295
    .line 296
    if-ne v11, v12, :cond_c

    .line 297
    .line 298
    :goto_5
    const/16 v17, 0x1

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_c
    const/16 v17, 0x0

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_d
    if-ne v11, v7, :cond_c

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :goto_6
    iget-object v15, v11, Lpj4;->c:Lkc1;

    .line 308
    .line 309
    invoke-direct {v14, v11, v6}, Lb3;-><init>(Lpj4;Lgz;)V

    .line 310
    .line 311
    .line 312
    iget v6, v11, Lpj4;->a:I

    .line 313
    .line 314
    const/4 v0, 0x2

    .line 315
    if-ne v6, v0, :cond_f

    .line 316
    .line 317
    if-eqz v2, :cond_e

    .line 318
    .line 319
    iget-object v0, v15, Lkc1;->W:Lhc1;

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_e
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_f
    if-eqz v2, :cond_10

    .line 327
    .line 328
    iget-object v0, v15, Lkc1;->W:Lhc1;

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_10
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    :goto_7
    iget v0, v11, Lpj4;->a:I

    .line 335
    .line 336
    const/4 v6, 0x2

    .line 337
    if-ne v0, v6, :cond_12

    .line 338
    .line 339
    if-eqz v2, :cond_11

    .line 340
    .line 341
    iget-object v0, v15, Lkc1;->W:Lhc1;

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_11
    iget-object v0, v15, Lkc1;->W:Lhc1;

    .line 345
    .line 346
    :cond_12
    :goto_8
    if-eqz v17, :cond_14

    .line 347
    .line 348
    if-eqz v2, :cond_13

    .line 349
    .line 350
    iget-object v0, v15, Lkc1;->W:Lhc1;

    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_13
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    :cond_14
    :goto_9
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    new-instance v0, Lk6;

    .line 360
    .line 361
    invoke-direct {v0, v13, v11, v1}, Lk6;-><init>(Ljava/util/ArrayList;Lpj4;Lxm0;)V

    .line 362
    .line 363
    .line 364
    iget-object v6, v11, Lpj4;->d:Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-object/from16 v0, p1

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_15
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 373
    .line 374
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 375
    .line 376
    .line 377
    new-instance v0, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    const/4 v4, 0x0

    .line 387
    :cond_16
    :goto_a
    if-ge v4, v2, :cond_17

    .line 388
    .line 389
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    add-int/lit8 v4, v4, 0x1

    .line 394
    .line 395
    move-object v11, v5

    .line 396
    check-cast v11, Lum0;

    .line 397
    .line 398
    invoke-virtual {v11}, Lb3;->k()Z

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    if-nez v11, :cond_16

    .line 403
    .line 404
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    const/4 v5, 0x0

    .line 418
    :goto_b
    if-ge v5, v4, :cond_18

    .line 419
    .line 420
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    add-int/lit8 v5, v5, 0x1

    .line 425
    .line 426
    check-cast v11, Lum0;

    .line 427
    .line 428
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    const/4 v4, 0x0

    .line 437
    :goto_c
    if-ge v4, v0, :cond_19

    .line 438
    .line 439
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    add-int/lit8 v4, v4, 0x1

    .line 444
    .line 445
    check-cast v5, Lum0;

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    goto :goto_c

    .line 451
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    const/4 v2, 0x0

    .line 456
    :goto_d
    if-ge v2, v0, :cond_1a

    .line 457
    .line 458
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    add-int/lit8 v2, v2, 0x1

    .line 463
    .line 464
    check-cast v4, Lum0;

    .line 465
    .line 466
    iget-object v5, v4, Lb3;->a:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v5, Lpj4;

    .line 469
    .line 470
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 471
    .line 472
    invoke-interface {v6, v5, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4}, Lb3;->d()V

    .line 476
    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 480
    .line 481
    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v11

    .line 485
    iget-object v14, v1, Lxm0;->a:Landroid/view/ViewGroup;

    .line 486
    .line 487
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 488
    .line 489
    .line 490
    move-result-object v15

    .line 491
    new-instance v0, Ljava/util/ArrayList;

    .line 492
    .line 493
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    const/4 v3, 0x0

    .line 501
    const/16 v18, 0x0

    .line 502
    .line 503
    :goto_e
    const-string v4, " has started."

    .line 504
    .line 505
    if-ge v3, v2, :cond_23

    .line 506
    .line 507
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    add-int/lit8 v19, v3, 0x1

    .line 512
    .line 513
    check-cast v5, Ltm0;

    .line 514
    .line 515
    invoke-virtual {v5}, Lb3;->k()Z

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    if-eqz v3, :cond_1b

    .line 520
    .line 521
    invoke-virtual {v5}, Lb3;->d()V

    .line 522
    .line 523
    .line 524
    :goto_f
    move-object/from16 p1, v0

    .line 525
    .line 526
    move/from16 p2, v2

    .line 527
    .line 528
    goto :goto_10

    .line 529
    :cond_1b
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5, v15}, Ltm0;->o(Landroid/content/Context;)Lxc5;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    if-nez v3, :cond_1c

    .line 537
    .line 538
    invoke-virtual {v5}, Lb3;->d()V

    .line 539
    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_1c
    iget-object v3, v3, Lxc5;->p:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v3, Landroid/animation/Animator;

    .line 545
    .line 546
    if-nez v3, :cond_1d

    .line 547
    .line 548
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    goto :goto_f

    .line 552
    :cond_1d
    move-object/from16 p1, v0

    .line 553
    .line 554
    iget-object v0, v5, Lb3;->a:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Lpj4;

    .line 557
    .line 558
    iget-object v1, v0, Lpj4;->c:Lkc1;

    .line 559
    .line 560
    move/from16 p2, v2

    .line 561
    .line 562
    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    move-object/from16 v20, v3

    .line 567
    .line 568
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-eqz v2, :cond_1f

    .line 575
    .line 576
    const/16 v16, 0x2

    .line 577
    .line 578
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_1e

    .line 583
    .line 584
    new-instance v0, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    const-string v2, "Ignoring Animator set on "

    .line 587
    .line 588
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v1, " as this Fragment was involved in a Transition."

    .line 595
    .line 596
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 604
    .line 605
    .line 606
    :cond_1e
    invoke-virtual {v5}, Lb3;->d()V

    .line 607
    .line 608
    .line 609
    :goto_10
    move-object/from16 v1, p0

    .line 610
    .line 611
    move-object/from16 v0, p1

    .line 612
    .line 613
    move/from16 v2, p2

    .line 614
    .line 615
    move/from16 v3, v19

    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_1f
    iget v2, v0, Lpj4;->a:I

    .line 619
    .line 620
    const/4 v3, 0x3

    .line 621
    if-ne v2, v3, :cond_20

    .line 622
    .line 623
    move v2, v3

    .line 624
    const/4 v3, 0x1

    .line 625
    goto :goto_11

    .line 626
    :cond_20
    move v2, v3

    .line 627
    const/4 v3, 0x0

    .line 628
    :goto_11
    if-eqz v3, :cond_21

    .line 629
    .line 630
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    :cond_21
    iget-object v1, v1, Lkc1;->T:Landroid/view/View;

    .line 634
    .line 635
    invoke-virtual {v14, v1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 636
    .line 637
    .line 638
    move-object/from16 v18, v4

    .line 639
    .line 640
    move-object v4, v0

    .line 641
    new-instance v0, Lvm0;

    .line 642
    .line 643
    move-object/from16 v21, p1

    .line 644
    .line 645
    move-object v2, v1

    .line 646
    move-object/from16 p1, v6

    .line 647
    .line 648
    move-object/from16 v22, v10

    .line 649
    .line 650
    move-object/from16 v10, v18

    .line 651
    .line 652
    move-object/from16 v6, v20

    .line 653
    .line 654
    move-object/from16 v1, p0

    .line 655
    .line 656
    move/from16 v20, p2

    .line 657
    .line 658
    invoke-direct/range {v0 .. v5}, Lvm0;-><init>(Lxm0;Landroid/view/View;ZLpj4;Ltm0;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v6, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v6, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v6}, Landroid/animation/Animator;->start()V

    .line 668
    .line 669
    .line 670
    const/16 v16, 0x2

    .line 671
    .line 672
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-eqz v0, :cond_22

    .line 677
    .line 678
    new-instance v0, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    const-string v2, "Animator from operation "

    .line 681
    .line 682
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 696
    .line 697
    .line 698
    :cond_22
    iget-object v0, v5, Lb3;->b:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Lgz;

    .line 701
    .line 702
    new-instance v2, Lef0;

    .line 703
    .line 704
    const/4 v3, 0x3

    .line 705
    invoke-direct {v2, v3, v6, v4}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0, v2}, Lgz;->a(Lfz;)V

    .line 709
    .line 710
    .line 711
    move-object/from16 v6, p1

    .line 712
    .line 713
    move/from16 v3, v19

    .line 714
    .line 715
    move/from16 v2, v20

    .line 716
    .line 717
    move-object/from16 v0, v21

    .line 718
    .line 719
    move-object/from16 v10, v22

    .line 720
    .line 721
    const/16 v18, 0x1

    .line 722
    .line 723
    goto/16 :goto_e

    .line 724
    .line 725
    :cond_23
    move-object/from16 v21, v0

    .line 726
    .line 727
    move-object v10, v4

    .line 728
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    const/4 v0, 0x0

    .line 733
    :goto_12
    if-ge v0, v6, :cond_2c

    .line 734
    .line 735
    move-object/from16 v2, v21

    .line 736
    .line 737
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    add-int/lit8 v19, v0, 0x1

    .line 742
    .line 743
    check-cast v3, Ltm0;

    .line 744
    .line 745
    iget-object v0, v3, Lb3;->a:Ljava/lang/Object;

    .line 746
    .line 747
    move-object v4, v0

    .line 748
    check-cast v4, Lpj4;

    .line 749
    .line 750
    iget-object v0, v4, Lpj4;->c:Lkc1;

    .line 751
    .line 752
    const-string v5, "Ignoring Animation set on "

    .line 753
    .line 754
    if-eqz v11, :cond_25

    .line 755
    .line 756
    const/16 v16, 0x2

    .line 757
    .line 758
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    if-eqz v4, :cond_24

    .line 763
    .line 764
    new-instance v4, Ljava/lang/StringBuilder;

    .line 765
    .line 766
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    const-string v0, " as Animations cannot run alongside Transitions."

    .line 773
    .line 774
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 782
    .line 783
    .line 784
    :cond_24
    invoke-virtual {v3}, Lb3;->d()V

    .line 785
    .line 786
    .line 787
    :goto_13
    move-object/from16 v21, v2

    .line 788
    .line 789
    :goto_14
    move/from16 v0, v19

    .line 790
    .line 791
    goto :goto_12

    .line 792
    :cond_25
    if-eqz v18, :cond_27

    .line 793
    .line 794
    const/16 v16, 0x2

    .line 795
    .line 796
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    if-eqz v4, :cond_26

    .line 801
    .line 802
    new-instance v4, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    const-string v0, " as Animations cannot run alongside Animators."

    .line 811
    .line 812
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 820
    .line 821
    .line 822
    :cond_26
    invoke-virtual {v3}, Lb3;->d()V

    .line 823
    .line 824
    .line 825
    goto :goto_13

    .line 826
    :cond_27
    iget-object v0, v0, Lkc1;->T:Landroid/view/View;

    .line 827
    .line 828
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v3, v15}, Ltm0;->o(Landroid/content/Context;)Lxc5;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    const-string v20, "Required value was null."

    .line 836
    .line 837
    if-eqz v5, :cond_2b

    .line 838
    .line 839
    iget-object v5, v5, Lxc5;->o:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v5, Landroid/view/animation/Animation;

    .line 842
    .line 843
    if-eqz v5, :cond_2a

    .line 844
    .line 845
    move-object/from16 p1, v2

    .line 846
    .line 847
    iget v2, v4, Lpj4;->a:I

    .line 848
    .line 849
    move/from16 p2, v6

    .line 850
    .line 851
    const/4 v6, 0x1

    .line 852
    if-eq v2, v6, :cond_28

    .line 853
    .line 854
    invoke-virtual {v0, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v3}, Lb3;->d()V

    .line 858
    .line 859
    .line 860
    goto :goto_15

    .line 861
    :cond_28
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 862
    .line 863
    .line 864
    new-instance v2, Lqc1;

    .line 865
    .line 866
    invoke-direct {v2, v5, v14, v0}, Lqc1;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 867
    .line 868
    .line 869
    new-instance v5, Lwm0;

    .line 870
    .line 871
    invoke-direct {v5, v4, v1, v0, v3}, Lwm0;-><init>(Lpj4;Lxm0;Landroid/view/View;Ltm0;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 878
    .line 879
    .line 880
    const/16 v16, 0x2

    .line 881
    .line 882
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 883
    .line 884
    .line 885
    move-result v2

    .line 886
    if-eqz v2, :cond_29

    .line 887
    .line 888
    new-instance v2, Ljava/lang/StringBuilder;

    .line 889
    .line 890
    const-string v5, "Animation from operation "

    .line 891
    .line 892
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-static {v9, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 906
    .line 907
    .line 908
    :cond_29
    :goto_15
    iget-object v2, v3, Lb3;->b:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v2, Lgz;

    .line 911
    .line 912
    move-object v1, v0

    .line 913
    new-instance v0, Ldg0;

    .line 914
    .line 915
    const/4 v5, 0x1

    .line 916
    move-object/from16 v21, p1

    .line 917
    .line 918
    move-object v6, v2

    .line 919
    move-object/from16 v2, p0

    .line 920
    .line 921
    invoke-direct/range {v0 .. v5}, Ldg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v6, v0}, Lgz;->a(Lfz;)V

    .line 925
    .line 926
    .line 927
    move-object/from16 v1, p0

    .line 928
    .line 929
    move/from16 v6, p2

    .line 930
    .line 931
    goto/16 :goto_14

    .line 932
    .line 933
    :cond_2a
    invoke-static/range {v20 .. v20}, Lkf2;->o(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    return-void

    .line 937
    :cond_2b
    invoke-static/range {v20 .. v20}, Lkf2;->o(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    return-void

    .line 941
    :cond_2c
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    const/4 v6, 0x0

    .line 946
    :goto_16
    if-ge v6, v0, :cond_2d

    .line 947
    .line 948
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    add-int/lit8 v6, v6, 0x1

    .line 953
    .line 954
    check-cast v1, Lpj4;

    .line 955
    .line 956
    iget-object v2, v1, Lpj4;->c:Lkc1;

    .line 957
    .line 958
    iget-object v2, v2, Lkc1;->T:Landroid/view/View;

    .line 959
    .line 960
    iget v1, v1, Lpj4;->a:I

    .line 961
    .line 962
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-static {v2, v1}, Lf34;->a(Landroid/view/View;I)V

    .line 966
    .line 967
    .line 968
    goto :goto_16

    .line 969
    :cond_2d
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 970
    .line 971
    .line 972
    const/16 v16, 0x2

    .line 973
    .line 974
    invoke-static/range {v16 .. v16}, Lld1;->I(I)Z

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    if-eqz v0, :cond_2e

    .line 979
    .line 980
    new-instance v0, Ljava/lang/StringBuilder;

    .line 981
    .line 982
    const-string v1, "Completed executing operations from "

    .line 983
    .line 984
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-static {v9, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1001
    .line 1002
    .line 1003
    :cond_2e
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lxm0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lxm0;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lxm0;->e()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Lxm0;->d:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_7

    .line 33
    .line 34
    iget-object v2, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {v2}, Lq40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    move v4, v1

    .line 50
    :cond_2
    :goto_0
    const/4 v5, 0x2

    .line 51
    if-ge v4, v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    check-cast v6, Lpj4;

    .line 60
    .line 61
    invoke-static {v5}, Lld1;->I(I)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    const-string v5, "FragmentManager"

    .line 68
    .line 69
    new-instance v7, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v8, "SpecialEffectsController: Cancelling operation "

    .line 75
    .line 76
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v5, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    :goto_1
    invoke-virtual {v6}, Lpj4;->a()V

    .line 93
    .line 94
    .line 95
    iget-boolean v5, v6, Lpj4;->g:Z

    .line 96
    .line 97
    if-nez v5, :cond_2

    .line 98
    .line 99
    iget-object v5, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    invoke-virtual {p0}, Lxm0;->g()V

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-static {v2}, Lq40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v3, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 122
    .line 123
    .line 124
    invoke-static {v5}, Lld1;->I(I)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_5

    .line 129
    .line 130
    const-string v3, "FragmentManager"

    .line 131
    .line 132
    const-string v4, "SpecialEffectsController: Executing pending operations"

    .line 133
    .line 134
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    move v4, v1

    .line 142
    :goto_2
    if-ge v4, v3, :cond_6

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    check-cast v6, Lpj4;

    .line 151
    .line 152
    invoke-virtual {v6}, Lpj4;->d()V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    iget-boolean v3, p0, Lxm0;->d:Z

    .line 157
    .line 158
    invoke-virtual {p0, v2, v3}, Lxm0;->b(Ljava/util/ArrayList;Z)V

    .line 159
    .line 160
    .line 161
    iput-boolean v1, p0, Lxm0;->d:Z

    .line 162
    .line 163
    invoke-static {v5}, Lld1;->I(I)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_7

    .line 168
    .line 169
    const-string p0, "FragmentManager"

    .line 170
    .line 171
    const-string v1, "SpecialEffectsController: Finished executing pending operations"

    .line 172
    .line 173
    invoke-static {p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    :cond_7
    monitor-exit v0

    .line 177
    return-void

    .line 178
    :goto_3
    monitor-exit v0

    .line 179
    throw p0
.end method

.method public final d(Lkc1;)Lpj4;
    .locals 5

    .line 1
    iget-object p0, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :cond_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    check-cast v3, Lpj4;

    .line 18
    .line 19
    iget-object v4, v3, Lpj4;->c:Lkc1;

    .line 20
    .line 21
    invoke-static {v4, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget-boolean v3, v3, Lpj4;->f:Z

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_0
    check-cast v2, Lpj4;

    .line 34
    .line 35
    return-object v2
.end method

.method public final e()V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lld1;->I(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "FragmentManager"

    .line 9
    .line 10
    const-string v2, "SpecialEffectsController: Forcing all operations to complete"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lxm0;->a:Landroid/view/ViewGroup;

    .line 16
    .line 17
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v2

    .line 26
    :try_start_0
    invoke-virtual {p0}, Lxm0;->g()V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    if-ge v6, v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    check-cast v7, Lpj4;

    .line 46
    .line 47
    invoke-virtual {v7}, Lpj4;->d()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    iget-object v3, p0, Lxm0;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {v3}, Lq40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    move v6, v5

    .line 65
    :goto_1
    if-ge v6, v4, :cond_4

    .line 66
    .line 67
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    check-cast v7, Lpj4;

    .line 74
    .line 75
    invoke-static {v0}, Lld1;->I(I)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    const-string v8, ""

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v9, "Container "

    .line 92
    .line 93
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v9, p0, Lxm0;->a:Landroid/view/ViewGroup;

    .line 97
    .line 98
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v9, " is not attached to window. "

    .line 102
    .line 103
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    :goto_2
    const-string v9, "FragmentManager"

    .line 111
    .line 112
    new-instance v10, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v11, "SpecialEffectsController: "

    .line 118
    .line 119
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v8, "Cancelling running operation "

    .line 126
    .line 127
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-static {v9, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    :cond_3
    invoke-virtual {v7}, Lpj4;->a()V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    iget-object v3, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v3}, Lq40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    :goto_3
    if-ge v5, v4, :cond_7

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    add-int/lit8 v5, v5, 0x1

    .line 161
    .line 162
    check-cast v6, Lpj4;

    .line 163
    .line 164
    invoke-static {v0}, Lld1;->I(I)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_6

    .line 169
    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    const-string v7, ""

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_5
    new-instance v7, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v8, "Container "

    .line 181
    .line 182
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget-object v8, p0, Lxm0;->a:Landroid/view/ViewGroup;

    .line 186
    .line 187
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v8, " is not attached to window. "

    .line 191
    .line 192
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    :goto_4
    const-string v8, "FragmentManager"

    .line 200
    .line 201
    new-instance v9, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string v10, "SpecialEffectsController: "

    .line 207
    .line 208
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v7, "Cancelling pending operation "

    .line 215
    .line 216
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v8, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    :cond_6
    invoke-virtual {v6}, Lpj4;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_7
    monitor-exit v2

    .line 234
    return-void

    .line 235
    :goto_5
    monitor-exit v2

    .line 236
    throw p0
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object p0, p0, Lxm0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    check-cast v2, Lpj4;

    .line 17
    .line 18
    iget v3, v2, Lpj4;->b:I

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    iget-object v3, v2, Lpj4;->c:Lkc1;

    .line 24
    .line 25
    invoke-virtual {v3}, Lkc1;->a0()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-eq v3, v4, :cond_2

    .line 37
    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "Unknown visibility "

    .line 45
    .line 46
    invoke-static {v3, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    :goto_1
    const/4 v3, 0x1

    .line 55
    invoke-virtual {v2, v4, v3}, Lpj4;->c(II)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-void
.end method
