.class public final Ldefpackage/bh4;
.super Ldefpackage/w0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Ldefpackage/w0;-><init>(Ljava/io/InputStream;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Ldefpackage/bh4;->y:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Ldefpackage/bh4;->z:Z

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Ldefpackage/w0;->q()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq p2, v2, :cond_1

    .line 18
    .line 19
    and-int/lit8 v2, p2, 0x7f

    .line 20
    .line 21
    add-int/lit8 v3, p1, 0x1

    .line 22
    .line 23
    mul-int/lit8 p1, p1, 0x7

    .line 24
    .line 25
    shl-int p1, v2, p1

    .line 26
    .line 27
    int-to-long v4, p1

    .line 28
    or-long/2addr v0, v4

    .line 29
    and-int/lit16 p1, p2, 0x80

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    long-to-int p1, v0

    .line 34
    iput p1, p0, Ldefpackage/bh4;->x:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    move p1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p0, "Premature end of stream reading size"

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    throw p0
.end method


# virtual methods
.method public final read([BII)I
    .locals 10

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-boolean v0, p0, Ldefpackage/bh4;->z:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    iget v0, p0, Ldefpackage/bh4;->y:I

    .line 12
    .line 13
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x2

    .line 21
    if-eqz v0, :cond_b

    .line 22
    .line 23
    if-eq v0, v4, :cond_8

    .line 24
    .line 25
    if-ne v0, v5, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/w0;->f([BII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v5, p0, Ldefpackage/w0;->t:J

    .line 32
    .line 33
    cmp-long v1, v5, v2

    .line 34
    .line 35
    if-lez v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iput v4, p0, Ldefpackage/bh4;->y:I

    .line 39
    .line 40
    :goto_0
    if-lez v0, :cond_3

    .line 41
    .line 42
    return v0

    .line 43
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/bh4;->read([BII)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_4
    iget p0, p0, Ldefpackage/bh4;->y:I

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    if-eq p0, p1, :cond_7

    .line 52
    .line 53
    const/4 p1, 0x2

    .line 54
    if-eq p0, p1, :cond_6

    .line 55
    .line 56
    const/4 p1, 0x3

    .line 57
    if-eq p0, p1, :cond_5

    .line 58
    .line 59
    const-string p0, "null"

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    const-string p0, "IN_BACK_REFERENCE"

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    const-string p0, "IN_LITERAL"

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_7
    const-string p0, "NO_BLOCK"

    .line 69
    .line 70
    :goto_1
    const-string p1, "Unknown stream state "

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    const/4 p0, 0x0

    .line 80
    return p0

    .line 81
    :cond_8
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/w0;->n([BII)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-wide v5, p0, Ldefpackage/w0;->t:J

    .line 86
    .line 87
    cmp-long v1, v5, v2

    .line 88
    .line 89
    if-lez v1, :cond_9

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_9
    iput v4, p0, Ldefpackage/bh4;->y:I

    .line 93
    .line 94
    :goto_3
    if-lez v0, :cond_a

    .line 95
    .line 96
    return v0

    .line 97
    :cond_a
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/bh4;->read([BII)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0

    .line 102
    :cond_b
    iget v0, p0, Ldefpackage/bh4;->x:I

    .line 103
    .line 104
    if-nez v0, :cond_c

    .line 105
    .line 106
    iput-boolean v4, p0, Ldefpackage/bh4;->z:Z

    .line 107
    .line 108
    goto/16 :goto_6

    .line 109
    .line 110
    :cond_c
    invoke-virtual {p0}, Ldefpackage/w0;->q()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eq v0, v1, :cond_18

    .line 115
    .line 116
    and-int/lit8 v6, v0, 0x3

    .line 117
    .line 118
    const/4 v7, 0x3

    .line 119
    const/4 v8, 0x4

    .line 120
    iget-object v9, p0, Ldefpackage/w0;->w:Ldefpackage/hg3;

    .line 121
    .line 122
    if-eqz v6, :cond_14

    .line 123
    .line 124
    const-string v2, "Illegal block with bad offset found"

    .line 125
    .line 126
    const-string v3, "Illegal block with a negative match length found"

    .line 127
    .line 128
    if-eq v6, v4, :cond_11

    .line 129
    .line 130
    if-eq v6, v5, :cond_f

    .line 131
    .line 132
    if-eq v6, v7, :cond_d

    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_d
    shr-int/2addr v0, v5

    .line 137
    add-int/2addr v0, v4

    .line 138
    if-ltz v0, :cond_e

    .line 139
    .line 140
    iget v1, p0, Ldefpackage/bh4;->x:I

    .line 141
    .line 142
    sub-int/2addr v1, v0

    .line 143
    iput v1, p0, Ldefpackage/bh4;->x:I

    .line 144
    .line 145
    invoke-static {v9, v8}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v3

    .line 149
    long-to-int v1, v3

    .line 150
    const v3, 0x7fffffff

    .line 151
    .line 152
    .line 153
    and-int/2addr v1, v3

    .line 154
    int-to-long v3, v0

    .line 155
    :try_start_0
    invoke-virtual {p0, v1, v3, v4}, Ldefpackage/w0;->s(IJ)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    iput v7, p0, Ldefpackage/bh4;->y:I

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :catch_0
    move-exception p0

    .line 163
    new-instance p1, Ljava/io/IOException;

    .line 164
    .line 165
    invoke-direct {p1, v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :cond_e
    invoke-static {v3}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_f
    shr-int/2addr v0, v5

    .line 174
    add-int/2addr v0, v4

    .line 175
    if-ltz v0, :cond_10

    .line 176
    .line 177
    iget v1, p0, Ldefpackage/bh4;->x:I

    .line 178
    .line 179
    sub-int/2addr v1, v0

    .line 180
    iput v1, p0, Ldefpackage/bh4;->x:I

    .line 181
    .line 182
    invoke-static {v9, v5}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 183
    .line 184
    .line 185
    move-result-wide v3

    .line 186
    long-to-int v1, v3

    .line 187
    int-to-long v3, v0

    .line 188
    :try_start_1
    invoke-virtual {p0, v1, v3, v4}, Ldefpackage/w0;->s(IJ)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 189
    .line 190
    .line 191
    iput v7, p0, Ldefpackage/bh4;->y:I

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :catch_1
    move-exception p0

    .line 195
    new-instance p1, Ljava/io/IOException;

    .line 196
    .line 197
    invoke-direct {p1, v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_10
    invoke-static {v3}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_11
    shr-int/lit8 v4, v0, 0x2

    .line 206
    .line 207
    and-int/lit8 v4, v4, 0x7

    .line 208
    .line 209
    add-int/2addr v4, v8

    .line 210
    if-ltz v4, :cond_13

    .line 211
    .line 212
    iget v3, p0, Ldefpackage/bh4;->x:I

    .line 213
    .line 214
    sub-int/2addr v3, v4

    .line 215
    iput v3, p0, Ldefpackage/bh4;->x:I

    .line 216
    .line 217
    and-int/lit16 v0, v0, 0xe0

    .line 218
    .line 219
    shl-int/2addr v0, v7

    .line 220
    invoke-virtual {p0}, Ldefpackage/w0;->q()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eq v3, v1, :cond_12

    .line 225
    .line 226
    or-int/2addr v0, v3

    .line 227
    int-to-long v3, v4

    .line 228
    :try_start_2
    invoke-virtual {p0, v0, v3, v4}, Ldefpackage/w0;->s(IJ)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 229
    .line 230
    .line 231
    iput v7, p0, Ldefpackage/bh4;->y:I

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :catch_2
    move-exception p0

    .line 235
    new-instance p1, Ljava/io/IOException;

    .line 236
    .line 237
    invoke-direct {p1, v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    throw p1

    .line 241
    :cond_12
    const-string p0, "Premature end of stream reading back-reference length"

    .line 242
    .line 243
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_13
    invoke-static {v3}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_14
    shr-int/2addr v0, v5

    .line 254
    packed-switch v0, :pswitch_data_0

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :pswitch_0
    invoke-static {v9, v8}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v0

    .line 262
    :goto_4
    long-to-int v0, v0

    .line 263
    goto :goto_5

    .line 264
    :pswitch_1
    invoke-static {v9, v7}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 265
    .line 266
    .line 267
    move-result-wide v0

    .line 268
    goto :goto_4

    .line 269
    :pswitch_2
    invoke-static {v9, v5}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 270
    .line 271
    .line 272
    move-result-wide v0

    .line 273
    goto :goto_4

    .line 274
    :pswitch_3
    invoke-virtual {p0}, Ldefpackage/w0;->q()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eq v0, v1, :cond_17

    .line 279
    .line 280
    :goto_5
    add-int/2addr v0, v4

    .line 281
    if-ltz v0, :cond_16

    .line 282
    .line 283
    iget v1, p0, Ldefpackage/bh4;->x:I

    .line 284
    .line 285
    sub-int/2addr v1, v0

    .line 286
    iput v1, p0, Ldefpackage/bh4;->x:I

    .line 287
    .line 288
    int-to-long v0, v0

    .line 289
    cmp-long v2, v0, v2

    .line 290
    .line 291
    if-ltz v2, :cond_15

    .line 292
    .line 293
    iput-wide v0, p0, Ldefpackage/w0;->t:J

    .line 294
    .line 295
    iput v5, p0, Ldefpackage/bh4;->y:I

    .line 296
    .line 297
    :goto_6
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/bh4;->read([BII)I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    return p0

    .line 302
    :cond_15
    const-string p0, "length must not be negative"

    .line 303
    .line 304
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :cond_16
    const-string p0, "Illegal block with a negative literal size found"

    .line 310
    .line 311
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_2

    .line 315
    .line 316
    :cond_17
    const-string p0, "Premature end of stream reading literal length"

    .line 317
    .line 318
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :cond_18
    const-string p0, "Premature end of stream reading block start"

    .line 324
    .line 325
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
