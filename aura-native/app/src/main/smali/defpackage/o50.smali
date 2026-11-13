.class public final Ldefpackage/o50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/m50;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Z

.field public final k:I

.field public final l:I


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;Z)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/o50;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/o50;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/o50;->i:Ljava/util/ArrayList;

    .line 31
    .line 32
    iput-boolean p2, p0, Ldefpackage/o50;->j:Z

    .line 33
    .line 34
    array-length p2, p1

    .line 35
    const/4 v0, 0x0

    .line 36
    move v1, v0

    .line 37
    move v2, v1

    .line 38
    :goto_0
    const/4 v3, 0x1

    .line 39
    if-ge v1, p2, :cond_2

    .line 40
    .line 41
    aget-object v4, p1, v1

    .line 42
    .line 43
    new-instance v5, Landroid/util/Pair;

    .line 44
    .line 45
    iget-boolean v6, p0, Ldefpackage/o50;->j:Z

    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    const-string v6, "UTF-8"

    .line 51
    .line 52
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    array-length v6, v4

    .line 61
    int-to-byte v6, v6

    .line 62
    array-length v8, v4

    .line 63
    add-int/lit8 v9, v8, 0x3

    .line 64
    .line 65
    new-array v9, v9, [B

    .line 66
    .line 67
    invoke-static {v4, v0, v9, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    aput-byte v6, v9, v3

    .line 71
    .line 72
    aput-byte v6, v9, v0

    .line 73
    .line 74
    add-int/2addr v8, v7

    .line 75
    aput-byte v0, v9, v8

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    array-length v6, v4

    .line 83
    mul-int/2addr v6, v7

    .line 84
    add-int/lit8 v7, v6, 0x4

    .line 85
    .line 86
    new-array v9, v7, [B

    .line 87
    .line 88
    array-length v7, v4

    .line 89
    int-to-short v7, v7

    .line 90
    invoke-static {v7}, Ldefpackage/g12;->S(S)[B

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    aget-byte v8, v7, v0

    .line 95
    .line 96
    aput-byte v8, v9, v0

    .line 97
    .line 98
    aget-byte v7, v7, v3

    .line 99
    .line 100
    aput-byte v7, v9, v3

    .line 101
    .line 102
    move v7, v0

    .line 103
    :goto_1
    array-length v8, v4

    .line 104
    if-ge v7, v8, :cond_1

    .line 105
    .line 106
    aget-char v8, v4, v7

    .line 107
    .line 108
    invoke-static {v8}, Ldefpackage/g12;->j(C)[B

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    mul-int/lit8 v10, v7, 0x2

    .line 113
    .line 114
    add-int/lit8 v11, v10, 0x2

    .line 115
    .line 116
    aget-byte v12, v8, v0

    .line 117
    .line 118
    aput-byte v12, v9, v11

    .line 119
    .line 120
    add-int/lit8 v10, v10, 0x3

    .line 121
    .line 122
    aget-byte v8, v8, v3

    .line 123
    .line 124
    aput-byte v8, v9, v10

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    add-int/lit8 v3, v6, 0x2

    .line 130
    .line 131
    aput-byte v0, v9, v3

    .line 132
    .line 133
    add-int/lit8 v6, v6, 0x3

    .line 134
    .line 135
    aput-byte v0, v9, v6

    .line 136
    .line 137
    :goto_2
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 138
    .line 139
    invoke-direct {v5, v9, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v3, p0, Ldefpackage/o50;->f:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, [B

    .line 154
    .line 155
    array-length v4, v3

    .line 156
    add-int/2addr v2, v4

    .line 157
    iget-object v4, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    iget-object v3, p0, Ldefpackage/o50;->i:Ljava/util/ArrayList;

    .line 163
    .line 164
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Ljava/util/List;

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_2
    iget-object p2, p0, Ldefpackage/o50;->i:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    move v4, v0

    .line 182
    move v5, v4

    .line 183
    :goto_3
    if-ge v5, v1, :cond_5

    .line 184
    .line 185
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    add-int/lit8 v5, v5, 0x1

    .line 190
    .line 191
    check-cast v6, Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-nez v8, :cond_3

    .line 202
    .line 203
    iget-object v7, p0, Ldefpackage/o50;->g:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    mul-int/lit8 v6, v6, 0xc

    .line 217
    .line 218
    add-int/lit8 v6, v6, 0x4

    .line 219
    .line 220
    add-int/2addr v4, v6

    .line 221
    goto :goto_3

    .line 222
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    const/4 p2, 0x0

    .line 227
    if-nez p1, :cond_4

    .line 228
    .line 229
    iget-object p0, p0, Ldefpackage/o50;->f:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    throw p2

    .line 239
    :cond_4
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 240
    .line 241
    .line 242
    throw p2

    .line 243
    :cond_5
    rem-int/lit8 p2, v2, 0x4

    .line 244
    .line 245
    if-nez p2, :cond_6

    .line 246
    .line 247
    move p2, v0

    .line 248
    goto :goto_4

    .line 249
    :cond_6
    rsub-int/lit8 p2, p2, 0x4

    .line 250
    .line 251
    :goto_4
    iput p2, p0, Ldefpackage/o50;->k:I

    .line 252
    .line 253
    iget-object v1, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    iput v1, p0, Ldefpackage/o50;->b:I

    .line 260
    .line 261
    iget-object v5, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    array-length v6, p1

    .line 268
    sub-int/2addr v5, v6

    .line 269
    iput v5, p0, Ldefpackage/o50;->c:I

    .line 270
    .line 271
    iget-object v5, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    array-length p1, p1

    .line 278
    sub-int/2addr v5, p1

    .line 279
    if-lez v5, :cond_7

    .line 280
    .line 281
    move p1, v3

    .line 282
    goto :goto_5

    .line 283
    :cond_7
    move p1, v0

    .line 284
    :goto_5
    if-nez p1, :cond_8

    .line 285
    .line 286
    iget-object v5, p0, Ldefpackage/o50;->g:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 289
    .line 290
    .line 291
    iget-object v5, p0, Ldefpackage/o50;->i:Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 294
    .line 295
    .line 296
    :cond_8
    mul-int/lit8 v1, v1, 0x4

    .line 297
    .line 298
    const/16 v5, 0x1c

    .line 299
    .line 300
    add-int/2addr v1, v5

    .line 301
    iget-object v6, p0, Ldefpackage/o50;->g:Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    mul-int/lit8 v6, v6, 0x4

    .line 308
    .line 309
    add-int/2addr v6, v1

    .line 310
    iput v6, p0, Ldefpackage/o50;->d:I

    .line 311
    .line 312
    add-int/2addr v2, p2

    .line 313
    if-eqz p1, :cond_9

    .line 314
    .line 315
    add-int p2, v6, v2

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_9
    move p2, v0

    .line 319
    :goto_6
    iput p2, p0, Ldefpackage/o50;->e:I

    .line 320
    .line 321
    add-int/2addr v6, v2

    .line 322
    if-eqz p1, :cond_a

    .line 323
    .line 324
    move v0, v4

    .line 325
    :cond_a
    add-int/2addr v6, v0

    .line 326
    iput v6, p0, Ldefpackage/o50;->l:I

    .line 327
    .line 328
    new-instance p1, Ldefpackage/m50;

    .line 329
    .line 330
    invoke-direct {p1, v6, v3, v5}, Ldefpackage/m50;-><init>(ISS)V

    .line 331
    .line 332
    .line 333
    iput-object p1, p0, Ldefpackage/o50;->a:Ldefpackage/m50;

    .line 334
    .line 335
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/ByteArrayOutputStream;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/o50;->a:Ldefpackage/m50;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/m50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ldefpackage/o50;->b:I

    .line 7
    .line 8
    invoke-static {v0}, Ldefpackage/g12;->b(I)[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Ldefpackage/o50;->c:I

    .line 16
    .line 17
    invoke-static {v0}, Ldefpackage/g12;->b(I)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Ldefpackage/o50;->j:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x100

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    invoke-static {v0}, Ldefpackage/g12;->b(I)[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Ldefpackage/o50;->d:I

    .line 41
    .line 42
    invoke-static {v0}, Ldefpackage/g12;->b(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Ldefpackage/o50;->e:I

    .line 50
    .line 51
    invoke-static {v0}, Ldefpackage/g12;->b(I)[B

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Ldefpackage/o50;->f:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    move v3, v1

    .line 65
    :goto_1
    if-ge v3, v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    check-cast v4, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-static {v4}, Ldefpackage/g12;->b(I)[B

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v0, p0, Ldefpackage/o50;->g:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    move v3, v1

    .line 94
    :goto_2
    if-ge v3, v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    check-cast v4, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-static {v4}, Ldefpackage/g12;->b(I)[B

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    iget-object v0, p0, Ldefpackage/o50;->h:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    move v3, v1

    .line 123
    :goto_3
    if-ge v3, v2, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    check-cast v4, [B

    .line 132
    .line 133
    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    iget v0, p0, Ldefpackage/o50;->k:I

    .line 138
    .line 139
    if-lez v0, :cond_4

    .line 140
    .line 141
    new-array v0, v0, [B

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 144
    .line 145
    .line 146
    :cond_4
    iget-object p0, p0, Ldefpackage/o50;->i:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    :goto_4
    if-ge v1, v0, :cond_6

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    check-cast v2, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_5

    .line 171
    .line 172
    const/4 v2, -0x1

    .line 173
    invoke-static {v2}, Ldefpackage/g12;->b(I)[B

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    invoke-static {v2}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    throw p0

    .line 186
    :cond_6
    return-void
.end method
