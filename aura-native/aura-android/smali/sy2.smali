.class public final Lsy2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public A:J

.field public B:Lm51;

.field public C:[Lry2;

.field public D:[[J

.field public E:I

.field public F:Lxx2;

.field public final a:Lxn4;

.field public final b:I

.field public final c:Z

.field public final d:Lbe3;

.field public final e:Lbe3;

.field public final f:Lbe3;

.field public final g:Lbe3;

.field public final h:Ljava/util/ArrayDeque;

.field public final i:Ls84;

.field public final j:Ljava/util/ArrayList;

.field public k:Lgy3;

.field public l:I

.field public m:I

.field public n:J

.field public o:I

.field public p:Lbe3;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:J

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lxn4;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsy2;->a:Lxn4;

    .line 5
    .line 6
    iput p2, p0, Lsy2;->b:I

    .line 7
    .line 8
    and-int/lit16 p1, p2, 0x100

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v0

    .line 16
    :goto_0
    iput-boolean p1, p0, Lsy2;->c:Z

    .line 17
    .line 18
    sget-object p1, Lyw1;->o:Lvw1;

    .line 19
    .line 20
    sget-object p1, Lgy3;->r:Lgy3;

    .line 21
    .line 22
    iput-object p1, p0, Lsy2;->k:Lgy3;

    .line 23
    .line 24
    and-int/lit8 p1, p2, 0x4

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move p1, v0

    .line 31
    :goto_1
    iput p1, p0, Lsy2;->l:I

    .line 32
    .line 33
    new-instance p1, Ls84;

    .line 34
    .line 35
    invoke-direct {p1}, Ls84;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lsy2;->i:Ls84;

    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lsy2;->j:Ljava/util/ArrayList;

    .line 46
    .line 47
    new-instance p1, Lbe3;

    .line 48
    .line 49
    const/16 p2, 0x10

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lbe3;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lsy2;->g:Lbe3;

    .line 55
    .line 56
    new-instance p1, Ljava/util/ArrayDeque;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lsy2;->h:Ljava/util/ArrayDeque;

    .line 62
    .line 63
    new-instance p1, Lbe3;

    .line 64
    .line 65
    sget-object p2, Luc5;->c:[B

    .line 66
    .line 67
    invoke-direct {p1, p2}, Lbe3;-><init>([B)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lsy2;->d:Lbe3;

    .line 71
    .line 72
    new-instance p1, Lbe3;

    .line 73
    .line 74
    const/4 p2, 0x6

    .line 75
    invoke-direct {p1, p2}, Lbe3;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lsy2;->e:Lbe3;

    .line 79
    .line 80
    new-instance p1, Lbe3;

    .line 81
    .line 82
    invoke-direct {p1}, Lbe3;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lsy2;->f:Lbe3;

    .line 86
    .line 87
    const/4 p1, -0x1

    .line 88
    iput p1, p0, Lsy2;->q:I

    .line 89
    .line 90
    sget-object p1, Lm51;->i:Ly41;

    .line 91
    .line 92
    iput-object p1, p0, Lsy2;->B:Lm51;

    .line 93
    .line 94
    new-array p1, v0, [Lry2;

    .line 95
    .line 96
    iput-object p1, p0, Lsy2;->C:[Lry2;

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v3, v0, Lsy2;->c:Z

    .line 8
    .line 9
    if-eqz v3, :cond_1

    .line 10
    .line 11
    iget-boolean v3, v0, Lsy2;->z:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    :cond_0
    const/16 v23, -0x1

    .line 16
    .line 17
    goto/16 :goto_23

    .line 18
    .line 19
    :cond_1
    :goto_0
    iget v3, v0, Lsy2;->l:I

    .line 20
    .line 21
    iget-object v6, v0, Lsy2;->h:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    iget v7, v0, Lsy2;->b:I

    .line 24
    .line 25
    iget-object v8, v0, Lsy2;->f:Lbe3;

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v15, 0x4

    .line 29
    const-wide/16 v16, -0x1

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v3, :cond_49

    .line 35
    .line 36
    const-wide/32 v19, 0x40000

    .line 37
    .line 38
    .line 39
    if-eq v3, v5, :cond_3b

    .line 40
    .line 41
    const-wide/16 v21, 0x8

    .line 42
    .line 43
    if-eq v3, v10, :cond_1a

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    if-ne v3, v6, :cond_19

    .line 47
    .line 48
    iget-object v3, v0, Lsy2;->i:Ls84;

    .line 49
    .line 50
    iget-object v7, v3, Ls84;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    iget v8, v3, Ls84;->b:I

    .line 53
    .line 54
    if-eqz v8, :cond_15

    .line 55
    .line 56
    if-eq v8, v5, :cond_13

    .line 57
    .line 58
    const/16 v4, 0xb01

    .line 59
    .line 60
    const/16 v12, 0xb00

    .line 61
    .line 62
    const/16 v5, 0x890

    .line 63
    .line 64
    if-eq v8, v10, :cond_e

    .line 65
    .line 66
    if-ne v8, v6, :cond_d

    .line 67
    .line 68
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 69
    .line 70
    .line 71
    move-result-wide v16

    .line 72
    invoke-interface {v1}, Ll51;->getLength()J

    .line 73
    .line 74
    .line 75
    move-result-wide v18

    .line 76
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 77
    .line 78
    .line 79
    move-result-wide v20

    .line 80
    sub-long v18, v18, v20

    .line 81
    .line 82
    iget v3, v3, Ls84;->c:I

    .line 83
    .line 84
    int-to-long v13, v3

    .line 85
    sub-long v13, v18, v13

    .line 86
    .line 87
    long-to-int v3, v13

    .line 88
    new-instance v13, Lbe3;

    .line 89
    .line 90
    invoke-direct {v13, v3}, Lbe3;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iget-object v14, v13, Lbe3;->a:[B

    .line 94
    .line 95
    invoke-interface {v1, v14, v9, v3}, Ll51;->readFully([BII)V

    .line 96
    .line 97
    .line 98
    move v1, v9

    .line 99
    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-ge v1, v3, :cond_c

    .line 104
    .line 105
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lr84;

    .line 110
    .line 111
    move v14, v9

    .line 112
    iget-wide v8, v3, Lr84;->a:J

    .line 113
    .line 114
    sub-long v8, v8, v16

    .line 115
    .line 116
    long-to-int v8, v8

    .line 117
    invoke-virtual {v13, v8}, Lbe3;->N(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v13, v15}, Lbe3;->O(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13}, Lbe3;->o()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 128
    .line 129
    move/from16 p1, v14

    .line 130
    .line 131
    invoke-virtual {v13, v8, v9}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v19

    .line 139
    sparse-switch v19, :sswitch_data_0

    .line 140
    .line 141
    .line 142
    :goto_2
    const/4 v14, -0x1

    .line 143
    goto :goto_3

    .line 144
    :sswitch_0
    const-string v15, "Super_SlowMotion_BGM"

    .line 145
    .line 146
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    if-nez v14, :cond_2

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_2
    const/4 v14, 0x4

    .line 154
    goto :goto_3

    .line 155
    :sswitch_1
    const-string v15, "Super_SlowMotion_Deflickering_On"

    .line 156
    .line 157
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-nez v14, :cond_3

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    move v14, v6

    .line 165
    goto :goto_3

    .line 166
    :sswitch_2
    const-string v15, "Super_SlowMotion_Data"

    .line 167
    .line 168
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    if-nez v14, :cond_4

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    move v14, v10

    .line 176
    goto :goto_3

    .line 177
    :sswitch_3
    const-string v15, "Super_SlowMotion_Edit_Data"

    .line 178
    .line 179
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-nez v14, :cond_5

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    const/4 v14, 0x1

    .line 187
    goto :goto_3

    .line 188
    :sswitch_4
    const-string v15, "SlowMotion_Data"

    .line 189
    .line 190
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    if-nez v14, :cond_6

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_6
    move/from16 v14, p1

    .line 198
    .line 199
    :goto_3
    packed-switch v14, :pswitch_data_0

    .line 200
    .line 201
    .line 202
    const-string v0, "Invalid SEF name"

    .line 203
    .line 204
    invoke-static {v11, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    throw v0

    .line 209
    :pswitch_0
    move v14, v4

    .line 210
    goto :goto_4

    .line 211
    :pswitch_1
    const/16 v14, 0xb04

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :pswitch_2
    move v14, v12

    .line 215
    goto :goto_4

    .line 216
    :pswitch_3
    const/16 v14, 0xb03

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :pswitch_4
    move v14, v5

    .line 220
    :goto_4
    iget v3, v3, Lr84;->b:I

    .line 221
    .line 222
    add-int/lit8 v8, v8, 0x8

    .line 223
    .line 224
    sub-int/2addr v3, v8

    .line 225
    if-eq v14, v5, :cond_8

    .line 226
    .line 227
    if-eq v14, v12, :cond_b

    .line 228
    .line 229
    if-eq v14, v4, :cond_b

    .line 230
    .line 231
    const/16 v3, 0xb03

    .line 232
    .line 233
    if-eq v14, v3, :cond_b

    .line 234
    .line 235
    const/16 v8, 0xb04

    .line 236
    .line 237
    if-ne v14, v8, :cond_7

    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_7
    invoke-static {}, Ltb4;->a()V

    .line 242
    .line 243
    .line 244
    return p1

    .line 245
    :cond_8
    new-instance v15, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v13, v3, v9}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    sget-object v9, Ls84;->e:Lue1;

    .line 255
    .line 256
    invoke-virtual {v9, v3}, Lue1;->C(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    move/from16 v9, p1

    .line 261
    .line 262
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    if-ge v9, v14, :cond_a

    .line 267
    .line 268
    sget-object v14, Ls84;->d:Lue1;

    .line 269
    .line 270
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v18

    .line 274
    move-object/from16 v8, v18

    .line 275
    .line 276
    check-cast v8, Ljava/lang/CharSequence;

    .line 277
    .line 278
    invoke-virtual {v14, v8}, Lue1;->C(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-ne v14, v6, :cond_9

    .line 287
    .line 288
    move/from16 v14, p1

    .line 289
    .line 290
    :try_start_0
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v18

    .line 294
    check-cast v18, Ljava/lang/String;

    .line 295
    .line 296
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 297
    .line 298
    .line 299
    move-result-wide v29

    .line 300
    const/4 v14, 0x1

    .line 301
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v18

    .line 305
    check-cast v18, Ljava/lang/String;

    .line 306
    .line 307
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 308
    .line 309
    .line 310
    move-result-wide v31

    .line 311
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    check-cast v8, Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    const/16 v26, 0x1

    .line 322
    .line 323
    add-int/lit8 v8, v8, -0x1

    .line 324
    .line 325
    shl-int v28, v26, v8

    .line 326
    .line 327
    new-instance v27, Lmg4;

    .line 328
    .line 329
    invoke-direct/range {v27 .. v32}, Lmg4;-><init>(IJJ)V

    .line 330
    .line 331
    .line 332
    move-object/from16 v8, v27

    .line 333
    .line 334
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    .line 336
    .line 337
    add-int/lit8 v9, v9, 0x1

    .line 338
    .line 339
    const/16 p1, 0x0

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :catch_0
    move-exception v0

    .line 343
    invoke-static {v0, v11}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    throw v0

    .line 348
    :cond_9
    invoke-static {v11, v11}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    throw v0

    .line 353
    :cond_a
    new-instance v3, Lng4;

    .line 354
    .line 355
    invoke-direct {v3, v15}, Lng4;-><init>(Ljava/util/ArrayList;)V

    .line 356
    .line 357
    .line 358
    iget-object v8, v0, Lsy2;->j:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    :cond_b
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 364
    .line 365
    const/4 v9, 0x0

    .line 366
    const/4 v15, 0x4

    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :cond_c
    const-wide/16 v8, 0x0

    .line 370
    .line 371
    iput-wide v8, v2, Lt71;->a:J

    .line 372
    .line 373
    :goto_7
    const/4 v1, 0x1

    .line 374
    goto/16 :goto_c

    .line 375
    .line 376
    :cond_d
    invoke-static {}, Ltb4;->a()V

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    return v14

    .line 381
    :cond_e
    move v14, v9

    .line 382
    invoke-interface {v1}, Ll51;->getLength()J

    .line 383
    .line 384
    .line 385
    move-result-wide v8

    .line 386
    iget v11, v3, Ls84;->c:I

    .line 387
    .line 388
    add-int/lit8 v11, v11, -0x14

    .line 389
    .line 390
    new-instance v13, Lbe3;

    .line 391
    .line 392
    invoke-direct {v13, v11}, Lbe3;-><init>(I)V

    .line 393
    .line 394
    .line 395
    iget-object v15, v13, Lbe3;->a:[B

    .line 396
    .line 397
    invoke-interface {v1, v15, v14, v11}, Ll51;->readFully([BII)V

    .line 398
    .line 399
    .line 400
    const/4 v1, 0x0

    .line 401
    :goto_8
    div-int/lit8 v15, v11, 0xc

    .line 402
    .line 403
    if-ge v1, v15, :cond_11

    .line 404
    .line 405
    invoke-virtual {v13, v10}, Lbe3;->O(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v13}, Lbe3;->q()S

    .line 409
    .line 410
    .line 411
    move-result v15

    .line 412
    if-eq v15, v5, :cond_f

    .line 413
    .line 414
    if-eq v15, v12, :cond_f

    .line 415
    .line 416
    if-eq v15, v4, :cond_f

    .line 417
    .line 418
    const/16 v4, 0xb03

    .line 419
    .line 420
    if-eq v15, v4, :cond_f

    .line 421
    .line 422
    const/16 v4, 0xb04

    .line 423
    .line 424
    if-eq v15, v4, :cond_10

    .line 425
    .line 426
    const/16 v15, 0x8

    .line 427
    .line 428
    invoke-virtual {v13, v15}, Lbe3;->O(I)V

    .line 429
    .line 430
    .line 431
    move-object/from16 v21, v13

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_f
    const/16 v4, 0xb04

    .line 435
    .line 436
    :cond_10
    iget v15, v3, Ls84;->c:I

    .line 437
    .line 438
    int-to-long v4, v15

    .line 439
    sub-long v4, v8, v4

    .line 440
    .line 441
    invoke-virtual {v13}, Lbe3;->o()I

    .line 442
    .line 443
    .line 444
    move-result v15

    .line 445
    move-object/from16 v21, v13

    .line 446
    .line 447
    int-to-long v12, v15

    .line 448
    sub-long/2addr v4, v12

    .line 449
    invoke-virtual/range {v21 .. v21}, Lbe3;->o()I

    .line 450
    .line 451
    .line 452
    move-result v12

    .line 453
    new-instance v13, Lr84;

    .line 454
    .line 455
    invoke-direct {v13, v12, v4, v5}, Lr84;-><init>(IJ)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    :goto_9
    add-int/lit8 v1, v1, 0x1

    .line 462
    .line 463
    move-object/from16 v13, v21

    .line 464
    .line 465
    const/16 v4, 0xb01

    .line 466
    .line 467
    const/16 v5, 0x890

    .line 468
    .line 469
    const/16 v12, 0xb00

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_11
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-eqz v1, :cond_12

    .line 477
    .line 478
    const-wide/16 v8, 0x0

    .line 479
    .line 480
    iput-wide v8, v2, Lt71;->a:J

    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    goto :goto_7

    .line 484
    :cond_12
    iput v6, v3, Ls84;->b:I

    .line 485
    .line 486
    const/4 v14, 0x0

    .line 487
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    check-cast v1, Lr84;

    .line 492
    .line 493
    iget-wide v3, v1, Lr84;->a:J

    .line 494
    .line 495
    iput-wide v3, v2, Lt71;->a:J

    .line 496
    .line 497
    goto :goto_7

    .line 498
    :cond_13
    move v14, v9

    .line 499
    new-instance v4, Lbe3;

    .line 500
    .line 501
    const/16 v15, 0x8

    .line 502
    .line 503
    invoke-direct {v4, v15}, Lbe3;-><init>(I)V

    .line 504
    .line 505
    .line 506
    iget-object v5, v4, Lbe3;->a:[B

    .line 507
    .line 508
    invoke-interface {v1, v5, v14, v15}, Ll51;->readFully([BII)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v4}, Lbe3;->o()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    add-int/2addr v5, v15

    .line 516
    iput v5, v3, Ls84;->c:I

    .line 517
    .line 518
    invoke-virtual {v4}, Lbe3;->m()I

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    const v5, 0x53454654

    .line 523
    .line 524
    .line 525
    if-eq v4, v5, :cond_14

    .line 526
    .line 527
    const-wide/16 v8, 0x0

    .line 528
    .line 529
    iput-wide v8, v2, Lt71;->a:J

    .line 530
    .line 531
    goto/16 :goto_7

    .line 532
    .line 533
    :cond_14
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 534
    .line 535
    .line 536
    move-result-wide v4

    .line 537
    iget v1, v3, Ls84;->c:I

    .line 538
    .line 539
    add-int/lit8 v1, v1, -0xc

    .line 540
    .line 541
    int-to-long v6, v1

    .line 542
    sub-long/2addr v4, v6

    .line 543
    iput-wide v4, v2, Lt71;->a:J

    .line 544
    .line 545
    iput v10, v3, Ls84;->b:I

    .line 546
    .line 547
    goto/16 :goto_7

    .line 548
    .line 549
    :cond_15
    invoke-interface {v1}, Ll51;->getLength()J

    .line 550
    .line 551
    .line 552
    move-result-wide v4

    .line 553
    cmp-long v1, v4, v16

    .line 554
    .line 555
    if-eqz v1, :cond_17

    .line 556
    .line 557
    cmp-long v1, v4, v21

    .line 558
    .line 559
    if-gez v1, :cond_16

    .line 560
    .line 561
    goto :goto_a

    .line 562
    :cond_16
    sub-long v4, v4, v21

    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_17
    :goto_a
    const-wide/16 v4, 0x0

    .line 566
    .line 567
    :goto_b
    iput-wide v4, v2, Lt71;->a:J

    .line 568
    .line 569
    const/4 v1, 0x1

    .line 570
    iput v1, v3, Ls84;->b:I

    .line 571
    .line 572
    :goto_c
    iget-wide v2, v2, Lt71;->a:J

    .line 573
    .line 574
    const-wide/16 v24, 0x0

    .line 575
    .line 576
    cmp-long v2, v2, v24

    .line 577
    .line 578
    if-nez v2, :cond_18

    .line 579
    .line 580
    const/4 v14, 0x0

    .line 581
    iput v14, v0, Lsy2;->l:I

    .line 582
    .line 583
    iput v14, v0, Lsy2;->o:I

    .line 584
    .line 585
    return v1

    .line 586
    :cond_18
    move v5, v1

    .line 587
    goto/16 :goto_21

    .line 588
    .line 589
    :cond_19
    move v14, v9

    .line 590
    invoke-static {}, Ltb4;->a()V

    .line 591
    .line 592
    .line 593
    return v14

    .line 594
    :cond_1a
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 595
    .line 596
    .line 597
    move-result-wide v3

    .line 598
    iget v5, v0, Lsy2;->q:I

    .line 599
    .line 600
    const/4 v6, -0x1

    .line 601
    if-ne v5, v6, :cond_25

    .line 602
    .line 603
    const/4 v5, 0x1

    .line 604
    const/4 v9, 0x0

    .line 605
    const/4 v12, -0x1

    .line 606
    const/4 v13, -0x1

    .line 607
    const/4 v15, 0x1

    .line 608
    const-wide v16, 0x7fffffffffffffffL

    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    const-wide v27, 0x7fffffffffffffffL

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    const-wide v29, 0x7fffffffffffffffL

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    const-wide v31, 0x7fffffffffffffffL

    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    :goto_d
    iget-object v6, v0, Lsy2;->C:[Lry2;

    .line 629
    .line 630
    array-length v14, v6

    .line 631
    if-ge v9, v14, :cond_22

    .line 632
    .line 633
    aget-object v6, v6, v9

    .line 634
    .line 635
    iget v14, v6, Lry2;->e:I

    .line 636
    .line 637
    iget-object v6, v6, Lry2;->b:Lxv4;

    .line 638
    .line 639
    move/from16 v33, v10

    .line 640
    .line 641
    iget v10, v6, Lxv4;->b:I

    .line 642
    .line 643
    if-ne v14, v10, :cond_1b

    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_1b
    iget-object v6, v6, Lxv4;->c:[J

    .line 647
    .line 648
    aget-wide v34, v6, v14

    .line 649
    .line 650
    iget-object v6, v0, Lsy2;->D:[[J

    .line 651
    .line 652
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    aget-object v6, v6, v9

    .line 656
    .line 657
    aget-wide v36, v6, v14

    .line 658
    .line 659
    sub-long v34, v34, v3

    .line 660
    .line 661
    const-wide/16 v24, 0x0

    .line 662
    .line 663
    cmp-long v6, v34, v24

    .line 664
    .line 665
    if-ltz v6, :cond_1d

    .line 666
    .line 667
    cmp-long v6, v34, v19

    .line 668
    .line 669
    if-ltz v6, :cond_1c

    .line 670
    .line 671
    goto :goto_e

    .line 672
    :cond_1c
    const/4 v6, 0x0

    .line 673
    goto :goto_f

    .line 674
    :cond_1d
    :goto_e
    const/4 v6, 0x1

    .line 675
    :goto_f
    if-nez v6, :cond_1e

    .line 676
    .line 677
    if-nez v5, :cond_1f

    .line 678
    .line 679
    :cond_1e
    if-ne v6, v5, :cond_20

    .line 680
    .line 681
    cmp-long v10, v34, v31

    .line 682
    .line 683
    if-gez v10, :cond_20

    .line 684
    .line 685
    :cond_1f
    move v5, v6

    .line 686
    move v13, v9

    .line 687
    move-wide/from16 v31, v34

    .line 688
    .line 689
    move-wide/from16 v29, v36

    .line 690
    .line 691
    :cond_20
    cmp-long v10, v36, v27

    .line 692
    .line 693
    if-gez v10, :cond_21

    .line 694
    .line 695
    move v15, v6

    .line 696
    move v12, v9

    .line 697
    move-wide/from16 v27, v36

    .line 698
    .line 699
    :cond_21
    :goto_10
    add-int/lit8 v9, v9, 0x1

    .line 700
    .line 701
    move/from16 v10, v33

    .line 702
    .line 703
    goto :goto_d

    .line 704
    :cond_22
    move/from16 v33, v10

    .line 705
    .line 706
    cmp-long v5, v27, v16

    .line 707
    .line 708
    if-eqz v5, :cond_23

    .line 709
    .line 710
    if-eqz v15, :cond_23

    .line 711
    .line 712
    const-wide/32 v5, 0xa00000

    .line 713
    .line 714
    .line 715
    add-long v27, v27, v5

    .line 716
    .line 717
    cmp-long v5, v29, v27

    .line 718
    .line 719
    if-gez v5, :cond_24

    .line 720
    .line 721
    :cond_23
    move v12, v13

    .line 722
    :cond_24
    iput v12, v0, Lsy2;->q:I

    .line 723
    .line 724
    const/4 v6, -0x1

    .line 725
    if-ne v12, v6, :cond_26

    .line 726
    .line 727
    move/from16 v23, v6

    .line 728
    .line 729
    goto/16 :goto_23

    .line 730
    .line 731
    :cond_25
    move/from16 v33, v10

    .line 732
    .line 733
    :cond_26
    iget-object v5, v0, Lsy2;->C:[Lry2;

    .line 734
    .line 735
    iget v6, v0, Lsy2;->q:I

    .line 736
    .line 737
    aget-object v5, v5, v6

    .line 738
    .line 739
    iget-object v6, v5, Lry2;->c:Lwv4;

    .line 740
    .line 741
    iget-object v9, v5, Lry2;->b:Lxv4;

    .line 742
    .line 743
    iget-object v10, v5, Lry2;->a:Lpv4;

    .line 744
    .line 745
    iget v12, v5, Lry2;->e:I

    .line 746
    .line 747
    iget-object v13, v9, Lxv4;->c:[J

    .line 748
    .line 749
    iget-object v15, v9, Lxv4;->d:[I

    .line 750
    .line 751
    aget-wide v16, v13, v12

    .line 752
    .line 753
    iget-wide v13, v0, Lsy2;->A:J

    .line 754
    .line 755
    add-long v13, v16, v13

    .line 756
    .line 757
    aget v16, v15, v12

    .line 758
    .line 759
    iget-object v11, v5, Lry2;->d:Lmy4;

    .line 760
    .line 761
    sub-long v3, v13, v3

    .line 762
    .line 763
    move-wide/from16 v28, v3

    .line 764
    .line 765
    iget v3, v0, Lsy2;->r:I

    .line 766
    .line 767
    int-to-long v3, v3

    .line 768
    add-long v3, v28, v3

    .line 769
    .line 770
    const-wide/16 v24, 0x0

    .line 771
    .line 772
    cmp-long v17, v3, v24

    .line 773
    .line 774
    if-ltz v17, :cond_27

    .line 775
    .line 776
    cmp-long v17, v3, v19

    .line 777
    .line 778
    if-ltz v17, :cond_28

    .line 779
    .line 780
    :cond_27
    const/16 v26, 0x1

    .line 781
    .line 782
    goto/16 :goto_1a

    .line 783
    .line 784
    :cond_28
    iget v2, v10, Lpv4;->h:I

    .line 785
    .line 786
    iget v13, v10, Lpv4;->k:I

    .line 787
    .line 788
    iget-object v10, v10, Lpv4;->g:Ltb1;

    .line 789
    .line 790
    const/4 v14, 0x1

    .line 791
    if-ne v2, v14, :cond_29

    .line 792
    .line 793
    add-long v3, v3, v21

    .line 794
    .line 795
    add-int/lit8 v16, v16, -0x8

    .line 796
    .line 797
    :cond_29
    move/from16 v2, v16

    .line 798
    .line 799
    long-to-int v3, v3

    .line 800
    invoke-interface {v1, v3}, Ll51;->l(I)V

    .line 801
    .line 802
    .line 803
    iget-object v3, v10, Ltb1;->n:Ljava/lang/String;

    .line 804
    .line 805
    iget-object v4, v10, Ltb1;->n:Ljava/lang/String;

    .line 806
    .line 807
    const-string v14, "video/avc"

    .line 808
    .line 809
    invoke-static {v3, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    if-eqz v3, :cond_2b

    .line 814
    .line 815
    and-int/lit8 v3, v7, 0x20

    .line 816
    .line 817
    if-eqz v3, :cond_2a

    .line 818
    .line 819
    goto :goto_11

    .line 820
    :cond_2a
    const/4 v14, 0x1

    .line 821
    goto :goto_12

    .line 822
    :cond_2b
    const-string v3, "video/hevc"

    .line 823
    .line 824
    invoke-static {v4, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-eqz v3, :cond_2a

    .line 829
    .line 830
    and-int/lit16 v3, v7, 0x80

    .line 831
    .line 832
    if-eqz v3, :cond_2a

    .line 833
    .line 834
    :goto_11
    const/4 v14, 0x1

    .line 835
    goto :goto_13

    .line 836
    :goto_12
    iput-boolean v14, v0, Lsy2;->u:Z

    .line 837
    .line 838
    :goto_13
    if-eqz v13, :cond_31

    .line 839
    .line 840
    iget-object v3, v0, Lsy2;->e:Lbe3;

    .line 841
    .line 842
    iget-object v4, v3, Lbe3;->a:[B

    .line 843
    .line 844
    const/16 v18, 0x0

    .line 845
    .line 846
    aput-byte v18, v4, v18

    .line 847
    .line 848
    aput-byte v18, v4, v14

    .line 849
    .line 850
    aput-byte v18, v4, v33

    .line 851
    .line 852
    rsub-int/lit8 v7, v13, 0x4

    .line 853
    .line 854
    add-int/2addr v2, v7

    .line 855
    :goto_14
    iget v8, v0, Lsy2;->s:I

    .line 856
    .line 857
    if-ge v8, v2, :cond_30

    .line 858
    .line 859
    iget v8, v0, Lsy2;->t:I

    .line 860
    .line 861
    if-nez v8, :cond_2f

    .line 862
    .line 863
    iget-boolean v8, v0, Lsy2;->u:Z

    .line 864
    .line 865
    if-nez v8, :cond_2c

    .line 866
    .line 867
    invoke-static {v10}, Luc5;->C(Ltb1;)I

    .line 868
    .line 869
    .line 870
    move-result v8

    .line 871
    add-int/2addr v8, v13

    .line 872
    aget v16, v15, v12

    .line 873
    .line 874
    iget v14, v0, Lsy2;->r:I

    .line 875
    .line 876
    sub-int v14, v16, v14

    .line 877
    .line 878
    if-gt v8, v14, :cond_2c

    .line 879
    .line 880
    invoke-static {v10}, Luc5;->C(Ltb1;)I

    .line 881
    .line 882
    .line 883
    move-result v14

    .line 884
    add-int v8, v13, v14

    .line 885
    .line 886
    goto :goto_15

    .line 887
    :cond_2c
    move v8, v13

    .line 888
    const/4 v14, 0x0

    .line 889
    :goto_15
    invoke-interface {v1, v4, v7, v8}, Ll51;->readFully([BII)V

    .line 890
    .line 891
    .line 892
    move/from16 p2, v2

    .line 893
    .line 894
    iget v2, v0, Lsy2;->r:I

    .line 895
    .line 896
    add-int/2addr v2, v8

    .line 897
    iput v2, v0, Lsy2;->r:I

    .line 898
    .line 899
    const/4 v2, 0x0

    .line 900
    invoke-virtual {v3, v2}, Lbe3;->N(I)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v3}, Lbe3;->m()I

    .line 904
    .line 905
    .line 906
    move-result v8

    .line 907
    if-ltz v8, :cond_2e

    .line 908
    .line 909
    sub-int/2addr v8, v14

    .line 910
    iput v8, v0, Lsy2;->t:I

    .line 911
    .line 912
    iget-object v8, v0, Lsy2;->d:Lbe3;

    .line 913
    .line 914
    invoke-virtual {v8, v2}, Lbe3;->N(I)V

    .line 915
    .line 916
    .line 917
    move v2, v14

    .line 918
    const/4 v14, 0x4

    .line 919
    invoke-interface {v6, v14, v8}, Lwv4;->e(ILbe3;)V

    .line 920
    .line 921
    .line 922
    iget v8, v0, Lsy2;->s:I

    .line 923
    .line 924
    add-int/2addr v8, v14

    .line 925
    iput v8, v0, Lsy2;->s:I

    .line 926
    .line 927
    if-lez v2, :cond_2d

    .line 928
    .line 929
    invoke-interface {v6, v2, v3}, Lwv4;->e(ILbe3;)V

    .line 930
    .line 931
    .line 932
    iget v8, v0, Lsy2;->s:I

    .line 933
    .line 934
    add-int/2addr v8, v2

    .line 935
    iput v8, v0, Lsy2;->s:I

    .line 936
    .line 937
    invoke-static {v4, v2, v10}, Luc5;->y([BILtb1;)Z

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    if-eqz v2, :cond_2d

    .line 942
    .line 943
    const/4 v14, 0x1

    .line 944
    iput-boolean v14, v0, Lsy2;->u:Z

    .line 945
    .line 946
    :cond_2d
    :goto_16
    move/from16 v2, p2

    .line 947
    .line 948
    goto :goto_14

    .line 949
    :cond_2e
    const-string v0, "Invalid NAL length"

    .line 950
    .line 951
    const/4 v1, 0x0

    .line 952
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    throw v0

    .line 957
    :cond_2f
    move/from16 p2, v2

    .line 958
    .line 959
    const/4 v14, 0x0

    .line 960
    invoke-interface {v6, v1, v8, v14}, Lwv4;->f(Lwh0;IZ)I

    .line 961
    .line 962
    .line 963
    move-result v2

    .line 964
    iget v8, v0, Lsy2;->r:I

    .line 965
    .line 966
    add-int/2addr v8, v2

    .line 967
    iput v8, v0, Lsy2;->r:I

    .line 968
    .line 969
    iget v8, v0, Lsy2;->s:I

    .line 970
    .line 971
    add-int/2addr v8, v2

    .line 972
    iput v8, v0, Lsy2;->s:I

    .line 973
    .line 974
    iget v8, v0, Lsy2;->t:I

    .line 975
    .line 976
    sub-int/2addr v8, v2

    .line 977
    iput v8, v0, Lsy2;->t:I

    .line 978
    .line 979
    goto :goto_16

    .line 980
    :cond_30
    move/from16 p2, v2

    .line 981
    .line 982
    move/from16 v38, p2

    .line 983
    .line 984
    goto/16 :goto_18

    .line 985
    .line 986
    :cond_31
    const-string v3, "audio/ac4"

    .line 987
    .line 988
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    if-eqz v3, :cond_33

    .line 993
    .line 994
    iget v3, v0, Lsy2;->s:I

    .line 995
    .line 996
    if-nez v3, :cond_32

    .line 997
    .line 998
    invoke-static {v2, v8}, Lhw;->g(ILbe3;)V

    .line 999
    .line 1000
    .line 1001
    const/4 v3, 0x7

    .line 1002
    invoke-interface {v6, v3, v8}, Lwv4;->e(ILbe3;)V

    .line 1003
    .line 1004
    .line 1005
    iget v4, v0, Lsy2;->s:I

    .line 1006
    .line 1007
    add-int/2addr v4, v3

    .line 1008
    iput v4, v0, Lsy2;->s:I

    .line 1009
    .line 1010
    :cond_32
    add-int/lit8 v2, v2, 0x7

    .line 1011
    .line 1012
    goto :goto_17

    .line 1013
    :cond_33
    iget-object v3, v5, Lry2;->f:Ltb1;

    .line 1014
    .line 1015
    if-eqz v3, :cond_35

    .line 1016
    .line 1017
    const-string v3, "audio/mpeg"

    .line 1018
    .line 1019
    invoke-static {v4, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-eqz v3, :cond_35

    .line 1024
    .line 1025
    iget-object v3, v5, Lry2;->f:Ltb1;

    .line 1026
    .line 1027
    const/4 v4, 0x4

    .line 1028
    invoke-virtual {v8, v4}, Lbe3;->K(I)V

    .line 1029
    .line 1030
    .line 1031
    iget-object v7, v8, Lbe3;->a:[B

    .line 1032
    .line 1033
    const/4 v14, 0x0

    .line 1034
    invoke-interface {v1, v7, v14, v4}, Ll51;->n([BII)V

    .line 1035
    .line 1036
    .line 1037
    invoke-interface {v1}, Ll51;->k()V

    .line 1038
    .line 1039
    .line 1040
    new-instance v4, Lwy2;

    .line 1041
    .line 1042
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1043
    .line 1044
    .line 1045
    iget-object v7, v5, Lry2;->c:Lwv4;

    .line 1046
    .line 1047
    invoke-virtual {v8}, Lbe3;->m()I

    .line 1048
    .line 1049
    .line 1050
    move-result v8

    .line 1051
    invoke-virtual {v4, v8}, Lwy2;->a(I)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v8

    .line 1055
    if-eqz v8, :cond_34

    .line 1056
    .line 1057
    iget-object v8, v3, Ltb1;->n:Ljava/lang/String;

    .line 1058
    .line 1059
    iget-object v10, v4, Lwy2;->g:Ljava/io/Serializable;

    .line 1060
    .line 1061
    check-cast v10, Ljava/lang/String;

    .line 1062
    .line 1063
    invoke-static {v8, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v8

    .line 1067
    if-nez v8, :cond_34

    .line 1068
    .line 1069
    invoke-virtual {v3}, Ltb1;->a()Lsb1;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    iget-object v4, v4, Lwy2;->g:Ljava/io/Serializable;

    .line 1074
    .line 1075
    check-cast v4, Ljava/lang/String;

    .line 1076
    .line 1077
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v4

    .line 1084
    iput-object v4, v3, Lsb1;->m:Ljava/lang/String;

    .line 1085
    .line 1086
    new-instance v4, Ltb1;

    .line 1087
    .line 1088
    invoke-direct {v4, v3}, Ltb1;-><init>(Lsb1;)V

    .line 1089
    .line 1090
    .line 1091
    move-object v3, v4

    .line 1092
    :cond_34
    invoke-interface {v7, v3}, Lwv4;->g(Ltb1;)V

    .line 1093
    .line 1094
    .line 1095
    const/4 v3, 0x0

    .line 1096
    iput-object v3, v5, Lry2;->f:Ltb1;

    .line 1097
    .line 1098
    goto :goto_17

    .line 1099
    :cond_35
    if-eqz v11, :cond_36

    .line 1100
    .line 1101
    invoke-virtual {v11, v1}, Lmy4;->c(Ll51;)V

    .line 1102
    .line 1103
    .line 1104
    :cond_36
    :goto_17
    iget v3, v0, Lsy2;->s:I

    .line 1105
    .line 1106
    if-ge v3, v2, :cond_37

    .line 1107
    .line 1108
    sub-int v3, v2, v3

    .line 1109
    .line 1110
    const/4 v14, 0x0

    .line 1111
    invoke-interface {v6, v1, v3, v14}, Lwv4;->f(Lwh0;IZ)I

    .line 1112
    .line 1113
    .line 1114
    move-result v3

    .line 1115
    iget v4, v0, Lsy2;->r:I

    .line 1116
    .line 1117
    add-int/2addr v4, v3

    .line 1118
    iput v4, v0, Lsy2;->r:I

    .line 1119
    .line 1120
    iget v4, v0, Lsy2;->s:I

    .line 1121
    .line 1122
    add-int/2addr v4, v3

    .line 1123
    iput v4, v0, Lsy2;->s:I

    .line 1124
    .line 1125
    iget v4, v0, Lsy2;->t:I

    .line 1126
    .line 1127
    sub-int/2addr v4, v3

    .line 1128
    iput v4, v0, Lsy2;->t:I

    .line 1129
    .line 1130
    goto :goto_17

    .line 1131
    :cond_37
    move/from16 v38, v2

    .line 1132
    .line 1133
    :goto_18
    iget-object v1, v9, Lxv4;->f:[J

    .line 1134
    .line 1135
    aget-wide v35, v1, v12

    .line 1136
    .line 1137
    iget-object v1, v9, Lxv4;->g:[I

    .line 1138
    .line 1139
    aget v1, v1, v12

    .line 1140
    .line 1141
    iget-boolean v2, v0, Lsy2;->u:Z

    .line 1142
    .line 1143
    if-nez v2, :cond_38

    .line 1144
    .line 1145
    const/high16 v2, 0x4000000

    .line 1146
    .line 1147
    or-int/2addr v1, v2

    .line 1148
    :cond_38
    move/from16 v37, v1

    .line 1149
    .line 1150
    if-eqz v11, :cond_39

    .line 1151
    .line 1152
    const/16 v40, 0x0

    .line 1153
    .line 1154
    const/16 v41, 0x0

    .line 1155
    .line 1156
    move-object/from16 v34, v11

    .line 1157
    .line 1158
    move/from16 v39, v38

    .line 1159
    .line 1160
    move/from16 v38, v37

    .line 1161
    .line 1162
    move-wide/from16 v36, v35

    .line 1163
    .line 1164
    move-object/from16 v35, v6

    .line 1165
    .line 1166
    invoke-virtual/range {v34 .. v41}, Lmy4;->b(Lwv4;JIIILvv4;)V

    .line 1167
    .line 1168
    .line 1169
    move-object/from16 v2, v34

    .line 1170
    .line 1171
    move-object/from16 v1, v35

    .line 1172
    .line 1173
    const/16 v26, 0x1

    .line 1174
    .line 1175
    add-int/lit8 v12, v12, 0x1

    .line 1176
    .line 1177
    iget v3, v9, Lxv4;->b:I

    .line 1178
    .line 1179
    if-ne v12, v3, :cond_3a

    .line 1180
    .line 1181
    const/4 v3, 0x0

    .line 1182
    invoke-virtual {v2, v1, v3}, Lmy4;->a(Lwv4;Lvv4;)V

    .line 1183
    .line 1184
    .line 1185
    goto :goto_19

    .line 1186
    :cond_39
    move-object v1, v6

    .line 1187
    const/16 v26, 0x1

    .line 1188
    .line 1189
    const/16 v39, 0x0

    .line 1190
    .line 1191
    const/16 v40, 0x0

    .line 1192
    .line 1193
    move-object/from16 v34, v1

    .line 1194
    .line 1195
    invoke-interface/range {v34 .. v40}, Lwv4;->a(JIIILvv4;)V

    .line 1196
    .line 1197
    .line 1198
    :cond_3a
    :goto_19
    iget v1, v5, Lry2;->e:I

    .line 1199
    .line 1200
    add-int/lit8 v1, v1, 0x1

    .line 1201
    .line 1202
    iput v1, v5, Lry2;->e:I

    .line 1203
    .line 1204
    const/4 v6, -0x1

    .line 1205
    iput v6, v0, Lsy2;->q:I

    .line 1206
    .line 1207
    const/4 v14, 0x0

    .line 1208
    iput v14, v0, Lsy2;->r:I

    .line 1209
    .line 1210
    iput v14, v0, Lsy2;->s:I

    .line 1211
    .line 1212
    iput v14, v0, Lsy2;->t:I

    .line 1213
    .line 1214
    iput-boolean v14, v0, Lsy2;->u:Z

    .line 1215
    .line 1216
    return v14

    .line 1217
    :goto_1a
    iput-wide v13, v2, Lt71;->a:J

    .line 1218
    .line 1219
    return v26

    .line 1220
    :cond_3b
    move/from16 v33, v10

    .line 1221
    .line 1222
    iget-wide v3, v0, Lsy2;->n:J

    .line 1223
    .line 1224
    iget v5, v0, Lsy2;->o:I

    .line 1225
    .line 1226
    int-to-long v7, v5

    .line 1227
    sub-long/2addr v3, v7

    .line 1228
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1229
    .line 1230
    .line 1231
    move-result-wide v7

    .line 1232
    add-long/2addr v7, v3

    .line 1233
    iget-object v5, v0, Lsy2;->p:Lbe3;

    .line 1234
    .line 1235
    if-eqz v5, :cond_44

    .line 1236
    .line 1237
    iget-object v9, v5, Lbe3;->a:[B

    .line 1238
    .line 1239
    iget v10, v0, Lsy2;->o:I

    .line 1240
    .line 1241
    long-to-int v3, v3

    .line 1242
    invoke-interface {v1, v9, v10, v3}, Ll51;->readFully([BII)V

    .line 1243
    .line 1244
    .line 1245
    iget v3, v0, Lsy2;->m:I

    .line 1246
    .line 1247
    const v4, 0x66747970

    .line 1248
    .line 1249
    .line 1250
    if-ne v3, v4, :cond_43

    .line 1251
    .line 1252
    const/4 v3, 0x1

    .line 1253
    iput-boolean v3, v0, Lsy2;->v:Z

    .line 1254
    .line 1255
    const/16 v15, 0x8

    .line 1256
    .line 1257
    invoke-virtual {v5, v15}, Lbe3;->N(I)V

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v5}, Lbe3;->m()I

    .line 1261
    .line 1262
    .line 1263
    move-result v3

    .line 1264
    const v4, 0x71742020

    .line 1265
    .line 1266
    .line 1267
    const v6, 0x68656963

    .line 1268
    .line 1269
    .line 1270
    if-eq v3, v6, :cond_3d

    .line 1271
    .line 1272
    if-eq v3, v4, :cond_3c

    .line 1273
    .line 1274
    const/4 v3, 0x0

    .line 1275
    goto :goto_1b

    .line 1276
    :cond_3c
    const/4 v3, 0x1

    .line 1277
    goto :goto_1b

    .line 1278
    :cond_3d
    move/from16 v3, v33

    .line 1279
    .line 1280
    :goto_1b
    if-eqz v3, :cond_3e

    .line 1281
    .line 1282
    goto :goto_1d

    .line 1283
    :cond_3e
    const/4 v3, 0x4

    .line 1284
    invoke-virtual {v5, v3}, Lbe3;->O(I)V

    .line 1285
    .line 1286
    .line 1287
    :cond_3f
    invoke-virtual {v5}, Lbe3;->a()I

    .line 1288
    .line 1289
    .line 1290
    move-result v3

    .line 1291
    if-lez v3, :cond_42

    .line 1292
    .line 1293
    invoke-virtual {v5}, Lbe3;->m()I

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    if-eq v3, v6, :cond_41

    .line 1298
    .line 1299
    if-eq v3, v4, :cond_40

    .line 1300
    .line 1301
    const/4 v3, 0x0

    .line 1302
    goto :goto_1c

    .line 1303
    :cond_40
    const/4 v3, 0x1

    .line 1304
    goto :goto_1c

    .line 1305
    :cond_41
    move/from16 v3, v33

    .line 1306
    .line 1307
    :goto_1c
    if-eqz v3, :cond_3f

    .line 1308
    .line 1309
    goto :goto_1d

    .line 1310
    :cond_42
    const/4 v3, 0x0

    .line 1311
    :goto_1d
    iput v3, v0, Lsy2;->E:I

    .line 1312
    .line 1313
    goto :goto_1e

    .line 1314
    :cond_43
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1315
    .line 1316
    .line 1317
    move-result v3

    .line 1318
    if-nez v3, :cond_46

    .line 1319
    .line 1320
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    check-cast v3, Loy2;

    .line 1325
    .line 1326
    new-instance v4, Lpy2;

    .line 1327
    .line 1328
    iget v6, v0, Lsy2;->m:I

    .line 1329
    .line 1330
    invoke-direct {v4, v6, v5}, Lpy2;-><init>(ILbe3;)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v3, v3, Loy2;->q:Ljava/util/ArrayList;

    .line 1334
    .line 1335
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1336
    .line 1337
    .line 1338
    goto :goto_1e

    .line 1339
    :cond_44
    iget-boolean v5, v0, Lsy2;->v:Z

    .line 1340
    .line 1341
    if-nez v5, :cond_45

    .line 1342
    .line 1343
    iget v5, v0, Lsy2;->m:I

    .line 1344
    .line 1345
    const v6, 0x6d646174

    .line 1346
    .line 1347
    .line 1348
    if-ne v5, v6, :cond_45

    .line 1349
    .line 1350
    const/4 v5, 0x1

    .line 1351
    iput v5, v0, Lsy2;->E:I

    .line 1352
    .line 1353
    :cond_45
    cmp-long v5, v3, v19

    .line 1354
    .line 1355
    if-gez v5, :cond_47

    .line 1356
    .line 1357
    long-to-int v3, v3

    .line 1358
    invoke-interface {v1, v3}, Ll51;->l(I)V

    .line 1359
    .line 1360
    .line 1361
    :cond_46
    :goto_1e
    const/4 v3, 0x0

    .line 1362
    goto :goto_1f

    .line 1363
    :cond_47
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1364
    .line 1365
    .line 1366
    move-result-wide v5

    .line 1367
    add-long/2addr v5, v3

    .line 1368
    iput-wide v5, v2, Lt71;->a:J

    .line 1369
    .line 1370
    const/4 v3, 0x1

    .line 1371
    :goto_1f
    invoke-virtual {v0, v7, v8}, Lsy2;->g(J)V

    .line 1372
    .line 1373
    .line 1374
    iget-boolean v4, v0, Lsy2;->w:Z

    .line 1375
    .line 1376
    const/4 v5, 0x1

    .line 1377
    if-eqz v4, :cond_48

    .line 1378
    .line 1379
    iput-boolean v5, v0, Lsy2;->y:Z

    .line 1380
    .line 1381
    iget-wide v3, v0, Lsy2;->x:J

    .line 1382
    .line 1383
    iput-wide v3, v2, Lt71;->a:J

    .line 1384
    .line 1385
    const/4 v14, 0x0

    .line 1386
    iput-boolean v14, v0, Lsy2;->w:Z

    .line 1387
    .line 1388
    move/from16 v26, v5

    .line 1389
    .line 1390
    goto :goto_20

    .line 1391
    :cond_48
    move/from16 v26, v3

    .line 1392
    .line 1393
    :goto_20
    if-eqz v26, :cond_1

    .line 1394
    .line 1395
    iget v3, v0, Lsy2;->l:I

    .line 1396
    .line 1397
    move/from16 v4, v33

    .line 1398
    .line 1399
    if-eq v3, v4, :cond_1

    .line 1400
    .line 1401
    :goto_21
    return v5

    .line 1402
    :cond_49
    iget v3, v0, Lsy2;->o:I

    .line 1403
    .line 1404
    iget-object v4, v0, Lsy2;->g:Lbe3;

    .line 1405
    .line 1406
    if-nez v3, :cond_4c

    .line 1407
    .line 1408
    iget-object v3, v4, Lbe3;->a:[B

    .line 1409
    .line 1410
    const/4 v14, 0x0

    .line 1411
    const/16 v15, 0x8

    .line 1412
    .line 1413
    invoke-interface {v1, v3, v14, v15, v5}, Ll51;->a([BIIZ)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v3

    .line 1417
    if-nez v3, :cond_4b

    .line 1418
    .line 1419
    iget v1, v0, Lsy2;->E:I

    .line 1420
    .line 1421
    const/4 v4, 0x2

    .line 1422
    if-ne v1, v4, :cond_0

    .line 1423
    .line 1424
    and-int/lit8 v1, v7, 0x2

    .line 1425
    .line 1426
    if-eqz v1, :cond_0

    .line 1427
    .line 1428
    iget-object v1, v0, Lsy2;->B:Lm51;

    .line 1429
    .line 1430
    const/4 v3, 0x4

    .line 1431
    invoke-interface {v1, v14, v3}, Lm51;->t(II)Lwv4;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    iget-object v2, v0, Lsy2;->F:Lxx2;

    .line 1436
    .line 1437
    if-nez v2, :cond_4a

    .line 1438
    .line 1439
    const/4 v11, 0x0

    .line 1440
    goto :goto_22

    .line 1441
    :cond_4a
    new-instance v11, Lqv2;

    .line 1442
    .line 1443
    const/4 v5, 0x1

    .line 1444
    new-array v3, v5, [Lpv2;

    .line 1445
    .line 1446
    aput-object v2, v3, v14

    .line 1447
    .line 1448
    invoke-direct {v11, v3}, Lqv2;-><init>([Lpv2;)V

    .line 1449
    .line 1450
    .line 1451
    :goto_22
    new-instance v2, Lsb1;

    .line 1452
    .line 1453
    invoke-direct {v2}, Lsb1;-><init>()V

    .line 1454
    .line 1455
    .line 1456
    iput-object v11, v2, Lsb1;->k:Lqv2;

    .line 1457
    .line 1458
    invoke-static {v2, v1}, Lf34;->l(Lsb1;Lwv4;)V

    .line 1459
    .line 1460
    .line 1461
    iget-object v1, v0, Lsy2;->B:Lm51;

    .line 1462
    .line 1463
    invoke-interface {v1}, Lm51;->p()V

    .line 1464
    .line 1465
    .line 1466
    iget-object v0, v0, Lsy2;->B:Lm51;

    .line 1467
    .line 1468
    new-instance v1, Lbo;

    .line 1469
    .line 1470
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    invoke-direct {v1, v2, v3}, Lbo;-><init>(J)V

    .line 1476
    .line 1477
    .line 1478
    invoke-interface {v0, v1}, Lm51;->w(Lm84;)V

    .line 1479
    .line 1480
    .line 1481
    const/16 v23, -0x1

    .line 1482
    .line 1483
    :goto_23
    return v23

    .line 1484
    :cond_4b
    const/16 v15, 0x8

    .line 1485
    .line 1486
    const/16 v23, -0x1

    .line 1487
    .line 1488
    iput v15, v0, Lsy2;->o:I

    .line 1489
    .line 1490
    const/4 v14, 0x0

    .line 1491
    invoke-virtual {v4, v14}, Lbe3;->N(I)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v4}, Lbe3;->C()J

    .line 1495
    .line 1496
    .line 1497
    move-result-wide v9

    .line 1498
    iput-wide v9, v0, Lsy2;->n:J

    .line 1499
    .line 1500
    invoke-virtual {v4}, Lbe3;->m()I

    .line 1501
    .line 1502
    .line 1503
    move-result v3

    .line 1504
    iput v3, v0, Lsy2;->m:I

    .line 1505
    .line 1506
    goto :goto_24

    .line 1507
    :cond_4c
    const/16 v23, -0x1

    .line 1508
    .line 1509
    :goto_24
    iget-wide v9, v0, Lsy2;->n:J

    .line 1510
    .line 1511
    const-wide/16 v11, 0x1

    .line 1512
    .line 1513
    cmp-long v3, v9, v11

    .line 1514
    .line 1515
    if-nez v3, :cond_4d

    .line 1516
    .line 1517
    iget-object v3, v4, Lbe3;->a:[B

    .line 1518
    .line 1519
    const/16 v15, 0x8

    .line 1520
    .line 1521
    invoke-interface {v1, v3, v15, v15}, Ll51;->readFully([BII)V

    .line 1522
    .line 1523
    .line 1524
    iget v3, v0, Lsy2;->o:I

    .line 1525
    .line 1526
    add-int/2addr v3, v15

    .line 1527
    iput v3, v0, Lsy2;->o:I

    .line 1528
    .line 1529
    invoke-virtual {v4}, Lbe3;->G()J

    .line 1530
    .line 1531
    .line 1532
    move-result-wide v9

    .line 1533
    iput-wide v9, v0, Lsy2;->n:J

    .line 1534
    .line 1535
    goto :goto_25

    .line 1536
    :cond_4d
    const-wide/16 v24, 0x0

    .line 1537
    .line 1538
    cmp-long v3, v9, v24

    .line 1539
    .line 1540
    if-nez v3, :cond_4f

    .line 1541
    .line 1542
    invoke-interface {v1}, Ll51;->getLength()J

    .line 1543
    .line 1544
    .line 1545
    move-result-wide v9

    .line 1546
    cmp-long v3, v9, v16

    .line 1547
    .line 1548
    if-nez v3, :cond_4e

    .line 1549
    .line 1550
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v3

    .line 1554
    check-cast v3, Loy2;

    .line 1555
    .line 1556
    if-eqz v3, :cond_4e

    .line 1557
    .line 1558
    iget-wide v9, v3, Loy2;->p:J

    .line 1559
    .line 1560
    :cond_4e
    cmp-long v3, v9, v16

    .line 1561
    .line 1562
    if-eqz v3, :cond_4f

    .line 1563
    .line 1564
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1565
    .line 1566
    .line 1567
    move-result-wide v11

    .line 1568
    sub-long/2addr v9, v11

    .line 1569
    iget v3, v0, Lsy2;->o:I

    .line 1570
    .line 1571
    int-to-long v11, v3

    .line 1572
    add-long/2addr v9, v11

    .line 1573
    iput-wide v9, v0, Lsy2;->n:J

    .line 1574
    .line 1575
    :cond_4f
    :goto_25
    iget-wide v9, v0, Lsy2;->n:J

    .line 1576
    .line 1577
    iget v3, v0, Lsy2;->o:I

    .line 1578
    .line 1579
    int-to-long v11, v3

    .line 1580
    cmp-long v5, v9, v11

    .line 1581
    .line 1582
    if-gez v5, :cond_51

    .line 1583
    .line 1584
    iget v5, v0, Lsy2;->m:I

    .line 1585
    .line 1586
    const v7, 0x66726565

    .line 1587
    .line 1588
    .line 1589
    if-ne v5, v7, :cond_50

    .line 1590
    .line 1591
    const/16 v15, 0x8

    .line 1592
    .line 1593
    if-ne v3, v15, :cond_50

    .line 1594
    .line 1595
    iput-wide v11, v0, Lsy2;->n:J

    .line 1596
    .line 1597
    goto :goto_26

    .line 1598
    :cond_50
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1599
    .line 1600
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    throw v0

    .line 1605
    :cond_51
    :goto_26
    iget v5, v0, Lsy2;->m:I

    .line 1606
    .line 1607
    const v7, 0x6d6f6f76

    .line 1608
    .line 1609
    .line 1610
    const v9, 0x6d657461

    .line 1611
    .line 1612
    .line 1613
    if-eq v5, v7, :cond_58

    .line 1614
    .line 1615
    const v7, 0x7472616b

    .line 1616
    .line 1617
    .line 1618
    if-eq v5, v7, :cond_58

    .line 1619
    .line 1620
    const v7, 0x6d646961

    .line 1621
    .line 1622
    .line 1623
    if-eq v5, v7, :cond_58

    .line 1624
    .line 1625
    const v7, 0x6d696e66

    .line 1626
    .line 1627
    .line 1628
    if-eq v5, v7, :cond_58

    .line 1629
    .line 1630
    const v7, 0x7374626c

    .line 1631
    .line 1632
    .line 1633
    if-eq v5, v7, :cond_58

    .line 1634
    .line 1635
    const v7, 0x65647473

    .line 1636
    .line 1637
    .line 1638
    if-eq v5, v7, :cond_58

    .line 1639
    .line 1640
    if-eq v5, v9, :cond_58

    .line 1641
    .line 1642
    const v7, 0x61787465

    .line 1643
    .line 1644
    .line 1645
    if-ne v5, v7, :cond_52

    .line 1646
    .line 1647
    goto/16 :goto_2a

    .line 1648
    .line 1649
    :cond_52
    const v6, 0x6d646864

    .line 1650
    .line 1651
    .line 1652
    if-eq v5, v6, :cond_53

    .line 1653
    .line 1654
    const v6, 0x6d766864

    .line 1655
    .line 1656
    .line 1657
    if-eq v5, v6, :cond_53

    .line 1658
    .line 1659
    const v6, 0x68646c72    # 4.3148E24f

    .line 1660
    .line 1661
    .line 1662
    if-eq v5, v6, :cond_53

    .line 1663
    .line 1664
    const v6, 0x73747364

    .line 1665
    .line 1666
    .line 1667
    if-eq v5, v6, :cond_53

    .line 1668
    .line 1669
    const v6, 0x73747473

    .line 1670
    .line 1671
    .line 1672
    if-eq v5, v6, :cond_53

    .line 1673
    .line 1674
    const v6, 0x73747373

    .line 1675
    .line 1676
    .line 1677
    if-eq v5, v6, :cond_53

    .line 1678
    .line 1679
    const v6, 0x63747473

    .line 1680
    .line 1681
    .line 1682
    if-eq v5, v6, :cond_53

    .line 1683
    .line 1684
    const v6, 0x656c7374

    .line 1685
    .line 1686
    .line 1687
    if-eq v5, v6, :cond_53

    .line 1688
    .line 1689
    const v6, 0x73747363

    .line 1690
    .line 1691
    .line 1692
    if-eq v5, v6, :cond_53

    .line 1693
    .line 1694
    const v6, 0x7374737a

    .line 1695
    .line 1696
    .line 1697
    if-eq v5, v6, :cond_53

    .line 1698
    .line 1699
    const v6, 0x73747a32

    .line 1700
    .line 1701
    .line 1702
    if-eq v5, v6, :cond_53

    .line 1703
    .line 1704
    const v6, 0x7374636f

    .line 1705
    .line 1706
    .line 1707
    if-eq v5, v6, :cond_53

    .line 1708
    .line 1709
    const v6, 0x636f3634

    .line 1710
    .line 1711
    .line 1712
    if-eq v5, v6, :cond_53

    .line 1713
    .line 1714
    const v6, 0x746b6864

    .line 1715
    .line 1716
    .line 1717
    if-eq v5, v6, :cond_53

    .line 1718
    .line 1719
    const v6, 0x66747970

    .line 1720
    .line 1721
    .line 1722
    if-eq v5, v6, :cond_53

    .line 1723
    .line 1724
    const v6, 0x75647461

    .line 1725
    .line 1726
    .line 1727
    if-eq v5, v6, :cond_53

    .line 1728
    .line 1729
    const v6, 0x6b657973

    .line 1730
    .line 1731
    .line 1732
    if-eq v5, v6, :cond_53

    .line 1733
    .line 1734
    const v6, 0x696c7374

    .line 1735
    .line 1736
    .line 1737
    if-ne v5, v6, :cond_54

    .line 1738
    .line 1739
    :cond_53
    const/16 v15, 0x8

    .line 1740
    .line 1741
    goto :goto_27

    .line 1742
    :cond_54
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1743
    .line 1744
    .line 1745
    move-result-wide v3

    .line 1746
    iget v5, v0, Lsy2;->o:I

    .line 1747
    .line 1748
    int-to-long v5, v5

    .line 1749
    sub-long v10, v3, v5

    .line 1750
    .line 1751
    iget v3, v0, Lsy2;->m:I

    .line 1752
    .line 1753
    const v4, 0x6d707664

    .line 1754
    .line 1755
    .line 1756
    if-ne v3, v4, :cond_55

    .line 1757
    .line 1758
    new-instance v7, Lxx2;

    .line 1759
    .line 1760
    add-long v14, v10, v5

    .line 1761
    .line 1762
    iget-wide v3, v0, Lsy2;->n:J

    .line 1763
    .line 1764
    sub-long v16, v3, v5

    .line 1765
    .line 1766
    const-wide/16 v8, 0x0

    .line 1767
    .line 1768
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    invoke-direct/range {v7 .. v17}, Lxx2;-><init>(JJJJJ)V

    .line 1774
    .line 1775
    .line 1776
    iput-object v7, v0, Lsy2;->F:Lxx2;

    .line 1777
    .line 1778
    :cond_55
    const/4 v3, 0x0

    .line 1779
    iput-object v3, v0, Lsy2;->p:Lbe3;

    .line 1780
    .line 1781
    const/4 v14, 0x1

    .line 1782
    iput v14, v0, Lsy2;->l:I

    .line 1783
    .line 1784
    goto/16 :goto_0

    .line 1785
    .line 1786
    :goto_27
    if-ne v3, v15, :cond_56

    .line 1787
    .line 1788
    const/4 v3, 0x1

    .line 1789
    goto :goto_28

    .line 1790
    :cond_56
    const/4 v3, 0x0

    .line 1791
    :goto_28
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 1792
    .line 1793
    .line 1794
    iget-wide v5, v0, Lsy2;->n:J

    .line 1795
    .line 1796
    const-wide/32 v7, 0x7fffffff

    .line 1797
    .line 1798
    .line 1799
    cmp-long v3, v5, v7

    .line 1800
    .line 1801
    if-gtz v3, :cond_57

    .line 1802
    .line 1803
    const/4 v3, 0x1

    .line 1804
    goto :goto_29

    .line 1805
    :cond_57
    const/4 v3, 0x0

    .line 1806
    :goto_29
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 1807
    .line 1808
    .line 1809
    new-instance v3, Lbe3;

    .line 1810
    .line 1811
    iget-wide v5, v0, Lsy2;->n:J

    .line 1812
    .line 1813
    long-to-int v5, v5

    .line 1814
    invoke-direct {v3, v5}, Lbe3;-><init>(I)V

    .line 1815
    .line 1816
    .line 1817
    iget-object v4, v4, Lbe3;->a:[B

    .line 1818
    .line 1819
    iget-object v5, v3, Lbe3;->a:[B

    .line 1820
    .line 1821
    const/4 v14, 0x0

    .line 1822
    const/16 v15, 0x8

    .line 1823
    .line 1824
    invoke-static {v4, v14, v5, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1825
    .line 1826
    .line 1827
    iput-object v3, v0, Lsy2;->p:Lbe3;

    .line 1828
    .line 1829
    const/4 v14, 0x1

    .line 1830
    iput v14, v0, Lsy2;->l:I

    .line 1831
    .line 1832
    goto/16 :goto_0

    .line 1833
    .line 1834
    :cond_58
    :goto_2a
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1835
    .line 1836
    .line 1837
    move-result-wide v3

    .line 1838
    iget-wide v10, v0, Lsy2;->n:J

    .line 1839
    .line 1840
    add-long/2addr v3, v10

    .line 1841
    iget v5, v0, Lsy2;->o:I

    .line 1842
    .line 1843
    int-to-long v12, v5

    .line 1844
    sub-long/2addr v3, v12

    .line 1845
    cmp-long v5, v10, v12

    .line 1846
    .line 1847
    if-eqz v5, :cond_59

    .line 1848
    .line 1849
    iget v5, v0, Lsy2;->m:I

    .line 1850
    .line 1851
    if-ne v5, v9, :cond_59

    .line 1852
    .line 1853
    const/16 v15, 0x8

    .line 1854
    .line 1855
    invoke-virtual {v8, v15}, Lbe3;->K(I)V

    .line 1856
    .line 1857
    .line 1858
    iget-object v5, v8, Lbe3;->a:[B

    .line 1859
    .line 1860
    const/4 v14, 0x0

    .line 1861
    invoke-interface {v1, v5, v14, v15}, Ll51;->n([BII)V

    .line 1862
    .line 1863
    .line 1864
    invoke-static {v8}, Lwu;->a(Lbe3;)V

    .line 1865
    .line 1866
    .line 1867
    iget v5, v8, Lbe3;->b:I

    .line 1868
    .line 1869
    invoke-interface {v1, v5}, Ll51;->l(I)V

    .line 1870
    .line 1871
    .line 1872
    invoke-interface {v1}, Ll51;->k()V

    .line 1873
    .line 1874
    .line 1875
    :cond_59
    new-instance v5, Loy2;

    .line 1876
    .line 1877
    iget v7, v0, Lsy2;->m:I

    .line 1878
    .line 1879
    invoke-direct {v5, v7, v3, v4}, Loy2;-><init>(IJ)V

    .line 1880
    .line 1881
    .line 1882
    invoke-virtual {v6, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1883
    .line 1884
    .line 1885
    iget-wide v5, v0, Lsy2;->n:J

    .line 1886
    .line 1887
    iget v7, v0, Lsy2;->o:I

    .line 1888
    .line 1889
    int-to-long v7, v7

    .line 1890
    cmp-long v5, v5, v7

    .line 1891
    .line 1892
    if-nez v5, :cond_5a

    .line 1893
    .line 1894
    invoke-virtual {v0, v3, v4}, Lsy2;->g(J)V

    .line 1895
    .line 1896
    .line 1897
    goto/16 :goto_0

    .line 1898
    .line 1899
    :cond_5a
    const/4 v14, 0x0

    .line 1900
    iput v14, v0, Lsy2;->l:I

    .line 1901
    .line 1902
    iput v14, v0, Lsy2;->o:I

    .line 1903
    .line 1904
    goto/16 :goto_0

    .line 1905
    .line 1906
    nop

    .line 1907
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ll51;)Z
    .locals 3

    .line 1
    iget v0, p0, Lsy2;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    invoke-static {p1, v2, v0}, Lud3;->F0(Ll51;ZZ)Lth4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, Lyw1;->o:Lvw1;

    .line 24
    .line 25
    sget-object v0, Lgy3;->r:Lgy3;

    .line 26
    .line 27
    :goto_1
    iput-object v0, p0, Lsy2;->k:Lgy3;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    return v2
.end method

.method public final d(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsy2;->h:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lsy2;->o:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lsy2;->q:I

    .line 11
    .line 12
    iput v0, p0, Lsy2;->r:I

    .line 13
    .line 14
    iput v0, p0, Lsy2;->s:I

    .line 15
    .line 16
    iput v0, p0, Lsy2;->t:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lsy2;->u:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lsy2;->z:Z

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long p1, p1, v2

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget p1, p0, Lsy2;->l:I

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    if-eq p1, p2, :cond_0

    .line 32
    .line 33
    iput v0, p0, Lsy2;->l:I

    .line 34
    .line 35
    iput v0, p0, Lsy2;->o:I

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object p1, p0, Lsy2;->i:Ls84;

    .line 39
    .line 40
    iget-object p2, p1, Ls84;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 43
    .line 44
    .line 45
    iput v0, p1, Ls84;->b:I

    .line 46
    .line 47
    iget-object p0, p0, Lsy2;->j:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object p0, p0, Lsy2;->C:[Lry2;

    .line 54
    .line 55
    array-length p1, p0

    .line 56
    move p2, v0

    .line 57
    :goto_0
    if-ge p2, p1, :cond_4

    .line 58
    .line 59
    aget-object v2, p0, p2

    .line 60
    .line 61
    iget-object v3, v2, Lry2;->b:Lxv4;

    .line 62
    .line 63
    invoke-virtual {v3, p3, p4}, Lxv4;->a(J)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-ne v4, v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {v3, p3, p4}, Lxv4;->b(J)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    :cond_2
    iput v4, v2, Lry2;->e:I

    .line 74
    .line 75
    iget-object v2, v2, Lry2;->d:Lmy4;

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    iput-boolean v0, v2, Lmy4;->b:Z

    .line 80
    .line 81
    iput v0, v2, Lmy4;->c:I

    .line 82
    .line 83
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    return-void
.end method

.method public final e()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lsy2;->k:Lgy3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lm51;)V
    .locals 2

    .line 1
    iget v0, p0, Lsy2;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lll;

    .line 8
    .line 9
    iget-object v1, p0, Lsy2;->a:Lxn4;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lll;-><init>(Lm51;Lxn4;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Lsy2;->B:Lm51;

    .line 16
    .line 17
    return-void
.end method

.method public final g(J)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Lsy2;->h:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    if-nez v2, :cond_38

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Loy2;

    .line 18
    .line 19
    iget-wide v5, v2, Loy2;->p:J

    .line 20
    .line 21
    cmp-long v2, v5, p1

    .line 22
    .line 23
    if-nez v2, :cond_38

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v5, v2

    .line 30
    check-cast v5, Loy2;

    .line 31
    .line 32
    iget v2, v5, Luv;->o:I

    .line 33
    .line 34
    const v6, 0x6d6f6f76

    .line 35
    .line 36
    .line 37
    if-ne v2, v6, :cond_37

    .line 38
    .line 39
    const v2, 0x6d657461

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v2}, Loy2;->r(I)Loy2;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-boolean v15, v0, Lsy2;->c:Z

    .line 52
    .line 53
    const/4 v7, 0x1

    .line 54
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    iget v8, v0, Lsy2;->b:I

    .line 57
    .line 58
    if-eqz v2, :cond_16

    .line 59
    .line 60
    invoke-static {v2}, Lwu;->f(Loy2;)Lqv2;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-boolean v9, v0, Lsy2;->y:Z

    .line 65
    .line 66
    const-class v10, Loi2;

    .line 67
    .line 68
    if-eqz v9, :cond_d

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v6, v2, Lqv2;->a:[Lpv2;

    .line 74
    .line 75
    array-length v9, v6

    .line 76
    move v11, v3

    .line 77
    :goto_1
    if-ge v11, v9, :cond_3

    .line 78
    .line 79
    aget-object v12, v6, v11

    .line 80
    .line 81
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-virtual {v10, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    if-eqz v13, :cond_1

    .line 90
    .line 91
    invoke-virtual {v10, v12}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    check-cast v12, Lpv2;

    .line 96
    .line 97
    move-object v13, v12

    .line 98
    check-cast v13, Loi2;

    .line 99
    .line 100
    iget-object v13, v13, Loi2;->a:Ljava/lang/String;

    .line 101
    .line 102
    const-string v14, "auxiliary.tracks.interleaved"

    .line 103
    .line 104
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_1
    const/4 v12, 0x0

    .line 112
    :goto_2
    if-eqz v12, :cond_2

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    const/4 v12, 0x0

    .line 119
    :goto_3
    check-cast v12, Loi2;

    .line 120
    .line 121
    if-eqz v12, :cond_4

    .line 122
    .line 123
    iget-object v9, v12, Loi2;->b:[B

    .line 124
    .line 125
    aget-byte v9, v9, v3

    .line 126
    .line 127
    if-nez v9, :cond_4

    .line 128
    .line 129
    iget-wide v11, v0, Lsy2;->x:J

    .line 130
    .line 131
    const-wide/16 v13, 0x10

    .line 132
    .line 133
    add-long/2addr v11, v13

    .line 134
    iput-wide v11, v0, Lsy2;->A:J

    .line 135
    .line 136
    :cond_4
    array-length v9, v6

    .line 137
    move v11, v3

    .line 138
    :goto_4
    if-ge v11, v9, :cond_7

    .line 139
    .line 140
    aget-object v12, v6, v11

    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v10, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_5

    .line 151
    .line 152
    invoke-virtual {v10, v12}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    check-cast v12, Lpv2;

    .line 157
    .line 158
    move-object v13, v12

    .line 159
    check-cast v13, Loi2;

    .line 160
    .line 161
    iget-object v13, v13, Loi2;->a:Ljava/lang/String;

    .line 162
    .line 163
    const-string v14, "auxiliary.tracks.map"

    .line 164
    .line 165
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-eqz v13, :cond_5

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_5
    const/4 v12, 0x0

    .line 173
    :goto_5
    if-eqz v12, :cond_6

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    const/4 v12, 0x0

    .line 180
    :goto_6
    check-cast v12, Loi2;

    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12}, Loi2;->d()Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    new-instance v9, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    move v10, v3

    .line 199
    :goto_7
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-ge v10, v11, :cond_c

    .line 204
    .line 205
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    check-cast v11, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_a

    .line 216
    .line 217
    if-eq v11, v7, :cond_9

    .line 218
    .line 219
    const/4 v12, 0x3

    .line 220
    if-eq v11, v4, :cond_b

    .line 221
    .line 222
    if-eq v11, v12, :cond_8

    .line 223
    .line 224
    move v12, v3

    .line 225
    goto :goto_8

    .line 226
    :cond_8
    const/4 v12, 0x4

    .line 227
    goto :goto_8

    .line 228
    :cond_9
    move v12, v4

    .line 229
    goto :goto_8

    .line 230
    :cond_a
    move v12, v7

    .line 231
    :cond_b
    :goto_8
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    add-int/lit8 v10, v10, 0x1

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_c
    move/from16 v18, v3

    .line 242
    .line 243
    move-object v3, v9

    .line 244
    goto/16 :goto_d

    .line 245
    .line 246
    :cond_d
    if-eqz v2, :cond_e

    .line 247
    .line 248
    and-int/lit8 v9, v8, 0x40

    .line 249
    .line 250
    if-nez v9, :cond_f

    .line 251
    .line 252
    :cond_e
    move/from16 v18, v3

    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_f
    iget-object v9, v2, Lqv2;->a:[Lpv2;

    .line 256
    .line 257
    array-length v11, v9

    .line 258
    move v12, v3

    .line 259
    :goto_9
    if-ge v12, v11, :cond_13

    .line 260
    .line 261
    aget-object v13, v9, v12

    .line 262
    .line 263
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    invoke-virtual {v10, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 268
    .line 269
    .line 270
    move-result v14

    .line 271
    if-eqz v14, :cond_10

    .line 272
    .line 273
    invoke-virtual {v10, v13}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    check-cast v13, Lpv2;

    .line 278
    .line 279
    move-object v14, v13

    .line 280
    check-cast v14, Loi2;

    .line 281
    .line 282
    iget-object v14, v14, Loi2;->a:Ljava/lang/String;

    .line 283
    .line 284
    move/from16 v18, v3

    .line 285
    .line 286
    const-string v3, "auxiliary.tracks.offset"

    .line 287
    .line 288
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_11

    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_10
    move/from16 v18, v3

    .line 296
    .line 297
    :cond_11
    const/4 v13, 0x0

    .line 298
    :goto_a
    if-eqz v13, :cond_12

    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_12
    add-int/lit8 v12, v12, 0x1

    .line 302
    .line 303
    move/from16 v3, v18

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_13
    move/from16 v18, v3

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    :goto_b
    check-cast v13, Loi2;

    .line 310
    .line 311
    if-nez v13, :cond_14

    .line 312
    .line 313
    goto :goto_c

    .line 314
    :cond_14
    new-instance v3, Lbe3;

    .line 315
    .line 316
    iget-object v9, v13, Loi2;->b:[B

    .line 317
    .line 318
    invoke-direct {v3, v9}, Lbe3;-><init>([B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3}, Lbe3;->G()J

    .line 322
    .line 323
    .line 324
    move-result-wide v9

    .line 325
    cmp-long v3, v9, v16

    .line 326
    .line 327
    if-gtz v3, :cond_15

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_15
    iput-wide v9, v0, Lsy2;->x:J

    .line 331
    .line 332
    iput-boolean v7, v0, Lsy2;->w:Z

    .line 333
    .line 334
    move-object/from16 v25, v1

    .line 335
    .line 336
    move/from16 v19, v7

    .line 337
    .line 338
    move/from16 v29, v15

    .line 339
    .line 340
    goto/16 :goto_2c

    .line 341
    .line 342
    :goto_c
    move-object v3, v6

    .line 343
    goto :goto_d

    .line 344
    :cond_16
    move/from16 v18, v3

    .line 345
    .line 346
    move-object v3, v6

    .line 347
    const/4 v2, 0x0

    .line 348
    :goto_d
    new-instance v14, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 351
    .line 352
    .line 353
    iget v6, v0, Lsy2;->E:I

    .line 354
    .line 355
    if-ne v6, v7, :cond_17

    .line 356
    .line 357
    move v11, v7

    .line 358
    goto :goto_e

    .line 359
    :cond_17
    move/from16 v11, v18

    .line 360
    .line 361
    :goto_e
    new-instance v6, Lzg1;

    .line 362
    .line 363
    invoke-direct {v6}, Lzg1;-><init>()V

    .line 364
    .line 365
    .line 366
    const v9, 0x75647461

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v9}, Loy2;->s(I)Lpy2;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    if-eqz v9, :cond_18

    .line 374
    .line 375
    invoke-static {v9}, Lwu;->k(Lpy2;)Lqv2;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    invoke-virtual {v6, v9}, Lzg1;->b(Lqv2;)V

    .line 380
    .line 381
    .line 382
    goto :goto_f

    .line 383
    :cond_18
    const/4 v9, 0x0

    .line 384
    :goto_f
    new-instance v10, Lqv2;

    .line 385
    .line 386
    const v12, 0x6d766864

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v12}, Loy2;->s(I)Lpy2;

    .line 390
    .line 391
    .line 392
    move-result-object v12

    .line 393
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    iget-object v12, v12, Lpy2;->p:Lbe3;

    .line 397
    .line 398
    invoke-static {v12}, Lwu;->g(Lbe3;)Luy2;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    new-array v13, v7, [Lpv2;

    .line 403
    .line 404
    aput-object v12, v13, v18

    .line 405
    .line 406
    invoke-direct {v10, v13}, Lqv2;-><init>([Lpv2;)V

    .line 407
    .line 408
    .line 409
    and-int/lit8 v12, v8, 0x1

    .line 410
    .line 411
    if-eqz v12, :cond_19

    .line 412
    .line 413
    move-object v12, v10

    .line 414
    move v10, v7

    .line 415
    goto :goto_10

    .line 416
    :cond_19
    move-object v12, v10

    .line 417
    move/from16 v10, v18

    .line 418
    .line 419
    :goto_10
    new-instance v13, Lzr2;

    .line 420
    .line 421
    const/16 v7, 0x1b

    .line 422
    .line 423
    invoke-direct {v13, v7}, Lzr2;-><init>(I)V

    .line 424
    .line 425
    .line 426
    move-object v7, v12

    .line 427
    move-object v12, v13

    .line 428
    iget-boolean v13, v0, Lsy2;->c:Z

    .line 429
    .line 430
    move-object/from16 v20, v7

    .line 431
    .line 432
    move/from16 v21, v8

    .line 433
    .line 434
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    move-object/from16 v22, v9

    .line 440
    .line 441
    const/4 v9, 0x0

    .line 442
    move-object/from16 v24, v20

    .line 443
    .line 444
    move-object/from16 v23, v22

    .line 445
    .line 446
    invoke-static/range {v5 .. v13}, Lwu;->j(Loy2;Lzg1;JLow0;ZZLeg1;Z)Ljava/util/ArrayList;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    iget-boolean v7, v0, Lsy2;->y:Z

    .line 451
    .line 452
    if-eqz v7, :cond_1b

    .line 453
    .line 454
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    if-ne v7, v8, :cond_1a

    .line 463
    .line 464
    const/4 v7, 0x1

    .line 465
    goto :goto_11

    .line 466
    :cond_1a
    move/from16 v7, v18

    .line 467
    .line 468
    :goto_11
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 469
    .line 470
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    const-string v10, ") is not same as the number of auxiliary tracks ("

    .line 479
    .line 480
    const-string v11, ")"

    .line 481
    .line 482
    const-string v12, "The number of auxiliary track types from metadata ("

    .line 483
    .line 484
    invoke-static {v12, v10, v8, v9, v11}, Lb11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    invoke-static {v8, v7}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 489
    .line 490
    .line 491
    :cond_1b
    invoke-static {v5}, Lau0;->r(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    move/from16 v11, v18

    .line 496
    .line 497
    move v12, v11

    .line 498
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    const/4 v13, -0x1

    .line 504
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :goto_12
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    if-ge v11, v8, :cond_30

    .line 514
    .line 515
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    check-cast v8, Lxv4;

    .line 520
    .line 521
    iget v4, v8, Lxv4;->b:I

    .line 522
    .line 523
    move-object/from16 v25, v1

    .line 524
    .line 525
    iget-object v1, v8, Lxv4;->a:Lpv4;

    .line 526
    .line 527
    if-nez v4, :cond_1c

    .line 528
    .line 529
    move-object/from16 v33, v3

    .line 530
    .line 531
    move-object/from16 v26, v5

    .line 532
    .line 533
    move-object/from16 v28, v7

    .line 534
    .line 535
    move/from16 v36, v11

    .line 536
    .line 537
    move/from16 v27, v12

    .line 538
    .line 539
    move/from16 v29, v15

    .line 540
    .line 541
    move-object/from16 v8, v23

    .line 542
    .line 543
    move-object/from16 v11, v24

    .line 544
    .line 545
    const/4 v1, 0x1

    .line 546
    move-object v12, v2

    .line 547
    const/4 v2, -0x1

    .line 548
    goto/16 :goto_25

    .line 549
    .line 550
    :cond_1c
    new-instance v4, Lry2;

    .line 551
    .line 552
    move-object/from16 v26, v5

    .line 553
    .line 554
    iget-object v5, v0, Lsy2;->B:Lm51;

    .line 555
    .line 556
    add-int/lit8 v27, v12, 0x1

    .line 557
    .line 558
    move-object/from16 v28, v7

    .line 559
    .line 560
    iget v7, v1, Lpv4;->b:I

    .line 561
    .line 562
    move/from16 v29, v15

    .line 563
    .line 564
    iget-object v15, v1, Lpv4;->g:Ltb1;

    .line 565
    .line 566
    invoke-interface {v5, v12, v7}, Lm51;->t(II)Lwv4;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    invoke-direct {v4, v1, v8, v5}, Lry2;-><init>(Lpv4;Lxv4;Lwv4;)V

    .line 571
    .line 572
    .line 573
    move-object v12, v2

    .line 574
    iget-wide v1, v1, Lpv4;->e:J

    .line 575
    .line 576
    cmp-long v30, v1, v19

    .line 577
    .line 578
    if-eqz v30, :cond_1d

    .line 579
    .line 580
    goto :goto_13

    .line 581
    :cond_1d
    iget-wide v1, v8, Lxv4;->i:J

    .line 582
    .line 583
    :goto_13
    invoke-interface {v5, v1, v2}, Lwv4;->d(J)V

    .line 584
    .line 585
    .line 586
    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 587
    .line 588
    .line 589
    move-result-wide v9

    .line 590
    iget-object v5, v15, Ltb1;->n:Ljava/lang/String;

    .line 591
    .line 592
    move-wide/from16 v30, v9

    .line 593
    .line 594
    iget-object v9, v15, Ltb1;->n:Ljava/lang/String;

    .line 595
    .line 596
    const-string v10, "audio/true-hd"

    .line 597
    .line 598
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v5

    .line 602
    iget v10, v8, Lxv4;->e:I

    .line 603
    .line 604
    if-eqz v5, :cond_1e

    .line 605
    .line 606
    mul-int/lit8 v10, v10, 0x10

    .line 607
    .line 608
    goto :goto_14

    .line 609
    :cond_1e
    add-int/lit8 v10, v10, 0x1e

    .line 610
    .line 611
    :goto_14
    invoke-virtual {v15}, Ltb1;->a()Lsb1;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    iput v10, v5, Lsb1;->n:I

    .line 616
    .line 617
    const/4 v10, 0x2

    .line 618
    if-ne v7, v10, :cond_22

    .line 619
    .line 620
    iget v10, v15, Ltb1;->f:I

    .line 621
    .line 622
    and-int/lit8 v32, v21, 0x8

    .line 623
    .line 624
    if-eqz v32, :cond_20

    .line 625
    .line 626
    move/from16 v32, v10

    .line 627
    .line 628
    const/4 v10, -0x1

    .line 629
    if-ne v13, v10, :cond_1f

    .line 630
    .line 631
    const/4 v10, 0x1

    .line 632
    goto :goto_15

    .line 633
    :cond_1f
    const/4 v10, 0x2

    .line 634
    :goto_15
    or-int v10, v32, v10

    .line 635
    .line 636
    :cond_20
    move/from16 v32, v10

    .line 637
    .line 638
    iget-boolean v10, v0, Lsy2;->y:Z

    .line 639
    .line 640
    if-eqz v10, :cond_21

    .line 641
    .line 642
    const v10, 0x8000

    .line 643
    .line 644
    .line 645
    or-int v10, v32, v10

    .line 646
    .line 647
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v32

    .line 651
    check-cast v32, Ljava/lang/Integer;

    .line 652
    .line 653
    move-object/from16 v33, v3

    .line 654
    .line 655
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Integer;->intValue()I

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    iput v3, v5, Lsb1;->g:I

    .line 660
    .line 661
    goto :goto_16

    .line 662
    :cond_21
    move-object/from16 v33, v3

    .line 663
    .line 664
    move/from16 v10, v32

    .line 665
    .line 666
    :goto_16
    iput v10, v5, Lsb1;->f:I

    .line 667
    .line 668
    goto :goto_17

    .line 669
    :cond_22
    move-object/from16 v33, v3

    .line 670
    .line 671
    :goto_17
    iget-object v3, v8, Lxv4;->f:[J

    .line 672
    .line 673
    iget-object v10, v8, Lxv4;->h:[I

    .line 674
    .line 675
    move-object/from16 v32, v3

    .line 676
    .line 677
    iget-boolean v3, v8, Lxv4;->j:Z

    .line 678
    .line 679
    invoke-static {v9}, Llw2;->l(Ljava/lang/String;)Z

    .line 680
    .line 681
    .line 682
    move-result v34

    .line 683
    if-nez v34, :cond_23

    .line 684
    .line 685
    move/from16 v36, v11

    .line 686
    .line 687
    :goto_18
    move-wide/from16 v1, v19

    .line 688
    .line 689
    goto :goto_1f

    .line 690
    :cond_23
    if-eqz v3, :cond_24

    .line 691
    .line 692
    move/from16 v34, v3

    .line 693
    .line 694
    iget v3, v8, Lxv4;->b:I

    .line 695
    .line 696
    :goto_19
    move-object/from16 v35, v10

    .line 697
    .line 698
    goto :goto_1a

    .line 699
    :cond_24
    move/from16 v34, v3

    .line 700
    .line 701
    array-length v3, v10

    .line 702
    goto :goto_19

    .line 703
    :goto_1a
    const/16 v10, 0x14

    .line 704
    .line 705
    invoke-static {v3, v10}, Ljava/lang/Math;->min(II)I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    cmp-long v10, v1, v19

    .line 710
    .line 711
    if-eqz v10, :cond_25

    .line 712
    .line 713
    const/4 v10, 0x1

    .line 714
    goto :goto_1b

    .line 715
    :cond_25
    move/from16 v10, v18

    .line 716
    .line 717
    :goto_1b
    invoke-static {v10}, Lrr2;->w(Z)V

    .line 718
    .line 719
    .line 720
    move/from16 v36, v11

    .line 721
    .line 722
    const-wide/32 v10, 0x989680

    .line 723
    .line 724
    .line 725
    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 726
    .line 727
    .line 728
    move-result-wide v1

    .line 729
    move-wide/from16 v37, v1

    .line 730
    .line 731
    move/from16 v10, v18

    .line 732
    .line 733
    move v11, v10

    .line 734
    const/4 v1, -0x1

    .line 735
    :goto_1c
    if-ge v10, v3, :cond_27

    .line 736
    .line 737
    if-eqz v34, :cond_26

    .line 738
    .line 739
    move v2, v10

    .line 740
    goto :goto_1d

    .line 741
    :cond_26
    aget v2, v35, v10

    .line 742
    .line 743
    :goto_1d
    aget-wide v39, v32, v2

    .line 744
    .line 745
    cmp-long v41, v39, v37

    .line 746
    .line 747
    if-lez v41, :cond_28

    .line 748
    .line 749
    :cond_27
    const/4 v10, -0x1

    .line 750
    goto :goto_1e

    .line 751
    :cond_28
    cmp-long v39, v39, v16

    .line 752
    .line 753
    if-ltz v39, :cond_29

    .line 754
    .line 755
    move/from16 v39, v2

    .line 756
    .line 757
    iget-object v2, v8, Lxv4;->d:[I

    .line 758
    .line 759
    aget v2, v2, v39

    .line 760
    .line 761
    if-le v2, v11, :cond_29

    .line 762
    .line 763
    move v11, v2

    .line 764
    move/from16 v1, v39

    .line 765
    .line 766
    :cond_29
    add-int/lit8 v10, v10, 0x1

    .line 767
    .line 768
    goto :goto_1c

    .line 769
    :goto_1e
    if-ne v1, v10, :cond_2a

    .line 770
    .line 771
    goto :goto_18

    .line 772
    :cond_2a
    aget-wide v1, v32, v1

    .line 773
    .line 774
    :goto_1f
    cmp-long v3, v1, v19

    .line 775
    .line 776
    if-eqz v3, :cond_2b

    .line 777
    .line 778
    new-instance v3, Lqv2;

    .line 779
    .line 780
    new-instance v8, Lrt4;

    .line 781
    .line 782
    invoke-direct {v8, v1, v2}, Lrt4;-><init>(J)V

    .line 783
    .line 784
    .line 785
    const/4 v1, 0x1

    .line 786
    new-array v2, v1, [Lpv2;

    .line 787
    .line 788
    aput-object v8, v2, v18

    .line 789
    .line 790
    invoke-direct {v3, v2}, Lqv2;-><init>([Lpv2;)V

    .line 791
    .line 792
    .line 793
    goto :goto_20

    .line 794
    :cond_2b
    const/4 v1, 0x1

    .line 795
    const/4 v3, 0x0

    .line 796
    :goto_20
    if-ne v7, v1, :cond_2c

    .line 797
    .line 798
    iget v2, v6, Lzg1;->a:I

    .line 799
    .line 800
    const/4 v10, -0x1

    .line 801
    if-eq v2, v10, :cond_2c

    .line 802
    .line 803
    iget v8, v6, Lzg1;->b:I

    .line 804
    .line 805
    if-eq v8, v10, :cond_2c

    .line 806
    .line 807
    iput v2, v5, Lsb1;->H:I

    .line 808
    .line 809
    iput v8, v5, Lsb1;->I:I

    .line 810
    .line 811
    :cond_2c
    iget-object v2, v15, Ltb1;->l:Lqv2;

    .line 812
    .line 813
    iget-object v8, v0, Lsy2;->j:Ljava/util/ArrayList;

    .line 814
    .line 815
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 816
    .line 817
    .line 818
    move-result v10

    .line 819
    if-eqz v10, :cond_2d

    .line 820
    .line 821
    const/4 v10, 0x0

    .line 822
    :goto_21
    move-object/from16 v8, v23

    .line 823
    .line 824
    move-object/from16 v11, v24

    .line 825
    .line 826
    goto :goto_22

    .line 827
    :cond_2d
    new-instance v10, Lqv2;

    .line 828
    .line 829
    invoke-direct {v10, v8}, Lqv2;-><init>(Ljava/util/List;)V

    .line 830
    .line 831
    .line 832
    goto :goto_21

    .line 833
    :goto_22
    filled-new-array {v10, v8, v11, v3}, [Lqv2;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    invoke-static {v7, v12, v5, v2, v3}, Lgh0;->D(ILqv2;Lsb1;Lqv2;[Lqv2;)V

    .line 838
    .line 839
    .line 840
    invoke-static/range {v28 .. v28}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    iput-object v2, v5, Lsb1;->l:Ljava/lang/String;

    .line 845
    .line 846
    const-string v2, "audio/mpeg"

    .line 847
    .line 848
    invoke-static {v9, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    if-eqz v2, :cond_2e

    .line 853
    .line 854
    new-instance v2, Ltb1;

    .line 855
    .line 856
    invoke-direct {v2, v5}, Ltb1;-><init>(Lsb1;)V

    .line 857
    .line 858
    .line 859
    iput-object v2, v4, Lry2;->f:Ltb1;

    .line 860
    .line 861
    :goto_23
    const/4 v10, 0x2

    .line 862
    goto :goto_24

    .line 863
    :cond_2e
    iget-object v2, v4, Lry2;->c:Lwv4;

    .line 864
    .line 865
    invoke-static {v5, v2}, Lf34;->l(Lsb1;Lwv4;)V

    .line 866
    .line 867
    .line 868
    goto :goto_23

    .line 869
    :goto_24
    const/4 v2, -0x1

    .line 870
    if-ne v7, v10, :cond_2f

    .line 871
    .line 872
    if-ne v13, v2, :cond_2f

    .line 873
    .line 874
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 875
    .line 876
    .line 877
    move-result v13

    .line 878
    :cond_2f
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-wide/from16 v9, v30

    .line 882
    .line 883
    :goto_25
    add-int/lit8 v3, v36, 0x1

    .line 884
    .line 885
    move-object/from16 v23, v8

    .line 886
    .line 887
    move-object/from16 v24, v11

    .line 888
    .line 889
    move-object v2, v12

    .line 890
    move-object/from16 v1, v25

    .line 891
    .line 892
    move-object/from16 v5, v26

    .line 893
    .line 894
    move/from16 v12, v27

    .line 895
    .line 896
    move-object/from16 v7, v28

    .line 897
    .line 898
    move/from16 v15, v29

    .line 899
    .line 900
    const/4 v4, 0x2

    .line 901
    move v11, v3

    .line 902
    move-object/from16 v3, v33

    .line 903
    .line 904
    goto/16 :goto_12

    .line 905
    .line 906
    :cond_30
    move-object/from16 v25, v1

    .line 907
    .line 908
    move/from16 v29, v15

    .line 909
    .line 910
    move/from16 v3, v18

    .line 911
    .line 912
    const/4 v1, 0x1

    .line 913
    const/4 v2, -0x1

    .line 914
    new-array v4, v3, [Lry2;

    .line 915
    .line 916
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    check-cast v3, [Lry2;

    .line 921
    .line 922
    iput-object v3, v0, Lsy2;->C:[Lry2;

    .line 923
    .line 924
    if-nez v29, :cond_36

    .line 925
    .line 926
    array-length v4, v3

    .line 927
    new-array v14, v4, [[J

    .line 928
    .line 929
    array-length v4, v3

    .line 930
    new-array v4, v4, [I

    .line 931
    .line 932
    array-length v5, v3

    .line 933
    new-array v5, v5, [J

    .line 934
    .line 935
    array-length v6, v3

    .line 936
    new-array v6, v6, [Z

    .line 937
    .line 938
    const/4 v7, 0x0

    .line 939
    :goto_26
    array-length v8, v3

    .line 940
    if-ge v7, v8, :cond_31

    .line 941
    .line 942
    aget-object v8, v3, v7

    .line 943
    .line 944
    iget-object v8, v8, Lry2;->b:Lxv4;

    .line 945
    .line 946
    iget v8, v8, Lxv4;->b:I

    .line 947
    .line 948
    new-array v8, v8, [J

    .line 949
    .line 950
    aput-object v8, v14, v7

    .line 951
    .line 952
    aget-object v8, v3, v7

    .line 953
    .line 954
    iget-object v8, v8, Lry2;->b:Lxv4;

    .line 955
    .line 956
    iget-object v8, v8, Lxv4;->f:[J

    .line 957
    .line 958
    const/16 v18, 0x0

    .line 959
    .line 960
    aget-wide v11, v8, v18

    .line 961
    .line 962
    aput-wide v11, v5, v7

    .line 963
    .line 964
    add-int/lit8 v7, v7, 0x1

    .line 965
    .line 966
    goto :goto_26

    .line 967
    :cond_31
    const/4 v7, 0x0

    .line 968
    :goto_27
    array-length v8, v3

    .line 969
    if-ge v7, v8, :cond_35

    .line 970
    .line 971
    const-wide v11, 0x7fffffffffffffffL

    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    move-wide/from16 v19, v11

    .line 977
    .line 978
    const/4 v8, 0x0

    .line 979
    move v11, v2

    .line 980
    :goto_28
    array-length v12, v3

    .line 981
    if-ge v8, v12, :cond_33

    .line 982
    .line 983
    aget-boolean v12, v6, v8

    .line 984
    .line 985
    if-nez v12, :cond_32

    .line 986
    .line 987
    aget-wide v21, v5, v8

    .line 988
    .line 989
    cmp-long v12, v21, v19

    .line 990
    .line 991
    if-gtz v12, :cond_32

    .line 992
    .line 993
    move v11, v8

    .line 994
    move-wide/from16 v19, v21

    .line 995
    .line 996
    :cond_32
    add-int/lit8 v8, v8, 0x1

    .line 997
    .line 998
    goto :goto_28

    .line 999
    :cond_33
    aget v8, v4, v11

    .line 1000
    .line 1001
    aget-object v12, v14, v11

    .line 1002
    .line 1003
    aput-wide v16, v12, v8

    .line 1004
    .line 1005
    aget-object v15, v3, v11

    .line 1006
    .line 1007
    iget-object v15, v15, Lry2;->b:Lxv4;

    .line 1008
    .line 1009
    iget-object v2, v15, Lxv4;->d:[I

    .line 1010
    .line 1011
    aget v2, v2, v8

    .line 1012
    .line 1013
    move/from16 v19, v1

    .line 1014
    .line 1015
    int-to-long v1, v2

    .line 1016
    add-long v16, v16, v1

    .line 1017
    .line 1018
    add-int/lit8 v8, v8, 0x1

    .line 1019
    .line 1020
    aput v8, v4, v11

    .line 1021
    .line 1022
    array-length v1, v12

    .line 1023
    if-ge v8, v1, :cond_34

    .line 1024
    .line 1025
    iget-object v1, v15, Lxv4;->f:[J

    .line 1026
    .line 1027
    aget-wide v20, v1, v8

    .line 1028
    .line 1029
    aput-wide v20, v5, v11

    .line 1030
    .line 1031
    goto :goto_29

    .line 1032
    :cond_34
    aput-boolean v19, v6, v11

    .line 1033
    .line 1034
    add-int/lit8 v7, v7, 0x1

    .line 1035
    .line 1036
    :goto_29
    move/from16 v1, v19

    .line 1037
    .line 1038
    const/4 v2, -0x1

    .line 1039
    goto :goto_27

    .line 1040
    :cond_35
    :goto_2a
    move/from16 v19, v1

    .line 1041
    .line 1042
    goto :goto_2b

    .line 1043
    :cond_36
    const/4 v14, 0x0

    .line 1044
    goto :goto_2a

    .line 1045
    :goto_2b
    iput-object v14, v0, Lsy2;->D:[[J

    .line 1046
    .line 1047
    iget-object v1, v0, Lsy2;->B:Lm51;

    .line 1048
    .line 1049
    invoke-interface {v1}, Lm51;->p()V

    .line 1050
    .line 1051
    .line 1052
    iget-object v1, v0, Lsy2;->B:Lm51;

    .line 1053
    .line 1054
    new-instance v2, Lqy2;

    .line 1055
    .line 1056
    iget-object v3, v0, Lsy2;->C:[Lry2;

    .line 1057
    .line 1058
    invoke-direct {v2, v9, v10, v3, v13}, Lqy2;-><init>(J[Lry2;I)V

    .line 1059
    .line 1060
    .line 1061
    invoke-interface {v1, v2}, Lm51;->w(Lm84;)V

    .line 1062
    .line 1063
    .line 1064
    :goto_2c
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayDeque;->clear()V

    .line 1065
    .line 1066
    .line 1067
    move/from16 v1, v19

    .line 1068
    .line 1069
    iput-boolean v1, v0, Lsy2;->z:Z

    .line 1070
    .line 1071
    iget-boolean v1, v0, Lsy2;->w:Z

    .line 1072
    .line 1073
    if-nez v1, :cond_0

    .line 1074
    .line 1075
    if-nez v29, :cond_0

    .line 1076
    .line 1077
    const/4 v10, 0x2

    .line 1078
    iput v10, v0, Lsy2;->l:I

    .line 1079
    .line 1080
    goto/16 :goto_0

    .line 1081
    .line 1082
    :cond_37
    move-object/from16 v25, v1

    .line 1083
    .line 1084
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-nez v1, :cond_0

    .line 1089
    .line 1090
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    check-cast v1, Loy2;

    .line 1095
    .line 1096
    iget-object v1, v1, Loy2;->r:Ljava/util/ArrayList;

    .line 1097
    .line 1098
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    goto/16 :goto_0

    .line 1102
    .line 1103
    :cond_38
    iget v1, v0, Lsy2;->l:I

    .line 1104
    .line 1105
    const/4 v10, 0x2

    .line 1106
    if-eq v1, v10, :cond_39

    .line 1107
    .line 1108
    const/4 v3, 0x0

    .line 1109
    iput v3, v0, Lsy2;->l:I

    .line 1110
    .line 1111
    iput v3, v0, Lsy2;->o:I

    .line 1112
    .line 1113
    :cond_39
    return-void
.end method
