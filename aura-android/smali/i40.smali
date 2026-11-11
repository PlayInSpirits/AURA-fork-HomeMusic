.class public abstract Li40;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Li40;->a:[B

    .line 8
    .line 9
    const-string v0, "B"

    .line 10
    .line 11
    const-string v1, "C"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const-string v3, "A"

    .line 16
    .line 17
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Li40;->b:[Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "^\\D?(\\d+)$"

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Li40;->c:Ljava/util/regex/Pattern;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static a(IZII[II)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    sget-object v1, Li40;->b:[Ljava/lang/String;

    .line 4
    .line 5
    aget-object p0, v1, p0

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/16 p1, 0x48

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x4c

    .line 21
    .line 22
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p5

    .line 30
    filled-new-array {p0, p2, p3, p1, p5}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 35
    .line 36
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    const-string p2, "hvc1.%s%d.%X.%c%d"

    .line 39
    .line 40
    invoke-static {p1, p2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    array-length p0, p4

    .line 48
    :goto_1
    if-lez p0, :cond_1

    .line 49
    .line 50
    add-int/lit8 p1, p0, -0x1

    .line 51
    .line 52
    aget p1, p4, p1

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    add-int/lit8 p0, p0, -0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 p1, 0x0

    .line 60
    :goto_2
    if-ge p1, p0, :cond_2

    .line 61
    .line 62
    aget p2, p4, p1

    .line 63
    .line 64
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const-string p3, ".%02X"

    .line 73
    .line 74
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static b(Ltb1;)Landroid/util/Pair;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-object v5, v0, Ltb1;->k:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v6, v0, Ltb1;->k:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    return-object v7

    .line 21
    :cond_0
    const-string v8, "\\."

    .line 22
    .line 23
    invoke-virtual {v5, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-string v8, "video/dolby-vision"

    .line 28
    .line 29
    iget-object v9, v0, Ltb1;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    const/16 v16, 0x1000

    .line 36
    .line 37
    const/16 v17, 0x200

    .line 38
    .line 39
    const/16 v18, 0x80

    .line 40
    .line 41
    const/16 v19, 0x40

    .line 42
    .line 43
    const/16 v20, 0x20

    .line 44
    .line 45
    const/16 v21, 0x100

    .line 46
    .line 47
    move-object/from16 v22, v7

    .line 48
    .line 49
    const/16 v11, 0x10

    .line 50
    .line 51
    const/16 v23, 0x400

    .line 52
    .line 53
    const/4 v14, 0x4

    .line 54
    const/16 v24, 0x800

    .line 55
    .line 56
    const/4 v15, 0x3

    .line 57
    const-string v10, "CodecSpecificDataUtil"

    .line 58
    .line 59
    const/16 v25, 0x8

    .line 60
    .line 61
    const/4 v9, 0x2

    .line 62
    if-eqz v8, :cond_1f

    .line 63
    .line 64
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v19

    .line 84
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v18

    .line 88
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v20

    .line 92
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v17

    .line 96
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v21

    .line 100
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v23

    .line 104
    move/from16 v26, v1

    .line 105
    .line 106
    array-length v1, v5

    .line 107
    const-string v13, "Ignoring malformed Dolby Vision codec string: "

    .line 108
    .line 109
    if-ge v1, v15, :cond_1

    .line 110
    .line 111
    invoke-static {v13, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v22

    .line 115
    :cond_1
    sget-object v1, Li40;->c:Ljava/util/regex/Pattern;

    .line 116
    .line 117
    aget-object v14, v5, v3

    .line 118
    .line 119
    invoke-virtual {v1, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    if-nez v14, :cond_2

    .line 128
    .line 129
    invoke-static {v13, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v22

    .line 133
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v6, "10"

    .line 138
    .line 139
    const-string v13, "09"

    .line 140
    .line 141
    const-string v14, "08"

    .line 142
    .line 143
    const-string v12, "07"

    .line 144
    .line 145
    const-string v7, "06"

    .line 146
    .line 147
    move/from16 v28, v9

    .line 148
    .line 149
    const-string v9, "05"

    .line 150
    .line 151
    move/from16 v29, v3

    .line 152
    .line 153
    const-string v3, "04"

    .line 154
    .line 155
    const-string v15, "03"

    .line 156
    .line 157
    move-object/from16 p0, v0

    .line 158
    .line 159
    const-string v0, "02"

    .line 160
    .line 161
    move-object/from16 v31, v2

    .line 162
    .line 163
    const-string v2, "01"

    .line 164
    .line 165
    if-nez v1, :cond_3

    .line 166
    .line 167
    move-object/from16 v32, v8

    .line 168
    .line 169
    :goto_0
    move-object/from16 v8, v22

    .line 170
    .line 171
    goto/16 :goto_4

    .line 172
    .line 173
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 174
    .line 175
    .line 176
    move-result v32

    .line 177
    sparse-switch v32, :sswitch_data_0

    .line 178
    .line 179
    .line 180
    :goto_1
    move-object/from16 v32, v8

    .line 181
    .line 182
    :goto_2
    const/4 v8, -0x1

    .line 183
    goto/16 :goto_3

    .line 184
    .line 185
    :sswitch_0
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v32

    .line 189
    if-nez v32, :cond_4

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    move-object/from16 v32, v8

    .line 193
    .line 194
    const/16 v8, 0xa

    .line 195
    .line 196
    goto/16 :goto_3

    .line 197
    .line 198
    :sswitch_1
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v32

    .line 202
    if-nez v32, :cond_5

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_5
    move-object/from16 v32, v8

    .line 206
    .line 207
    const/16 v8, 0x9

    .line 208
    .line 209
    goto/16 :goto_3

    .line 210
    .line 211
    :sswitch_2
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v32

    .line 215
    if-nez v32, :cond_6

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_6
    move-object/from16 v32, v8

    .line 219
    .line 220
    move/from16 v8, v25

    .line 221
    .line 222
    goto/16 :goto_3

    .line 223
    .line 224
    :sswitch_3
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v32

    .line 228
    if-nez v32, :cond_7

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_7
    move-object/from16 v32, v8

    .line 232
    .line 233
    const/4 v8, 0x7

    .line 234
    goto :goto_3

    .line 235
    :sswitch_4
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v32

    .line 239
    if-nez v32, :cond_8

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_8
    move-object/from16 v32, v8

    .line 243
    .line 244
    const/4 v8, 0x6

    .line 245
    goto :goto_3

    .line 246
    :sswitch_5
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v32

    .line 250
    if-nez v32, :cond_9

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_9
    move-object/from16 v32, v8

    .line 254
    .line 255
    const/4 v8, 0x5

    .line 256
    goto :goto_3

    .line 257
    :sswitch_6
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v32

    .line 261
    if-nez v32, :cond_a

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_a
    move-object/from16 v32, v8

    .line 265
    .line 266
    const/4 v8, 0x4

    .line 267
    goto :goto_3

    .line 268
    :sswitch_7
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v32

    .line 272
    if-nez v32, :cond_b

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_b
    move-object/from16 v32, v8

    .line 276
    .line 277
    const/4 v8, 0x3

    .line 278
    goto :goto_3

    .line 279
    :sswitch_8
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v32

    .line 283
    if-nez v32, :cond_c

    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_c
    move-object/from16 v32, v8

    .line 287
    .line 288
    move/from16 v8, v28

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :sswitch_9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v32

    .line 295
    if-nez v32, :cond_d

    .line 296
    .line 297
    goto :goto_1

    .line 298
    :cond_d
    move-object/from16 v32, v8

    .line 299
    .line 300
    move/from16 v8, v29

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :sswitch_a
    move-object/from16 v32, v8

    .line 304
    .line 305
    const-string v8, "00"

    .line 306
    .line 307
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    if-nez v8, :cond_e

    .line 312
    .line 313
    goto/16 :goto_2

    .line 314
    .line 315
    :cond_e
    move/from16 v8, v26

    .line 316
    .line 317
    :goto_3
    packed-switch v8, :pswitch_data_0

    .line 318
    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :pswitch_0
    move-object/from16 v8, v21

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :pswitch_1
    move-object/from16 v8, v17

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :pswitch_2
    move-object/from16 v8, v20

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :pswitch_3
    move-object/from16 v8, v18

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :pswitch_4
    move-object/from16 v8, v19

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :pswitch_5
    move-object v8, v11

    .line 338
    goto :goto_4

    .line 339
    :pswitch_6
    move-object/from16 v8, v32

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :pswitch_7
    move-object/from16 v8, v31

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :pswitch_8
    move-object/from16 v8, p0

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :pswitch_9
    move-object/from16 v8, v23

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :pswitch_a
    move-object v8, v4

    .line 352
    :goto_4
    if-nez v8, :cond_f

    .line 353
    .line 354
    const-string v0, "Unknown Dolby Vision profile string: "

    .line 355
    .line 356
    invoke-static {v0, v1, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-object v22

    .line 360
    :cond_f
    aget-object v1, v5, v28

    .line 361
    .line 362
    if-nez v1, :cond_10

    .line 363
    .line 364
    :goto_5
    move-object/from16 v4, v22

    .line 365
    .line 366
    goto/16 :goto_9

    .line 367
    .line 368
    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    sparse-switch v5, :sswitch_data_1

    .line 373
    .line 374
    .line 375
    :goto_6
    const/16 v27, -0x1

    .line 376
    .line 377
    goto/16 :goto_8

    .line 378
    .line 379
    :sswitch_b
    const-string v0, "13"

    .line 380
    .line 381
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_11

    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_11
    const/16 v0, 0xc

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :sswitch_c
    const-string v0, "12"

    .line 392
    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-nez v0, :cond_12

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_12
    const/16 v0, 0xb

    .line 401
    .line 402
    :goto_7
    move/from16 v27, v0

    .line 403
    .line 404
    goto/16 :goto_8

    .line 405
    .line 406
    :sswitch_d
    const-string v0, "11"

    .line 407
    .line 408
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-nez v0, :cond_13

    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_13
    const/16 v27, 0xa

    .line 416
    .line 417
    goto/16 :goto_8

    .line 418
    .line 419
    :sswitch_e
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-nez v0, :cond_14

    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_14
    const/16 v27, 0x9

    .line 427
    .line 428
    goto/16 :goto_8

    .line 429
    .line 430
    :sswitch_f
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_15

    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_15
    move/from16 v27, v25

    .line 438
    .line 439
    goto :goto_8

    .line 440
    :sswitch_10
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_16

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_16
    const/16 v27, 0x7

    .line 448
    .line 449
    goto :goto_8

    .line 450
    :sswitch_11
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-nez v0, :cond_17

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_17
    const/16 v27, 0x6

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :sswitch_12
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-nez v0, :cond_18

    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_18
    const/16 v27, 0x5

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :sswitch_13
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-nez v0, :cond_19

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :cond_19
    const/16 v27, 0x4

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :sswitch_14
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-nez v0, :cond_1a

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_1a
    const/16 v27, 0x3

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :sswitch_15
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-nez v0, :cond_1b

    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_1b
    move/from16 v27, v28

    .line 498
    .line 499
    goto :goto_8

    .line 500
    :sswitch_16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-nez v0, :cond_1c

    .line 505
    .line 506
    goto/16 :goto_6

    .line 507
    .line 508
    :cond_1c
    move/from16 v27, v29

    .line 509
    .line 510
    goto :goto_8

    .line 511
    :sswitch_17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-nez v0, :cond_1d

    .line 516
    .line 517
    goto/16 :goto_6

    .line 518
    .line 519
    :cond_1d
    move/from16 v27, v26

    .line 520
    .line 521
    :goto_8
    packed-switch v27, :pswitch_data_1

    .line 522
    .line 523
    .line 524
    goto/16 :goto_5

    .line 525
    .line 526
    :pswitch_b
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    goto :goto_9

    .line 531
    :pswitch_c
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    goto :goto_9

    .line 536
    :pswitch_d
    move-object/from16 v4, v21

    .line 537
    .line 538
    goto :goto_9

    .line 539
    :pswitch_e
    move-object/from16 v4, v17

    .line 540
    .line 541
    goto :goto_9

    .line 542
    :pswitch_f
    move-object/from16 v4, v20

    .line 543
    .line 544
    goto :goto_9

    .line 545
    :pswitch_10
    move-object/from16 v4, v18

    .line 546
    .line 547
    goto :goto_9

    .line 548
    :pswitch_11
    move-object/from16 v4, v19

    .line 549
    .line 550
    goto :goto_9

    .line 551
    :pswitch_12
    move-object v4, v11

    .line 552
    goto :goto_9

    .line 553
    :pswitch_13
    move-object/from16 v4, v32

    .line 554
    .line 555
    goto :goto_9

    .line 556
    :pswitch_14
    move-object/from16 v4, v31

    .line 557
    .line 558
    goto :goto_9

    .line 559
    :pswitch_15
    move-object/from16 v4, p0

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :pswitch_16
    move-object/from16 v4, v23

    .line 563
    .line 564
    :goto_9
    :pswitch_17
    if-nez v4, :cond_1e

    .line 565
    .line 566
    const-string v0, "Unknown Dolby Vision level string: "

    .line 567
    .line 568
    invoke-static {v0, v1, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    return-object v22

    .line 572
    :cond_1e
    new-instance v0, Landroid/util/Pair;

    .line 573
    .line 574
    invoke-direct {v0, v8, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    return-object v0

    .line 578
    :cond_1f
    move/from16 v26, v1

    .line 579
    .line 580
    move/from16 v29, v3

    .line 581
    .line 582
    move/from16 v28, v9

    .line 583
    .line 584
    aget-object v1, v5, v26

    .line 585
    .line 586
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    sparse-switch v3, :sswitch_data_2

    .line 594
    .line 595
    .line 596
    :goto_a
    const/4 v9, -0x1

    .line 597
    goto/16 :goto_b

    .line 598
    .line 599
    :sswitch_18
    const-string v3, "vp09"

    .line 600
    .line 601
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    if-nez v1, :cond_20

    .line 606
    .line 607
    goto :goto_a

    .line 608
    :cond_20
    const/16 v9, 0xa

    .line 609
    .line 610
    goto/16 :goto_b

    .line 611
    .line 612
    :sswitch_19
    const-string v3, "s263"

    .line 613
    .line 614
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    if-nez v1, :cond_21

    .line 619
    .line 620
    goto :goto_a

    .line 621
    :cond_21
    const/16 v9, 0x9

    .line 622
    .line 623
    goto/16 :goto_b

    .line 624
    .line 625
    :sswitch_1a
    const-string v3, "mp4a"

    .line 626
    .line 627
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-nez v1, :cond_22

    .line 632
    .line 633
    goto :goto_a

    .line 634
    :cond_22
    move/from16 v9, v25

    .line 635
    .line 636
    goto/16 :goto_b

    .line 637
    .line 638
    :sswitch_1b
    const-string v3, "iamf"

    .line 639
    .line 640
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v1

    .line 644
    if-nez v1, :cond_23

    .line 645
    .line 646
    goto :goto_a

    .line 647
    :cond_23
    const/4 v9, 0x7

    .line 648
    goto :goto_b

    .line 649
    :sswitch_1c
    const-string v3, "hvc1"

    .line 650
    .line 651
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-nez v1, :cond_24

    .line 656
    .line 657
    goto :goto_a

    .line 658
    :cond_24
    const/4 v9, 0x6

    .line 659
    goto :goto_b

    .line 660
    :sswitch_1d
    const-string v3, "hev1"

    .line 661
    .line 662
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-nez v1, :cond_25

    .line 667
    .line 668
    goto :goto_a

    .line 669
    :cond_25
    const/4 v9, 0x5

    .line 670
    goto :goto_b

    .line 671
    :sswitch_1e
    const-string v3, "avc2"

    .line 672
    .line 673
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    if-nez v1, :cond_26

    .line 678
    .line 679
    goto :goto_a

    .line 680
    :cond_26
    const/4 v9, 0x4

    .line 681
    goto :goto_b

    .line 682
    :sswitch_1f
    const-string v3, "avc1"

    .line 683
    .line 684
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    if-nez v1, :cond_27

    .line 689
    .line 690
    goto :goto_a

    .line 691
    :cond_27
    const/4 v9, 0x3

    .line 692
    goto :goto_b

    .line 693
    :sswitch_20
    const-string v3, "av01"

    .line 694
    .line 695
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v1

    .line 699
    if-nez v1, :cond_28

    .line 700
    .line 701
    goto :goto_a

    .line 702
    :cond_28
    move/from16 v9, v28

    .line 703
    .line 704
    goto :goto_b

    .line 705
    :sswitch_21
    const-string v3, "apv1"

    .line 706
    .line 707
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    if-nez v1, :cond_29

    .line 712
    .line 713
    goto :goto_a

    .line 714
    :cond_29
    move/from16 v9, v29

    .line 715
    .line 716
    goto :goto_b

    .line 717
    :sswitch_22
    const-string v3, "ac-4"

    .line 718
    .line 719
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    if-nez v1, :cond_2a

    .line 724
    .line 725
    goto/16 :goto_a

    .line 726
    .line 727
    :cond_2a
    move/from16 v9, v26

    .line 728
    .line 729
    :goto_b
    const/16 v1, 0x2000

    .line 730
    .line 731
    packed-switch v9, :pswitch_data_2

    .line 732
    .line 733
    .line 734
    return-object v22

    .line 735
    :pswitch_18
    array-length v0, v5

    .line 736
    const-string v2, "Ignoring malformed VP9 codec string: "

    .line 737
    .line 738
    const/4 v3, 0x3

    .line 739
    if-ge v0, v3, :cond_2b

    .line 740
    .line 741
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    return-object v22

    .line 745
    :cond_2b
    :try_start_0
    aget-object v0, v5, v29

    .line 746
    .line 747
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    aget-object v3, v5, v28

    .line 752
    .line 753
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 754
    .line 755
    .line 756
    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 757
    if-eqz v0, :cond_2f

    .line 758
    .line 759
    move/from16 v3, v29

    .line 760
    .line 761
    if-eq v0, v3, :cond_2e

    .line 762
    .line 763
    move/from16 v3, v28

    .line 764
    .line 765
    if-eq v0, v3, :cond_2d

    .line 766
    .line 767
    const/4 v3, 0x3

    .line 768
    if-eq v0, v3, :cond_2c

    .line 769
    .line 770
    const/4 v3, -0x1

    .line 771
    :goto_c
    const/4 v4, -0x1

    .line 772
    goto :goto_d

    .line 773
    :cond_2c
    move/from16 v3, v25

    .line 774
    .line 775
    goto :goto_c

    .line 776
    :cond_2d
    const/4 v3, 0x4

    .line 777
    goto :goto_c

    .line 778
    :cond_2e
    const/4 v3, 0x2

    .line 779
    goto :goto_c

    .line 780
    :cond_2f
    const/4 v3, 0x1

    .line 781
    goto :goto_c

    .line 782
    :goto_d
    if-ne v3, v4, :cond_30

    .line 783
    .line 784
    const-string v1, "Unknown VP9 profile: "

    .line 785
    .line 786
    invoke-static {v0, v1, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    return-object v22

    .line 790
    :cond_30
    const/16 v0, 0xa

    .line 791
    .line 792
    if-eq v2, v0, :cond_3a

    .line 793
    .line 794
    const/16 v0, 0xb

    .line 795
    .line 796
    if-eq v2, v0, :cond_39

    .line 797
    .line 798
    const/16 v0, 0x14

    .line 799
    .line 800
    if-eq v2, v0, :cond_38

    .line 801
    .line 802
    const/16 v0, 0x15

    .line 803
    .line 804
    if-eq v2, v0, :cond_37

    .line 805
    .line 806
    const/16 v0, 0x1e

    .line 807
    .line 808
    if-eq v2, v0, :cond_36

    .line 809
    .line 810
    const/16 v0, 0x1f

    .line 811
    .line 812
    if-eq v2, v0, :cond_35

    .line 813
    .line 814
    const/16 v0, 0x28

    .line 815
    .line 816
    if-eq v2, v0, :cond_34

    .line 817
    .line 818
    const/16 v0, 0x29

    .line 819
    .line 820
    if-eq v2, v0, :cond_33

    .line 821
    .line 822
    const/16 v0, 0x32

    .line 823
    .line 824
    if-eq v2, v0, :cond_32

    .line 825
    .line 826
    const/16 v0, 0x33

    .line 827
    .line 828
    if-eq v2, v0, :cond_31

    .line 829
    .line 830
    packed-switch v2, :pswitch_data_3

    .line 831
    .line 832
    .line 833
    const/4 v1, -0x1

    .line 834
    :goto_e
    :pswitch_19
    const/4 v4, -0x1

    .line 835
    goto :goto_f

    .line 836
    :pswitch_1a
    move/from16 v1, v16

    .line 837
    .line 838
    goto :goto_e

    .line 839
    :pswitch_1b
    move/from16 v1, v24

    .line 840
    .line 841
    goto :goto_e

    .line 842
    :cond_31
    move/from16 v1, v17

    .line 843
    .line 844
    goto :goto_e

    .line 845
    :cond_32
    move/from16 v1, v21

    .line 846
    .line 847
    goto :goto_e

    .line 848
    :cond_33
    move/from16 v1, v18

    .line 849
    .line 850
    goto :goto_e

    .line 851
    :cond_34
    move/from16 v1, v19

    .line 852
    .line 853
    goto :goto_e

    .line 854
    :cond_35
    move/from16 v1, v20

    .line 855
    .line 856
    goto :goto_e

    .line 857
    :cond_36
    move v1, v11

    .line 858
    goto :goto_e

    .line 859
    :cond_37
    move/from16 v1, v25

    .line 860
    .line 861
    goto :goto_e

    .line 862
    :cond_38
    const/4 v1, 0x4

    .line 863
    goto :goto_e

    .line 864
    :cond_39
    const/4 v1, 0x2

    .line 865
    goto :goto_e

    .line 866
    :cond_3a
    const/4 v1, 0x1

    .line 867
    goto :goto_e

    .line 868
    :goto_f
    if-ne v1, v4, :cond_3b

    .line 869
    .line 870
    const-string v0, "Unknown VP9 level: "

    .line 871
    .line 872
    invoke-static {v2, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    return-object v22

    .line 876
    :cond_3b
    new-instance v0, Landroid/util/Pair;

    .line 877
    .line 878
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    return-object v0

    .line 890
    :catch_0
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    return-object v22

    .line 894
    :pswitch_1c
    new-instance v0, Landroid/util/Pair;

    .line 895
    .line 896
    invoke-direct {v0, v4, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    array-length v1, v5

    .line 900
    const-string v2, "Ignoring malformed H263 codec string: "

    .line 901
    .line 902
    const/4 v3, 0x3

    .line 903
    if-ge v1, v3, :cond_3c

    .line 904
    .line 905
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    return-object v0

    .line 909
    :cond_3c
    const/16 v29, 0x1

    .line 910
    .line 911
    :try_start_1
    aget-object v1, v5, v29

    .line 912
    .line 913
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    const/16 v28, 0x2

    .line 918
    .line 919
    aget-object v3, v5, v28

    .line 920
    .line 921
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    new-instance v4, Landroid/util/Pair;

    .line 926
    .line 927
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-direct {v4, v1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 936
    .line 937
    .line 938
    return-object v4

    .line 939
    :catch_1
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    return-object v0

    .line 943
    :pswitch_1d
    array-length v0, v5

    .line 944
    const-string v1, "Ignoring malformed MP4A codec string: "

    .line 945
    .line 946
    const/4 v3, 0x3

    .line 947
    if-eq v0, v3, :cond_3d

    .line 948
    .line 949
    invoke-static {v1, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    return-object v22

    .line 953
    :cond_3d
    const/16 v29, 0x1

    .line 954
    .line 955
    :try_start_2
    aget-object v0, v5, v29

    .line 956
    .line 957
    invoke-static {v0, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    invoke-static {v0}, Llw2;->e(I)Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    const-string v3, "audio/mp4a-latm"

    .line 966
    .line 967
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    if-eqz v0, :cond_3f

    .line 972
    .line 973
    const/16 v28, 0x2

    .line 974
    .line 975
    aget-object v0, v5, v28

    .line 976
    .line 977
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    const/16 v3, 0x11

    .line 982
    .line 983
    if-eq v0, v3, :cond_3e

    .line 984
    .line 985
    const/16 v3, 0x14

    .line 986
    .line 987
    if-eq v0, v3, :cond_3e

    .line 988
    .line 989
    const/16 v3, 0x17

    .line 990
    .line 991
    if-eq v0, v3, :cond_3e

    .line 992
    .line 993
    const/16 v3, 0x1d

    .line 994
    .line 995
    if-eq v0, v3, :cond_3e

    .line 996
    .line 997
    const/16 v3, 0x27

    .line 998
    .line 999
    if-eq v0, v3, :cond_3e

    .line 1000
    .line 1001
    const/16 v3, 0x2a

    .line 1002
    .line 1003
    if-eq v0, v3, :cond_3e

    .line 1004
    .line 1005
    packed-switch v0, :pswitch_data_4

    .line 1006
    .line 1007
    .line 1008
    const/4 v3, -0x1

    .line 1009
    :cond_3e
    :goto_10
    const/4 v4, -0x1

    .line 1010
    goto :goto_11

    .line 1011
    :pswitch_1e
    const/4 v3, 0x6

    .line 1012
    goto :goto_10

    .line 1013
    :pswitch_1f
    const/4 v3, 0x5

    .line 1014
    goto :goto_10

    .line 1015
    :pswitch_20
    const/4 v3, 0x4

    .line 1016
    goto :goto_10

    .line 1017
    :pswitch_21
    const/4 v3, 0x3

    .line 1018
    goto :goto_10

    .line 1019
    :pswitch_22
    const/4 v3, 0x2

    .line 1020
    goto :goto_10

    .line 1021
    :pswitch_23
    const/4 v3, 0x1

    .line 1022
    goto :goto_10

    .line 1023
    :goto_11
    if-eq v3, v4, :cond_3f

    .line 1024
    .line 1025
    new-instance v0, Landroid/util/Pair;

    .line 1026
    .line 1027
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    invoke-direct {v0, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1032
    .line 1033
    .line 1034
    return-object v0

    .line 1035
    :catch_2
    invoke-static {v1, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_3f
    return-object v22

    .line 1039
    :pswitch_24
    array-length v0, v5

    .line 1040
    const/4 v1, 0x4

    .line 1041
    if-ge v0, v1, :cond_40

    .line 1042
    .line 1043
    const-string v0, "Ignoring malformed IAMF codec string: "

    .line 1044
    .line 1045
    invoke-static {v0, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    return-object v22

    .line 1049
    :cond_40
    const/16 v29, 0x1

    .line 1050
    .line 1051
    :try_start_3
    aget-object v0, v5, v29

    .line 1052
    .line 1053
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1054
    .line 1055
    .line 1056
    move-result v0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1057
    add-int/2addr v0, v11

    .line 1058
    shl-int v0, v29, v0

    .line 1059
    .line 1060
    const/16 v30, 0x3

    .line 1061
    .line 1062
    aget-object v1, v5, v30

    .line 1063
    .line 1064
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    sparse-switch v3, :sswitch_data_3

    .line 1072
    .line 1073
    .line 1074
    :goto_12
    const/4 v1, -0x1

    .line 1075
    goto :goto_13

    .line 1076
    :sswitch_23
    const-string v3, "mp4a"

    .line 1077
    .line 1078
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    if-nez v1, :cond_41

    .line 1083
    .line 1084
    goto :goto_12

    .line 1085
    :cond_41
    const/4 v1, 0x3

    .line 1086
    goto :goto_13

    .line 1087
    :sswitch_24
    const-string v3, "ipcm"

    .line 1088
    .line 1089
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v1

    .line 1093
    if-nez v1, :cond_42

    .line 1094
    .line 1095
    goto :goto_12

    .line 1096
    :cond_42
    const/4 v1, 0x2

    .line 1097
    goto :goto_13

    .line 1098
    :sswitch_25
    const-string v3, "fLaC"

    .line 1099
    .line 1100
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v1

    .line 1104
    if-nez v1, :cond_43

    .line 1105
    .line 1106
    goto :goto_12

    .line 1107
    :cond_43
    const/4 v1, 0x1

    .line 1108
    goto :goto_13

    .line 1109
    :sswitch_26
    const-string v3, "Opus"

    .line 1110
    .line 1111
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    if-nez v1, :cond_44

    .line 1116
    .line 1117
    goto :goto_12

    .line 1118
    :cond_44
    move/from16 v1, v26

    .line 1119
    .line 1120
    :goto_13
    packed-switch v1, :pswitch_data_5

    .line 1121
    .line 1122
    .line 1123
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    const-string v1, "Ignoring unknown codec identifier for IAMF auxiliary profile: "

    .line 1126
    .line 1127
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    const/16 v30, 0x3

    .line 1131
    .line 1132
    aget-object v1, v5, v30

    .line 1133
    .line 1134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-static {v10, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    return-object v22

    .line 1145
    :pswitch_25
    const/4 v3, 0x2

    .line 1146
    goto :goto_14

    .line 1147
    :pswitch_26
    move/from16 v3, v25

    .line 1148
    .line 1149
    goto :goto_14

    .line 1150
    :pswitch_27
    const/4 v3, 0x4

    .line 1151
    goto :goto_14

    .line 1152
    :pswitch_28
    const/4 v3, 0x1

    .line 1153
    :goto_14
    new-instance v1, Landroid/util/Pair;

    .line 1154
    .line 1155
    const/high16 v4, 0x1000000

    .line 1156
    .line 1157
    or-int/2addr v0, v4

    .line 1158
    or-int/2addr v0, v3

    .line 1159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    return-object v1

    .line 1167
    :catch_3
    move-exception v0

    .line 1168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    const-string v2, "Ignoring malformed primary profile in IAMF codec string: "

    .line 1171
    .line 1172
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    const/16 v29, 0x1

    .line 1176
    .line 1177
    aget-object v2, v5, v29

    .line 1178
    .line 1179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    invoke-static {v10, v1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1187
    .line 1188
    .line 1189
    return-object v22

    .line 1190
    :pswitch_29
    iget-object v0, v0, Ltb1;->D:Lc50;

    .line 1191
    .line 1192
    invoke-static {v6, v5, v0}, Li40;->c(Ljava/lang/String;[Ljava/lang/String;Lc50;)Landroid/util/Pair;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    return-object v0

    .line 1197
    :pswitch_2a
    array-length v0, v5

    .line 1198
    const-string v2, "Ignoring malformed AVC codec string: "

    .line 1199
    .line 1200
    const/4 v3, 0x2

    .line 1201
    if-ge v0, v3, :cond_45

    .line 1202
    .line 1203
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1204
    .line 1205
    .line 1206
    return-object v22

    .line 1207
    :cond_45
    const/16 v29, 0x1

    .line 1208
    .line 1209
    :try_start_4
    aget-object v0, v5, v29

    .line 1210
    .line 1211
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    const/4 v4, 0x6

    .line 1216
    if-ne v0, v4, :cond_46

    .line 1217
    .line 1218
    aget-object v0, v5, v29

    .line 1219
    .line 1220
    move/from16 v4, v26

    .line 1221
    .line 1222
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    invoke-static {v0, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1227
    .line 1228
    .line 1229
    move-result v0

    .line 1230
    aget-object v3, v5, v29

    .line 1231
    .line 1232
    const/4 v4, 0x4

    .line 1233
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v3

    .line 1237
    invoke-static {v3, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1238
    .line 1239
    .line 1240
    move-result v2

    .line 1241
    goto :goto_15

    .line 1242
    :cond_46
    array-length v0, v5

    .line 1243
    const/4 v3, 0x3

    .line 1244
    if-lt v0, v3, :cond_50

    .line 1245
    .line 1246
    const/16 v29, 0x1

    .line 1247
    .line 1248
    aget-object v0, v5, v29

    .line 1249
    .line 1250
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v0

    .line 1254
    const/16 v28, 0x2

    .line 1255
    .line 1256
    aget-object v3, v5, v28

    .line 1257
    .line 1258
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1259
    .line 1260
    .line 1261
    move-result v2
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1262
    :goto_15
    const/16 v3, 0x42

    .line 1263
    .line 1264
    if-eq v0, v3, :cond_4d

    .line 1265
    .line 1266
    const/16 v3, 0x4d

    .line 1267
    .line 1268
    if-eq v0, v3, :cond_4c

    .line 1269
    .line 1270
    const/16 v3, 0x58

    .line 1271
    .line 1272
    if-eq v0, v3, :cond_4b

    .line 1273
    .line 1274
    const/16 v3, 0x64

    .line 1275
    .line 1276
    if-eq v0, v3, :cond_4a

    .line 1277
    .line 1278
    const/16 v3, 0x6e

    .line 1279
    .line 1280
    if-eq v0, v3, :cond_49

    .line 1281
    .line 1282
    const/16 v3, 0x7a

    .line 1283
    .line 1284
    if-eq v0, v3, :cond_48

    .line 1285
    .line 1286
    const/16 v3, 0xf4

    .line 1287
    .line 1288
    if-eq v0, v3, :cond_47

    .line 1289
    .line 1290
    const/4 v4, -0x1

    .line 1291
    const/4 v9, -0x1

    .line 1292
    goto :goto_17

    .line 1293
    :cond_47
    move/from16 v9, v19

    .line 1294
    .line 1295
    :goto_16
    const/4 v4, -0x1

    .line 1296
    goto :goto_17

    .line 1297
    :cond_48
    move/from16 v9, v20

    .line 1298
    .line 1299
    goto :goto_16

    .line 1300
    :cond_49
    move v9, v11

    .line 1301
    goto :goto_16

    .line 1302
    :cond_4a
    move/from16 v9, v25

    .line 1303
    .line 1304
    goto :goto_16

    .line 1305
    :cond_4b
    const/4 v4, -0x1

    .line 1306
    const/4 v9, 0x4

    .line 1307
    goto :goto_17

    .line 1308
    :cond_4c
    const/4 v4, -0x1

    .line 1309
    const/4 v9, 0x2

    .line 1310
    goto :goto_17

    .line 1311
    :cond_4d
    const/4 v4, -0x1

    .line 1312
    const/4 v9, 0x1

    .line 1313
    :goto_17
    if-ne v9, v4, :cond_4e

    .line 1314
    .line 1315
    const-string v1, "Unknown AVC profile: "

    .line 1316
    .line 1317
    invoke-static {v0, v1, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    return-object v22

    .line 1321
    :cond_4e
    packed-switch v2, :pswitch_data_6

    .line 1322
    .line 1323
    .line 1324
    packed-switch v2, :pswitch_data_7

    .line 1325
    .line 1326
    .line 1327
    packed-switch v2, :pswitch_data_8

    .line 1328
    .line 1329
    .line 1330
    packed-switch v2, :pswitch_data_9

    .line 1331
    .line 1332
    .line 1333
    packed-switch v2, :pswitch_data_a

    .line 1334
    .line 1335
    .line 1336
    const/4 v3, -0x1

    .line 1337
    :goto_18
    const/4 v4, -0x1

    .line 1338
    goto :goto_19

    .line 1339
    :pswitch_2b
    const/high16 v3, 0x10000

    .line 1340
    .line 1341
    goto :goto_18

    .line 1342
    :pswitch_2c
    const v3, 0x8000

    .line 1343
    .line 1344
    .line 1345
    goto :goto_18

    .line 1346
    :pswitch_2d
    const/16 v3, 0x4000

    .line 1347
    .line 1348
    goto :goto_18

    .line 1349
    :pswitch_2e
    move v3, v1

    .line 1350
    goto :goto_18

    .line 1351
    :pswitch_2f
    move/from16 v3, v16

    .line 1352
    .line 1353
    goto :goto_18

    .line 1354
    :pswitch_30
    move/from16 v3, v24

    .line 1355
    .line 1356
    goto :goto_18

    .line 1357
    :pswitch_31
    move/from16 v3, v23

    .line 1358
    .line 1359
    goto :goto_18

    .line 1360
    :pswitch_32
    move/from16 v3, v17

    .line 1361
    .line 1362
    goto :goto_18

    .line 1363
    :pswitch_33
    move/from16 v3, v21

    .line 1364
    .line 1365
    goto :goto_18

    .line 1366
    :pswitch_34
    move/from16 v3, v18

    .line 1367
    .line 1368
    goto :goto_18

    .line 1369
    :pswitch_35
    move/from16 v3, v19

    .line 1370
    .line 1371
    goto :goto_18

    .line 1372
    :pswitch_36
    move/from16 v3, v20

    .line 1373
    .line 1374
    goto :goto_18

    .line 1375
    :pswitch_37
    move v3, v11

    .line 1376
    goto :goto_18

    .line 1377
    :pswitch_38
    move/from16 v3, v25

    .line 1378
    .line 1379
    goto :goto_18

    .line 1380
    :pswitch_39
    const/4 v3, 0x4

    .line 1381
    goto :goto_18

    .line 1382
    :pswitch_3a
    const/4 v3, 0x1

    .line 1383
    goto :goto_18

    .line 1384
    :goto_19
    if-ne v3, v4, :cond_4f

    .line 1385
    .line 1386
    const-string v0, "Unknown AVC level: "

    .line 1387
    .line 1388
    invoke-static {v2, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    return-object v22

    .line 1392
    :cond_4f
    new-instance v0, Landroid/util/Pair;

    .line 1393
    .line 1394
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    return-object v0

    .line 1406
    :cond_50
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1407
    .line 1408
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    invoke-static {v10, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1419
    .line 1420
    .line 1421
    return-object v22

    .line 1422
    :catch_4
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1423
    .line 1424
    .line 1425
    return-object v22

    .line 1426
    :pswitch_3b
    iget-object v0, v0, Ltb1;->D:Lc50;

    .line 1427
    .line 1428
    array-length v2, v5

    .line 1429
    const-string v3, "Ignoring malformed AV1 codec string: "

    .line 1430
    .line 1431
    const/4 v4, 0x4

    .line 1432
    if-ge v2, v4, :cond_51

    .line 1433
    .line 1434
    invoke-static {v3, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    return-object v22

    .line 1438
    :cond_51
    const/16 v29, 0x1

    .line 1439
    .line 1440
    :try_start_6
    aget-object v2, v5, v29

    .line 1441
    .line 1442
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1443
    .line 1444
    .line 1445
    move-result v2

    .line 1446
    const/4 v4, 0x2

    .line 1447
    aget-object v7, v5, v4

    .line 1448
    .line 1449
    const/4 v8, 0x0

    .line 1450
    invoke-virtual {v7, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v7

    .line 1454
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1455
    .line 1456
    .line 1457
    move-result v4

    .line 1458
    const/16 v30, 0x3

    .line 1459
    .line 1460
    aget-object v5, v5, v30

    .line 1461
    .line 1462
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1463
    .line 1464
    .line 1465
    move-result v3
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1466
    if-eqz v2, :cond_52

    .line 1467
    .line 1468
    const-string v0, "Unknown AV1 profile: "

    .line 1469
    .line 1470
    invoke-static {v2, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v22

    .line 1474
    :cond_52
    move/from16 v2, v25

    .line 1475
    .line 1476
    if-eq v3, v2, :cond_53

    .line 1477
    .line 1478
    const/16 v5, 0xa

    .line 1479
    .line 1480
    if-eq v3, v5, :cond_53

    .line 1481
    .line 1482
    const-string v0, "Unknown AV1 bit depth: "

    .line 1483
    .line 1484
    invoke-static {v3, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1485
    .line 1486
    .line 1487
    return-object v22

    .line 1488
    :cond_53
    if-ne v3, v2, :cond_54

    .line 1489
    .line 1490
    const/4 v0, 0x1

    .line 1491
    goto :goto_1a

    .line 1492
    :cond_54
    if-eqz v0, :cond_56

    .line 1493
    .line 1494
    iget-object v3, v0, Lc50;->d:[B

    .line 1495
    .line 1496
    if-nez v3, :cond_55

    .line 1497
    .line 1498
    iget v0, v0, Lc50;->c:I

    .line 1499
    .line 1500
    const/4 v3, 0x7

    .line 1501
    if-eq v0, v3, :cond_55

    .line 1502
    .line 1503
    const/4 v3, 0x6

    .line 1504
    if-ne v0, v3, :cond_56

    .line 1505
    .line 1506
    :cond_55
    move/from16 v0, v16

    .line 1507
    .line 1508
    goto :goto_1a

    .line 1509
    :cond_56
    const/4 v0, 0x2

    .line 1510
    :goto_1a
    packed-switch v4, :pswitch_data_b

    .line 1511
    .line 1512
    .line 1513
    const/4 v1, -0x1

    .line 1514
    const/4 v3, -0x1

    .line 1515
    goto/16 :goto_1c

    .line 1516
    .line 1517
    :pswitch_3c
    const/high16 v3, 0x800000

    .line 1518
    .line 1519
    :goto_1b
    const/4 v1, -0x1

    .line 1520
    goto :goto_1c

    .line 1521
    :pswitch_3d
    const/high16 v3, 0x400000

    .line 1522
    .line 1523
    goto :goto_1b

    .line 1524
    :pswitch_3e
    const/high16 v3, 0x200000

    .line 1525
    .line 1526
    goto :goto_1b

    .line 1527
    :pswitch_3f
    const/high16 v3, 0x100000

    .line 1528
    .line 1529
    goto :goto_1b

    .line 1530
    :pswitch_40
    const/high16 v3, 0x80000

    .line 1531
    .line 1532
    goto :goto_1b

    .line 1533
    :pswitch_41
    const/high16 v3, 0x40000

    .line 1534
    .line 1535
    goto :goto_1b

    .line 1536
    :pswitch_42
    const/high16 v3, 0x20000

    .line 1537
    .line 1538
    goto :goto_1b

    .line 1539
    :pswitch_43
    const/high16 v3, 0x10000

    .line 1540
    .line 1541
    goto :goto_1b

    .line 1542
    :pswitch_44
    const v3, 0x8000

    .line 1543
    .line 1544
    .line 1545
    goto :goto_1b

    .line 1546
    :pswitch_45
    const/16 v3, 0x4000

    .line 1547
    .line 1548
    goto :goto_1b

    .line 1549
    :pswitch_46
    move v3, v1

    .line 1550
    goto :goto_1b

    .line 1551
    :pswitch_47
    move/from16 v3, v16

    .line 1552
    .line 1553
    goto :goto_1b

    .line 1554
    :pswitch_48
    move/from16 v3, v24

    .line 1555
    .line 1556
    goto :goto_1b

    .line 1557
    :pswitch_49
    move/from16 v3, v23

    .line 1558
    .line 1559
    goto :goto_1b

    .line 1560
    :pswitch_4a
    move/from16 v3, v17

    .line 1561
    .line 1562
    goto :goto_1b

    .line 1563
    :pswitch_4b
    move/from16 v3, v21

    .line 1564
    .line 1565
    goto :goto_1b

    .line 1566
    :pswitch_4c
    move/from16 v3, v18

    .line 1567
    .line 1568
    goto :goto_1b

    .line 1569
    :pswitch_4d
    move/from16 v3, v19

    .line 1570
    .line 1571
    goto :goto_1b

    .line 1572
    :pswitch_4e
    move/from16 v3, v20

    .line 1573
    .line 1574
    goto :goto_1b

    .line 1575
    :pswitch_4f
    move v3, v11

    .line 1576
    goto :goto_1b

    .line 1577
    :pswitch_50
    move v3, v2

    .line 1578
    goto :goto_1b

    .line 1579
    :pswitch_51
    const/4 v1, -0x1

    .line 1580
    const/4 v3, 0x4

    .line 1581
    goto :goto_1c

    .line 1582
    :pswitch_52
    const/4 v1, -0x1

    .line 1583
    const/4 v3, 0x2

    .line 1584
    goto :goto_1c

    .line 1585
    :pswitch_53
    const/4 v1, -0x1

    .line 1586
    const/4 v3, 0x1

    .line 1587
    :goto_1c
    if-ne v3, v1, :cond_57

    .line 1588
    .line 1589
    const-string v0, "Unknown AV1 level: "

    .line 1590
    .line 1591
    invoke-static {v4, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1592
    .line 1593
    .line 1594
    return-object v22

    .line 1595
    :cond_57
    new-instance v1, Landroid/util/Pair;

    .line 1596
    .line 1597
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v0

    .line 1601
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v2

    .line 1605
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1606
    .line 1607
    .line 1608
    return-object v1

    .line 1609
    :catch_5
    invoke-static {v3, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    return-object v22

    .line 1613
    :pswitch_54
    array-length v0, v5

    .line 1614
    const-string v2, "Ignoring malformed APV codec string: "

    .line 1615
    .line 1616
    const/4 v4, 0x4

    .line 1617
    if-ge v0, v4, :cond_58

    .line 1618
    .line 1619
    invoke-static {v2, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    return-object v22

    .line 1623
    :cond_58
    const/16 v29, 0x1

    .line 1624
    .line 1625
    :try_start_7
    aget-object v0, v5, v29

    .line 1626
    .line 1627
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1632
    .line 1633
    .line 1634
    move-result v0

    .line 1635
    const/16 v28, 0x2

    .line 1636
    .line 1637
    aget-object v3, v5, v28

    .line 1638
    .line 1639
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v3

    .line 1643
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1644
    .line 1645
    .line 1646
    move-result v3

    .line 1647
    const/16 v30, 0x3

    .line 1648
    .line 1649
    aget-object v5, v5, v30

    .line 1650
    .line 1651
    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v4

    .line 1655
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1656
    .line 1657
    .line 1658
    move-result v2
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6

    .line 1659
    const/16 v4, 0x21

    .line 1660
    .line 1661
    if-ne v0, v4, :cond_59

    .line 1662
    .line 1663
    const/4 v1, 0x1

    .line 1664
    goto :goto_1d

    .line 1665
    :cond_59
    const/16 v4, 0x2c

    .line 1666
    .line 1667
    if-ne v0, v4, :cond_5b

    .line 1668
    .line 1669
    :goto_1d
    div-int/lit8 v0, v3, 0x1e

    .line 1670
    .line 1671
    const/16 v28, 0x2

    .line 1672
    .line 1673
    mul-int/lit8 v0, v0, 0x2

    .line 1674
    .line 1675
    rem-int/lit8 v3, v3, 0x1e

    .line 1676
    .line 1677
    if-nez v3, :cond_5a

    .line 1678
    .line 1679
    add-int/lit8 v0, v0, -0x1

    .line 1680
    .line 1681
    :cond_5a
    const/16 v29, 0x1

    .line 1682
    .line 1683
    add-int/lit8 v0, v0, -0x1

    .line 1684
    .line 1685
    shl-int v0, v21, v0

    .line 1686
    .line 1687
    shl-int v2, v29, v2

    .line 1688
    .line 1689
    or-int/2addr v0, v2

    .line 1690
    new-instance v2, Landroid/util/Pair;

    .line 1691
    .line 1692
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v1

    .line 1696
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0

    .line 1700
    invoke-direct {v2, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1701
    .line 1702
    .line 1703
    return-object v2

    .line 1704
    :cond_5b
    const-string v1, "Ignoring invalid APV profile: "

    .line 1705
    .line 1706
    invoke-static {v0, v1, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1707
    .line 1708
    .line 1709
    return-object v22

    .line 1710
    :catch_6
    move-exception v0

    .line 1711
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1712
    .line 1713
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v1

    .line 1723
    invoke-static {v10, v1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1724
    .line 1725
    .line 1726
    return-object v22

    .line 1727
    :pswitch_55
    move/from16 v2, v25

    .line 1728
    .line 1729
    array-length v0, v5

    .line 1730
    const-string v1, "Ignoring malformed AC-4 codec string: "

    .line 1731
    .line 1732
    const/4 v4, 0x4

    .line 1733
    if-eq v0, v4, :cond_5c

    .line 1734
    .line 1735
    invoke-static {v1, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1736
    .line 1737
    .line 1738
    return-object v22

    .line 1739
    :cond_5c
    const/16 v29, 0x1

    .line 1740
    .line 1741
    :try_start_8
    aget-object v0, v5, v29

    .line 1742
    .line 1743
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1744
    .line 1745
    .line 1746
    move-result v0

    .line 1747
    const/4 v3, 0x2

    .line 1748
    aget-object v4, v5, v3

    .line 1749
    .line 1750
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1751
    .line 1752
    .line 1753
    move-result v4

    .line 1754
    const/16 v30, 0x3

    .line 1755
    .line 1756
    aget-object v5, v5, v30

    .line 1757
    .line 1758
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1759
    .line 1760
    .line 1761
    move-result v1
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_7

    .line 1762
    if-eqz v0, :cond_61

    .line 1763
    .line 1764
    const/4 v5, 0x1

    .line 1765
    if-eq v0, v5, :cond_5f

    .line 1766
    .line 1767
    if-eq v0, v3, :cond_5d

    .line 1768
    .line 1769
    goto :goto_1f

    .line 1770
    :cond_5d
    if-ne v4, v5, :cond_5e

    .line 1771
    .line 1772
    const/16 v6, 0x402

    .line 1773
    .line 1774
    move v3, v6

    .line 1775
    :goto_1e
    const/4 v5, -0x1

    .line 1776
    goto :goto_20

    .line 1777
    :cond_5e
    if-ne v4, v3, :cond_62

    .line 1778
    .line 1779
    const/16 v3, 0x404

    .line 1780
    .line 1781
    goto :goto_1e

    .line 1782
    :cond_5f
    if-nez v4, :cond_60

    .line 1783
    .line 1784
    const/16 v3, 0x201

    .line 1785
    .line 1786
    goto :goto_1e

    .line 1787
    :cond_60
    if-ne v4, v5, :cond_62

    .line 1788
    .line 1789
    const/16 v3, 0x202

    .line 1790
    .line 1791
    goto :goto_1e

    .line 1792
    :cond_61
    if-nez v4, :cond_62

    .line 1793
    .line 1794
    const/16 v3, 0x101

    .line 1795
    .line 1796
    goto :goto_1e

    .line 1797
    :cond_62
    :goto_1f
    const/4 v3, -0x1

    .line 1798
    goto :goto_1e

    .line 1799
    :goto_20
    if-ne v3, v5, :cond_63

    .line 1800
    .line 1801
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1802
    .line 1803
    const-string v2, "Unknown AC-4 profile: "

    .line 1804
    .line 1805
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1809
    .line 1810
    .line 1811
    const-string v0, "."

    .line 1812
    .line 1813
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v0

    .line 1823
    invoke-static {v10, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1824
    .line 1825
    .line 1826
    return-object v22

    .line 1827
    :cond_63
    if-eqz v1, :cond_68

    .line 1828
    .line 1829
    const/4 v5, 0x1

    .line 1830
    if-eq v1, v5, :cond_67

    .line 1831
    .line 1832
    const/4 v4, 0x2

    .line 1833
    if-eq v1, v4, :cond_66

    .line 1834
    .line 1835
    const/4 v0, 0x3

    .line 1836
    if-eq v1, v0, :cond_65

    .line 1837
    .line 1838
    const/4 v4, 0x4

    .line 1839
    if-eq v1, v4, :cond_64

    .line 1840
    .line 1841
    const/4 v4, -0x1

    .line 1842
    :goto_21
    const/4 v5, -0x1

    .line 1843
    goto :goto_22

    .line 1844
    :cond_64
    move v4, v11

    .line 1845
    goto :goto_21

    .line 1846
    :cond_65
    move v4, v2

    .line 1847
    goto :goto_21

    .line 1848
    :cond_66
    const/4 v4, 0x4

    .line 1849
    goto :goto_21

    .line 1850
    :cond_67
    const/4 v4, 0x2

    .line 1851
    goto :goto_21

    .line 1852
    :cond_68
    const/4 v5, 0x1

    .line 1853
    move v4, v5

    .line 1854
    goto :goto_21

    .line 1855
    :goto_22
    if-ne v4, v5, :cond_69

    .line 1856
    .line 1857
    const-string v0, "Unknown AC-4 level: "

    .line 1858
    .line 1859
    invoke-static {v1, v0, v10}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 1860
    .line 1861
    .line 1862
    return-object v22

    .line 1863
    :cond_69
    new-instance v0, Landroid/util/Pair;

    .line 1864
    .line 1865
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v2

    .line 1873
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1874
    .line 1875
    .line 1876
    return-object v0

    .line 1877
    :catch_7
    invoke-static {v1, v6, v10}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1878
    .line 1879
    .line 1880
    return-object v22

    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_a
        0x601 -> :sswitch_9
        0x602 -> :sswitch_8
        0x603 -> :sswitch_7
        0x604 -> :sswitch_6
        0x605 -> :sswitch_5
        0x606 -> :sswitch_4
        0x607 -> :sswitch_3
        0x608 -> :sswitch_2
        0x609 -> :sswitch_1
        0x61f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x601 -> :sswitch_17
        0x602 -> :sswitch_16
        0x603 -> :sswitch_15
        0x604 -> :sswitch_14
        0x605 -> :sswitch_13
        0x606 -> :sswitch_12
        0x607 -> :sswitch_11
        0x608 -> :sswitch_10
        0x609 -> :sswitch_f
        0x61f -> :sswitch_e
        0x620 -> :sswitch_d
        0x621 -> :sswitch_c
        0x622 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x2d9149 -> :sswitch_22
        0x2dcaea -> :sswitch_21
        0x2dd8f6 -> :sswitch_20
        0x2ddf23 -> :sswitch_1f
        0x2ddf24 -> :sswitch_1e
        0x30d038 -> :sswitch_1d
        0x310dbc -> :sswitch_1c
        0x3134b1 -> :sswitch_1b
        0x333790 -> :sswitch_1a
        0x35091c -> :sswitch_19
        0x374e43 -> :sswitch_18
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_55
        :pswitch_54
        :pswitch_3b
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        0x259c5f -> :sswitch_26
        0x2f8728 -> :sswitch_25
        0x316bd1 -> :sswitch_24
        0x333790 -> :sswitch_23
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xa
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x14
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1e
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x28
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x32
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
    .end packed-switch
.end method

.method public static c(Ljava/lang/String;[Ljava/lang/String;Lc50;)Landroid/util/Pair;
    .locals 11

    .line 1
    array-length v0, p1

    .line 2
    const-string v1, "Ignoring malformed HEVC codec string: "

    .line 3
    .line 4
    const-string v2, "CodecSpecificDataUtil"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x4

    .line 8
    if-ge v0, v4, :cond_0

    .line 9
    .line 10
    invoke-static {v1, p0, v2}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    sget-object v0, Li40;->c:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    aget-object v6, p1, v5

    .line 18
    .line 19
    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-nez v6, :cond_1

    .line 28
    .line 29
    invoke-static {v1, p0, v2}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "1"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x2

    .line 44
    const/16 v6, 0x1000

    .line 45
    .line 46
    const/4 v7, 0x6

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    move p0, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const-string v0, "2"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    iget p0, p2, Lc50;->c:I

    .line 62
    .line 63
    if-ne p0, v7, :cond_3

    .line 64
    .line 65
    move p0, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move p0, v1

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-string p2, "6"

    .line 70
    .line 71
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_21

    .line 76
    .line 77
    move p0, v7

    .line 78
    :goto_0
    const/4 p2, 0x3

    .line 79
    aget-object p1, p1, p2

    .line 80
    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    :goto_1
    move-object p2, v3

    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/16 v8, 0x10

    .line 91
    .line 92
    const/16 v9, 0x8

    .line 93
    .line 94
    const/4 v10, -0x1

    .line 95
    sparse-switch v0, :sswitch_data_0

    .line 96
    .line 97
    .line 98
    :goto_2
    move v7, v10

    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :sswitch_0
    const-string p2, "L186"

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    const/16 v7, 0x19

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :sswitch_1
    const-string p2, "L183"

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-nez p2, :cond_7

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    const/16 v7, 0x18

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :sswitch_2
    const-string p2, "L180"

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_8

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    const/16 v7, 0x17

    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :sswitch_3
    const-string p2, "L156"

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-nez p2, :cond_9

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_9
    const/16 v7, 0x16

    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :sswitch_4
    const-string p2, "L153"

    .line 154
    .line 155
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-nez p2, :cond_a

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_a
    const/16 v7, 0x15

    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :sswitch_5
    const-string p2, "L150"

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-nez p2, :cond_b

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_b
    const/16 v7, 0x14

    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :sswitch_6
    const-string p2, "L123"

    .line 180
    .line 181
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_c

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_c
    const/16 v7, 0x13

    .line 189
    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    :sswitch_7
    const-string p2, "L120"

    .line 193
    .line 194
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-nez p2, :cond_d

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_d
    const/16 v7, 0x12

    .line 202
    .line 203
    goto/16 :goto_3

    .line 204
    .line 205
    :sswitch_8
    const-string p2, "H186"

    .line 206
    .line 207
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-nez p2, :cond_e

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_e
    const/16 v7, 0x11

    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :sswitch_9
    const-string p2, "H183"

    .line 219
    .line 220
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-nez p2, :cond_f

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :cond_f
    move v7, v8

    .line 229
    goto/16 :goto_3

    .line 230
    .line 231
    :sswitch_a
    const-string p2, "H180"

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    if-nez p2, :cond_10

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_10
    const/16 v7, 0xf

    .line 242
    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :sswitch_b
    const-string p2, "H156"

    .line 246
    .line 247
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p2

    .line 251
    if-nez p2, :cond_11

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :cond_11
    const/16 v7, 0xe

    .line 256
    .line 257
    goto/16 :goto_3

    .line 258
    .line 259
    :sswitch_c
    const-string p2, "H153"

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-nez p2, :cond_12

    .line 266
    .line 267
    goto/16 :goto_2

    .line 268
    .line 269
    :cond_12
    const/16 v7, 0xd

    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :sswitch_d
    const-string p2, "H150"

    .line 274
    .line 275
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    if-nez p2, :cond_13

    .line 280
    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_13
    const/16 v7, 0xc

    .line 284
    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :sswitch_e
    const-string p2, "H123"

    .line 288
    .line 289
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    if-nez p2, :cond_14

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :cond_14
    const/16 v7, 0xb

    .line 298
    .line 299
    goto/16 :goto_3

    .line 300
    .line 301
    :sswitch_f
    const-string p2, "H120"

    .line 302
    .line 303
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    if-nez p2, :cond_15

    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :cond_15
    const/16 v7, 0xa

    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :sswitch_10
    const-string p2, "L93"

    .line 316
    .line 317
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result p2

    .line 321
    if-nez p2, :cond_16

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_16
    const/16 v7, 0x9

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :sswitch_11
    const-string p2, "L90"

    .line 330
    .line 331
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p2

    .line 335
    if-nez p2, :cond_17

    .line 336
    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :cond_17
    move v7, v9

    .line 340
    goto/16 :goto_3

    .line 341
    .line 342
    :sswitch_12
    const-string p2, "L63"

    .line 343
    .line 344
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result p2

    .line 348
    if-nez p2, :cond_18

    .line 349
    .line 350
    goto/16 :goto_2

    .line 351
    .line 352
    :cond_18
    const/4 v7, 0x7

    .line 353
    goto :goto_3

    .line 354
    :sswitch_13
    const-string p2, "L60"

    .line 355
    .line 356
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    if-nez p2, :cond_1f

    .line 361
    .line 362
    goto/16 :goto_2

    .line 363
    .line 364
    :sswitch_14
    const-string p2, "L30"

    .line 365
    .line 366
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result p2

    .line 370
    if-nez p2, :cond_19

    .line 371
    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :cond_19
    const/4 v7, 0x5

    .line 375
    goto :goto_3

    .line 376
    :sswitch_15
    const-string p2, "H93"

    .line 377
    .line 378
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p2

    .line 382
    if-nez p2, :cond_1a

    .line 383
    .line 384
    goto/16 :goto_2

    .line 385
    .line 386
    :cond_1a
    move v7, v4

    .line 387
    goto :goto_3

    .line 388
    :sswitch_16
    const-string v0, "H90"

    .line 389
    .line 390
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_1b

    .line 395
    .line 396
    goto/16 :goto_2

    .line 397
    .line 398
    :cond_1b
    move v7, p2

    .line 399
    goto :goto_3

    .line 400
    :sswitch_17
    const-string p2, "H63"

    .line 401
    .line 402
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result p2

    .line 406
    if-nez p2, :cond_1c

    .line 407
    .line 408
    goto/16 :goto_2

    .line 409
    .line 410
    :cond_1c
    move v7, v1

    .line 411
    goto :goto_3

    .line 412
    :sswitch_18
    const-string p2, "H60"

    .line 413
    .line 414
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result p2

    .line 418
    if-nez p2, :cond_1d

    .line 419
    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :cond_1d
    move v7, v5

    .line 423
    goto :goto_3

    .line 424
    :sswitch_19
    const-string p2, "H30"

    .line 425
    .line 426
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result p2

    .line 430
    if-nez p2, :cond_1e

    .line 431
    .line 432
    goto/16 :goto_2

    .line 433
    .line 434
    :cond_1e
    const/4 v7, 0x0

    .line 435
    :cond_1f
    :goto_3
    packed-switch v7, :pswitch_data_0

    .line 436
    .line 437
    .line 438
    goto/16 :goto_1

    .line 439
    .line 440
    :pswitch_0
    const/high16 p2, 0x1000000

    .line 441
    .line 442
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 443
    .line 444
    .line 445
    move-result-object p2

    .line 446
    goto/16 :goto_4

    .line 447
    .line 448
    :pswitch_1
    const/high16 p2, 0x400000

    .line 449
    .line 450
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object p2

    .line 454
    goto/16 :goto_4

    .line 455
    .line 456
    :pswitch_2
    const/high16 p2, 0x100000

    .line 457
    .line 458
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    goto/16 :goto_4

    .line 463
    .line 464
    :pswitch_3
    const/high16 p2, 0x40000

    .line 465
    .line 466
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    goto/16 :goto_4

    .line 471
    .line 472
    :pswitch_4
    const/high16 p2, 0x10000

    .line 473
    .line 474
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object p2

    .line 478
    goto/16 :goto_4

    .line 479
    .line 480
    :pswitch_5
    const/16 p2, 0x4000

    .line 481
    .line 482
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object p2

    .line 486
    goto/16 :goto_4

    .line 487
    .line 488
    :pswitch_6
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    goto/16 :goto_4

    .line 493
    .line 494
    :pswitch_7
    const/16 p2, 0x400

    .line 495
    .line 496
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object p2

    .line 500
    goto/16 :goto_4

    .line 501
    .line 502
    :pswitch_8
    const/high16 p2, 0x2000000

    .line 503
    .line 504
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    goto/16 :goto_4

    .line 509
    .line 510
    :pswitch_9
    const/high16 p2, 0x800000

    .line 511
    .line 512
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object p2

    .line 516
    goto/16 :goto_4

    .line 517
    .line 518
    :pswitch_a
    const/high16 p2, 0x200000

    .line 519
    .line 520
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 521
    .line 522
    .line 523
    move-result-object p2

    .line 524
    goto :goto_4

    .line 525
    :pswitch_b
    const/high16 p2, 0x80000

    .line 526
    .line 527
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object p2

    .line 531
    goto :goto_4

    .line 532
    :pswitch_c
    const/high16 p2, 0x20000

    .line 533
    .line 534
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 535
    .line 536
    .line 537
    move-result-object p2

    .line 538
    goto :goto_4

    .line 539
    :pswitch_d
    const p2, 0x8000

    .line 540
    .line 541
    .line 542
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object p2

    .line 546
    goto :goto_4

    .line 547
    :pswitch_e
    const/16 p2, 0x2000

    .line 548
    .line 549
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object p2

    .line 553
    goto :goto_4

    .line 554
    :pswitch_f
    const/16 p2, 0x800

    .line 555
    .line 556
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object p2

    .line 560
    goto :goto_4

    .line 561
    :pswitch_10
    const/16 p2, 0x100

    .line 562
    .line 563
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object p2

    .line 567
    goto :goto_4

    .line 568
    :pswitch_11
    const/16 p2, 0x40

    .line 569
    .line 570
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object p2

    .line 574
    goto :goto_4

    .line 575
    :pswitch_12
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 576
    .line 577
    .line 578
    move-result-object p2

    .line 579
    goto :goto_4

    .line 580
    :pswitch_13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object p2

    .line 584
    goto :goto_4

    .line 585
    :pswitch_14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    .line 587
    .line 588
    move-result-object p2

    .line 589
    goto :goto_4

    .line 590
    :pswitch_15
    const/16 p2, 0x200

    .line 591
    .line 592
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object p2

    .line 596
    goto :goto_4

    .line 597
    :pswitch_16
    const/16 p2, 0x80

    .line 598
    .line 599
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object p2

    .line 603
    goto :goto_4

    .line 604
    :pswitch_17
    const/16 p2, 0x20

    .line 605
    .line 606
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object p2

    .line 610
    goto :goto_4

    .line 611
    :pswitch_18
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    .line 613
    .line 614
    move-result-object p2

    .line 615
    goto :goto_4

    .line 616
    :pswitch_19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 617
    .line 618
    .line 619
    move-result-object p2

    .line 620
    :goto_4
    if-nez p2, :cond_20

    .line 621
    .line 622
    const-string p0, "Unknown HEVC level string: "

    .line 623
    .line 624
    invoke-static {p0, p1, v2}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    return-object v3

    .line 628
    :cond_20
    new-instance p1, Landroid/util/Pair;

    .line 629
    .line 630
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    invoke-direct {p1, p0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    return-object p1

    .line 638
    :cond_21
    const-string p1, "Unknown HEVC profile string: "

    .line 639
    .line 640
    invoke-static {p1, p0, v2}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-object v3

    .line 644
    nop

    .line 645
    :sswitch_data_0
    .sparse-switch
        0x114a5 -> :sswitch_19
        0x11502 -> :sswitch_18
        0x11505 -> :sswitch_17
        0x1155f -> :sswitch_16
        0x11562 -> :sswitch_15
        0x123a9 -> :sswitch_14
        0x12406 -> :sswitch_13
        0x12409 -> :sswitch_12
        0x12463 -> :sswitch_11
        0x12466 -> :sswitch_10
        0x2178e7 -> :sswitch_f
        0x2178ea -> :sswitch_e
        0x217944 -> :sswitch_d
        0x217947 -> :sswitch_c
        0x21794a -> :sswitch_b
        0x2179a1 -> :sswitch_a
        0x2179a4 -> :sswitch_9
        0x2179a7 -> :sswitch_8
        0x234a63 -> :sswitch_7
        0x234a66 -> :sswitch_6
        0x234ac0 -> :sswitch_5
        0x234ac3 -> :sswitch_4
        0x234ac6 -> :sswitch_3
        0x234b1d -> :sswitch_2
        0x234b20 -> :sswitch_1
        0x234b23 -> :sswitch_0
    .end sparse-switch

    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
