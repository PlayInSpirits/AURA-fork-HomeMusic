.class public final Lfn0;
.super Lnn0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:I

.field public final D:I

.field public final E:Z

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:Z

.field public final K:Z

.field public final L:Z

.field public final r:I

.field public final s:Z

.field public final t:Ljava/lang/String;

.field public final u:Ljn0;

.field public final v:Z

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILsv4;ILjn0;IZLen0;I)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnn0;-><init>(ILsv4;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lfn0;->u:Ljn0;

    .line 5
    .line 6
    iget-boolean p1, p4, Ljn0;->z0:Z

    .line 7
    .line 8
    iget-object p2, p4, Lcw4;->v:Lyw1;

    .line 9
    .line 10
    iget-object p3, p4, Lcw4;->q:Lyw1;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 p1, 0x18

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p1, 0x10

    .line 18
    .line 19
    :goto_0
    const/4 p8, 0x0

    .line 20
    iput-boolean p8, p0, Lfn0;->A:Z

    .line 21
    .line 22
    iget-object v0, p0, Lnn0;->q:Ltb1;

    .line 23
    .line 24
    iget-object v0, v0, Ltb1;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Lpn0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lfn0;->t:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p5, p8}, Lkq;->n(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput-boolean v0, p0, Lfn0;->v:Z

    .line 37
    .line 38
    move v0, p8

    .line 39
    :goto_1
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const v2, 0x7fffffff

    .line 44
    .line 45
    .line 46
    if-ge v0, v1, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lnn0;->q:Ltb1;

    .line 49
    .line 50
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, v3, p8}, Lpn0;->c(Ltb1;Ljava/lang/String;Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lez v1, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v1, p8

    .line 67
    move v0, v2

    .line 68
    :goto_2
    iput v0, p0, Lfn0;->x:I

    .line 69
    .line 70
    iput v1, p0, Lfn0;->w:I

    .line 71
    .line 72
    iget-object p3, p0, Lnn0;->q:Ltb1;

    .line 73
    .line 74
    iget p3, p3, Ltb1;->f:I

    .line 75
    .line 76
    iget v0, p4, Lcw4;->s:I

    .line 77
    .line 78
    if-eqz p3, :cond_3

    .line 79
    .line 80
    if-ne p3, v0, :cond_3

    .line 81
    .line 82
    move p3, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    and-int/2addr p3, v0

    .line 85
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    :goto_3
    iput p3, p0, Lfn0;->y:I

    .line 90
    .line 91
    iget-object p3, p0, Lnn0;->q:Ltb1;

    .line 92
    .line 93
    iget-object v0, p4, Lcw4;->r:Lyw1;

    .line 94
    .line 95
    invoke-static {p3, v0}, Lpn0;->a(Ltb1;Lyw1;)I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    iput p3, p0, Lfn0;->z:I

    .line 100
    .line 101
    iget-object p3, p0, Lnn0;->q:Ltb1;

    .line 102
    .line 103
    iget v0, p3, Ltb1;->f:I

    .line 104
    .line 105
    const/4 v1, 0x1

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    and-int/2addr v0, v1

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_4
    move v0, p8

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    :goto_4
    move v0, v1

    .line 115
    :goto_5
    iput-boolean v0, p0, Lfn0;->B:Z

    .line 116
    .line 117
    iget v0, p3, Ltb1;->e:I

    .line 118
    .line 119
    and-int/2addr v0, v1

    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    move v0, v1

    .line 123
    goto :goto_6

    .line 124
    :cond_6
    move v0, p8

    .line 125
    :goto_6
    iput-boolean v0, p0, Lfn0;->E:Z

    .line 126
    .line 127
    iget-object v0, p3, Ltb1;->n:Ljava/lang/String;

    .line 128
    .line 129
    const/4 v3, 0x2

    .line 130
    const/4 v4, -0x1

    .line 131
    if-nez v0, :cond_7

    .line 132
    .line 133
    goto :goto_9

    .line 134
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    sparse-switch v5, :sswitch_data_0

    .line 139
    .line 140
    .line 141
    :goto_7
    move v0, v4

    .line 142
    goto :goto_8

    .line 143
    :sswitch_0
    const-string v5, "audio/iamf"

    .line 144
    .line 145
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_8

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_8
    move v0, v3

    .line 153
    goto :goto_8

    .line 154
    :sswitch_1
    const-string v5, "audio/ac4"

    .line 155
    .line 156
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_9

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_9
    move v0, v1

    .line 164
    goto :goto_8

    .line 165
    :sswitch_2
    const-string v5, "audio/eac3-joc"

    .line 166
    .line 167
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_a

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_a
    move v0, p8

    .line 175
    :goto_8
    packed-switch v0, :pswitch_data_0

    .line 176
    .line 177
    .line 178
    :goto_9
    move v0, p8

    .line 179
    goto :goto_a

    .line 180
    :pswitch_0
    move v0, v1

    .line 181
    :goto_a
    iput-boolean v0, p0, Lfn0;->L:Z

    .line 182
    .line 183
    iget v0, p3, Ltb1;->F:I

    .line 184
    .line 185
    iput v0, p0, Lfn0;->F:I

    .line 186
    .line 187
    iget v5, p3, Ltb1;->G:I

    .line 188
    .line 189
    iput v5, p0, Lfn0;->G:I

    .line 190
    .line 191
    iget v5, p3, Ltb1;->j:I

    .line 192
    .line 193
    iput v5, p0, Lfn0;->H:I

    .line 194
    .line 195
    if-eq v5, v4, :cond_b

    .line 196
    .line 197
    iget v6, p4, Lcw4;->u:I

    .line 198
    .line 199
    if-gt v5, v6, :cond_d

    .line 200
    .line 201
    :cond_b
    if-eq v0, v4, :cond_c

    .line 202
    .line 203
    iget p4, p4, Lcw4;->t:I

    .line 204
    .line 205
    if-gt v0, p4, :cond_d

    .line 206
    .line 207
    :cond_c
    invoke-virtual {p7, p3}, Len0;->apply(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_d

    .line 212
    .line 213
    move p3, v1

    .line 214
    goto :goto_b

    .line 215
    :cond_d
    move p3, p8

    .line 216
    :goto_b
    iput-boolean p3, p0, Lfn0;->s:Z

    .line 217
    .line 218
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    invoke-virtual {p3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    invoke-virtual {p3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    const-string p4, ","

    .line 235
    .line 236
    invoke-virtual {p3, p4, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    move p4, p8

    .line 241
    :goto_c
    array-length p7, p3

    .line 242
    if-ge p4, p7, :cond_e

    .line 243
    .line 244
    aget-object p7, p3, p4

    .line 245
    .line 246
    invoke-static {p7}, Lf35;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p7

    .line 250
    aput-object p7, p3, p4

    .line 251
    .line 252
    add-int/lit8 p4, p4, 0x1

    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_e
    move p4, p8

    .line 256
    :goto_d
    array-length p7, p3

    .line 257
    if-ge p4, p7, :cond_10

    .line 258
    .line 259
    iget-object p7, p0, Lnn0;->q:Ltb1;

    .line 260
    .line 261
    aget-object v0, p3, p4

    .line 262
    .line 263
    invoke-static {p7, v0, p8}, Lpn0;->c(Ltb1;Ljava/lang/String;Z)I

    .line 264
    .line 265
    .line 266
    move-result p7

    .line 267
    if-lez p7, :cond_f

    .line 268
    .line 269
    goto :goto_e

    .line 270
    :cond_f
    add-int/lit8 p4, p4, 0x1

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :cond_10
    move p7, p8

    .line 274
    move p4, v2

    .line 275
    :goto_e
    iput p4, p0, Lfn0;->C:I

    .line 276
    .line 277
    iput p7, p0, Lfn0;->D:I

    .line 278
    .line 279
    move p3, p8

    .line 280
    :goto_f
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 281
    .line 282
    .line 283
    move-result p4

    .line 284
    if-ge p3, p4, :cond_12

    .line 285
    .line 286
    iget-object p4, p0, Lnn0;->q:Ltb1;

    .line 287
    .line 288
    iget-object p4, p4, Ltb1;->n:Ljava/lang/String;

    .line 289
    .line 290
    if-eqz p4, :cond_11

    .line 291
    .line 292
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p7

    .line 296
    invoke-virtual {p4, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p4

    .line 300
    if-eqz p4, :cond_11

    .line 301
    .line 302
    move v2, p3

    .line 303
    goto :goto_10

    .line 304
    :cond_11
    add-int/lit8 p3, p3, 0x1

    .line 305
    .line 306
    goto :goto_f

    .line 307
    :cond_12
    :goto_10
    iput v2, p0, Lfn0;->I:I

    .line 308
    .line 309
    and-int/lit16 p2, p5, 0x180

    .line 310
    .line 311
    const/16 p3, 0x80

    .line 312
    .line 313
    if-ne p2, p3, :cond_13

    .line 314
    .line 315
    move p2, v1

    .line 316
    goto :goto_11

    .line 317
    :cond_13
    move p2, p8

    .line 318
    :goto_11
    iput-boolean p2, p0, Lfn0;->J:Z

    .line 319
    .line 320
    and-int/lit8 p2, p5, 0x40

    .line 321
    .line 322
    const/16 p3, 0x40

    .line 323
    .line 324
    if-ne p2, p3, :cond_14

    .line 325
    .line 326
    move p2, v1

    .line 327
    goto :goto_12

    .line 328
    :cond_14
    move p2, p8

    .line 329
    :goto_12
    iput-boolean p2, p0, Lfn0;->K:Z

    .line 330
    .line 331
    iget-object p2, p0, Lnn0;->q:Ltb1;

    .line 332
    .line 333
    iget-boolean p3, p0, Lfn0;->s:Z

    .line 334
    .line 335
    iget-object p4, p0, Lfn0;->u:Ljn0;

    .line 336
    .line 337
    iget-boolean p7, p4, Ljn0;->B0:Z

    .line 338
    .line 339
    iget-object v0, p4, Lcw4;->w:Law4;

    .line 340
    .line 341
    invoke-static {p5, p7}, Lkq;->n(IZ)Z

    .line 342
    .line 343
    .line 344
    move-result p7

    .line 345
    if-nez p7, :cond_15

    .line 346
    .line 347
    goto :goto_13

    .line 348
    :cond_15
    if-nez p3, :cond_16

    .line 349
    .line 350
    iget-boolean p7, p4, Ljn0;->y0:Z

    .line 351
    .line 352
    if-nez p7, :cond_16

    .line 353
    .line 354
    goto :goto_13

    .line 355
    :cond_16
    iget p7, v0, Law4;->a:I

    .line 356
    .line 357
    if-ne p7, v3, :cond_17

    .line 358
    .line 359
    invoke-static {p4, p5, p2}, Lpn0;->h(Ljn0;ILtb1;)Z

    .line 360
    .line 361
    .line 362
    move-result p7

    .line 363
    if-nez p7, :cond_17

    .line 364
    .line 365
    goto :goto_13

    .line 366
    :cond_17
    invoke-static {p5, p8}, Lkq;->n(IZ)Z

    .line 367
    .line 368
    .line 369
    move-result p7

    .line 370
    if-eqz p7, :cond_19

    .line 371
    .line 372
    if-eqz p3, :cond_19

    .line 373
    .line 374
    iget p2, p2, Ltb1;->j:I

    .line 375
    .line 376
    if-eq p2, v4, :cond_19

    .line 377
    .line 378
    iget-boolean p2, p4, Lcw4;->G:Z

    .line 379
    .line 380
    if-nez p2, :cond_19

    .line 381
    .line 382
    iget-boolean p2, p4, Lcw4;->F:Z

    .line 383
    .line 384
    if-nez p2, :cond_19

    .line 385
    .line 386
    iget-boolean p2, p4, Ljn0;->C0:Z

    .line 387
    .line 388
    if-nez p2, :cond_18

    .line 389
    .line 390
    if-nez p6, :cond_19

    .line 391
    .line 392
    :cond_18
    iget p2, v0, Law4;->a:I

    .line 393
    .line 394
    if-eq p2, v3, :cond_19

    .line 395
    .line 396
    and-int/2addr p1, p5

    .line 397
    if-eqz p1, :cond_19

    .line 398
    .line 399
    move p8, v3

    .line 400
    goto :goto_13

    .line 401
    :cond_19
    move p8, v1

    .line 402
    :goto_13
    iput p8, p0, Lfn0;->r:I

    .line 403
    .line 404
    return-void

    .line 405
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59afdf4a -> :sswitch_0
    .end sparse-switch

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lfn0;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public final b(Lnn0;)Z
    .locals 5

    .line 1
    check-cast p1, Lfn0;

    .line 2
    .line 3
    iget-object v0, p1, Lnn0;->q:Ltb1;

    .line 4
    .line 5
    iget-object v1, p0, Lfn0;->u:Ljn0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lnn0;->q:Ltb1;

    .line 11
    .line 12
    iget v2, v1, Ltb1;->F:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    if-eq v2, v3, :cond_1

    .line 16
    .line 17
    iget v4, v0, Ltb1;->F:I

    .line 18
    .line 19
    if-ne v2, v4, :cond_1

    .line 20
    .line 21
    iget-boolean v2, p0, Lfn0;->A:Z

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Ltb1;->n:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Ltb1;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    :cond_0
    iget v1, v1, Ltb1;->G:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    iget v0, v0, Ltb1;->G:I

    .line 42
    .line 43
    if-ne v1, v0, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p0, Lfn0;->J:Z

    .line 46
    .line 47
    iget-boolean v1, p1, Lfn0;->J:Z

    .line 48
    .line 49
    if-ne v0, v1, :cond_1

    .line 50
    .line 51
    iget-boolean p0, p0, Lfn0;->K:Z

    .line 52
    .line 53
    iget-boolean p1, p1, Lfn0;->K:Z

    .line 54
    .line 55
    if-ne p0, p1, :cond_1

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_1
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public final c(Lfn0;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, Lfn0;->v:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lfn0;->s:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v2, Lpn0;->k:Lgb3;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Lpn0;->k:Lgb3;

    .line 13
    .line 14
    invoke-virtual {v2}, Lgb3;->a()Lgb3;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    iget-boolean v3, p1, Lfn0;->v:Z

    .line 19
    .line 20
    iget v4, p1, Lfn0;->H:I

    .line 21
    .line 22
    sget-object v5, Lv60;->a:Lt60;

    .line 23
    .line 24
    invoke-virtual {v5, v0, v3}, Lt60;->c(ZZ)Lv60;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v3, p0, Lfn0;->x:I

    .line 29
    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget v5, p1, Lfn0;->x:I

    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Lx13;->p:Lx13;

    .line 41
    .line 42
    invoke-virtual {v0, v3, v5, v6}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v3, p0, Lfn0;->w:I

    .line 47
    .line 48
    iget v5, p1, Lfn0;->w:I

    .line 49
    .line 50
    invoke-virtual {v0, v3, v5}, Lv60;->a(II)Lv60;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v3, p0, Lfn0;->y:I

    .line 55
    .line 56
    iget v5, p1, Lfn0;->y:I

    .line 57
    .line 58
    invoke-virtual {v0, v3, v5}, Lv60;->a(II)Lv60;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget v3, p0, Lfn0;->z:I

    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget v5, p1, Lfn0;->z:I

    .line 69
    .line 70
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v0, v3, v5, v6}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-boolean v3, p0, Lfn0;->E:Z

    .line 79
    .line 80
    iget-boolean v5, p1, Lfn0;->E:Z

    .line 81
    .line 82
    invoke-virtual {v0, v3, v5}, Lv60;->c(ZZ)Lv60;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-boolean v3, p0, Lfn0;->B:Z

    .line 87
    .line 88
    iget-boolean v5, p1, Lfn0;->B:Z

    .line 89
    .line 90
    invoke-virtual {v0, v3, v5}, Lv60;->c(ZZ)Lv60;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v3, p0, Lfn0;->C:I

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v5, p1, Lfn0;->C:I

    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v0, v3, v5, v6}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget v3, p0, Lfn0;->D:I

    .line 111
    .line 112
    iget v5, p1, Lfn0;->D:I

    .line 113
    .line 114
    invoke-virtual {v0, v3, v5}, Lv60;->a(II)Lv60;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-boolean v3, p1, Lfn0;->s:Z

    .line 119
    .line 120
    invoke-virtual {v0, v1, v3}, Lv60;->c(ZZ)Lv60;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget v1, p0, Lfn0;->I:I

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget v3, p1, Lfn0;->I:I

    .line 131
    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v0, v1, v3, v6}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v1, p0, Lfn0;->u:Ljn0;

    .line 141
    .line 142
    iget-boolean v1, v1, Lcw4;->F:Z

    .line 143
    .line 144
    iget v3, p0, Lfn0;->H:I

    .line 145
    .line 146
    if-eqz v1, :cond_1

    .line 147
    .line 148
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    sget-object v6, Lpn0;->k:Lgb3;

    .line 157
    .line 158
    invoke-virtual {v6}, Lgb3;->a()Lgb3;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v0, v1, v5, v6}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :cond_1
    iget-boolean v1, p0, Lfn0;->J:Z

    .line 167
    .line 168
    iget-boolean v5, p1, Lfn0;->J:Z

    .line 169
    .line 170
    invoke-virtual {v0, v1, v5}, Lv60;->c(ZZ)Lv60;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-boolean v1, p0, Lfn0;->K:Z

    .line 175
    .line 176
    iget-boolean v5, p1, Lfn0;->K:Z

    .line 177
    .line 178
    invoke-virtual {v0, v1, v5}, Lv60;->c(ZZ)Lv60;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-boolean v1, p0, Lfn0;->L:Z

    .line 183
    .line 184
    iget-boolean v5, p1, Lfn0;->L:Z

    .line 185
    .line 186
    invoke-virtual {v0, v1, v5}, Lv60;->c(ZZ)Lv60;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget v1, p0, Lfn0;->F:I

    .line 191
    .line 192
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget v5, p1, Lfn0;->F:I

    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v0, v1, v5, v2}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget v1, p0, Lfn0;->G:I

    .line 207
    .line 208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget v5, p1, Lfn0;->G:I

    .line 213
    .line 214
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v0, v1, v5, v2}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget-object p0, p0, Lfn0;->t:Ljava/lang/String;

    .line 223
    .line 224
    iget-object p1, p1, Lfn0;->t:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-eqz p0, :cond_2

    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v0, p0, p1, v2}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :cond_2
    invoke-virtual {v0}, Lv60;->e()I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    return p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lfn0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfn0;->c(Lfn0;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
