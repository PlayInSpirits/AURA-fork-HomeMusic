.class public final Lk90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Lk90;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;


# instance fields
.field public a:Ljava/util/SortedMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk90;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk90;->b:Lk90;

    .line 7
    .line 8
    const-string v0, "Google Brotli Dec"

    .line 9
    .line 10
    const-string v1, "https://github.com/google/brotli/"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lk90;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lk90;->c:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "XZ for Java"

    .line 19
    .line 20
    const-string v1, "https://tukaani.org/xz/java.html"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lk90;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lk90;->d:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "Zstd JNI"

    .line 29
    .line 30
    const-string v1, "https://github.com/luben/zstd-jni"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lk90;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lk90;->e:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method

.method public static c()Ljava/util/HashSet;
    .locals 14

    .line 1
    const-string v12, "zstd"

    .line 2
    .line 3
    const-string v13, "deflate64"

    .line 4
    .line 5
    const-string v0, "gz"

    .line 6
    .line 7
    const-string v1, "br"

    .line 8
    .line 9
    const-string v2, "bzip2"

    .line 10
    .line 11
    const-string v3, "xz"

    .line 12
    .line 13
    const-string v4, "lzma"

    .line 14
    .line 15
    const-string v5, "pack200"

    .line 16
    .line 17
    const-string v6, "deflate"

    .line 18
    .line 19
    const-string v7, "snappy-raw"

    .line 20
    .line 21
    const-string v8, "snappy-framed"

    .line 22
    .line 23
    const-string v9, "z"

    .line 24
    .line 25
    const-string v10, "lz4-block"

    .line 26
    .line 27
    const-string v11, "lz4-framed"

    .line 28
    .line 29
    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/util/HashSet;

    .line 34
    .line 35
    const/16 v2, 0xe

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " In addition to Apache Commons Compress you need the "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " library - see "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/ByteArrayInputStream;)Li90;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :try_start_0
    invoke-static {p1, v1, v2, v0}, Lvr1;->D(Ljava/io/InputStream;[BII)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    sget v3, Lmo;->J:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x3

    .line 26
    const/4 v5, 0x1

    .line 27
    if-lt v0, v4, :cond_0

    .line 28
    .line 29
    aget-byte v6, v1, v2

    .line 30
    .line 31
    const/16 v7, 0x42

    .line 32
    .line 33
    if-ne v6, v7, :cond_0

    .line 34
    .line 35
    aget-byte v6, v1, v5

    .line 36
    .line 37
    const/16 v7, 0x5a

    .line 38
    .line 39
    if-ne v6, v7, :cond_0

    .line 40
    .line 41
    aget-byte v6, v1, v3

    .line 42
    .line 43
    const/16 v7, 0x68

    .line 44
    .line 45
    if-ne v6, v7, :cond_0

    .line 46
    .line 47
    const-string v0, "bzip2"

    .line 48
    .line 49
    goto/16 :goto_a

    .line 50
    .line 51
    :cond_0
    sget v6, Lrk1;->w:I

    .line 52
    .line 53
    const/16 v6, 0x1f

    .line 54
    .line 55
    if-lt v0, v3, :cond_1

    .line 56
    .line 57
    aget-byte v3, v1, v2

    .line 58
    .line 59
    if-ne v3, v6, :cond_1

    .line 60
    .line 61
    aget-byte v3, v1, v5

    .line 62
    .line 63
    const/16 v7, -0x75

    .line 64
    .line 65
    if-ne v3, v7, :cond_1

    .line 66
    .line 67
    const-string v0, "gz"

    .line 68
    .line 69
    goto/16 :goto_a

    .line 70
    .line 71
    :cond_1
    sget v3, Lxb3;->r:I

    .line 72
    .line 73
    if-ge v0, v3, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move v7, v2

    .line 77
    :goto_0
    if-ge v7, v3, :cond_15

    .line 78
    .line 79
    aget-byte v8, v1, v7

    .line 80
    .line 81
    sget-object v9, Lxb3;->q:[B

    .line 82
    .line 83
    aget-byte v9, v9, v7

    .line 84
    .line 85
    if-eq v8, v9, :cond_14

    .line 86
    .line 87
    :goto_1
    sget-object v3, Lre1;->z:[B

    .line 88
    .line 89
    const/16 v7, 0xa

    .line 90
    .line 91
    if-ge v0, v7, :cond_3

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    new-array v8, v7, [B

    .line 96
    .line 97
    invoke-static {v1, v2, v8, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    .line 99
    .line 100
    invoke-static {v8, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    :goto_2
    if-eqz v3, :cond_4

    .line 105
    .line 106
    const-string v0, "snappy-framed"

    .line 107
    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :cond_4
    sget v3, Lme5;->C:I

    .line 111
    .line 112
    if-le v0, v4, :cond_5

    .line 113
    .line 114
    aget-byte v3, v1, v2

    .line 115
    .line 116
    if-ne v3, v6, :cond_5

    .line 117
    .line 118
    aget-byte v3, v1, v5

    .line 119
    .line 120
    const/16 v6, -0x63

    .line 121
    .line 122
    if-ne v3, v6, :cond_5

    .line 123
    .line 124
    const-string v0, "z"

    .line 125
    .line 126
    goto/16 :goto_a

    .line 127
    .line 128
    :cond_5
    sget v3, Lyn0;->q:I

    .line 129
    .line 130
    if-le v0, v4, :cond_7

    .line 131
    .line 132
    aget-byte v3, v1, v2

    .line 133
    .line 134
    const/16 v6, 0x78

    .line 135
    .line 136
    if-ne v3, v6, :cond_7

    .line 137
    .line 138
    aget-byte v3, v1, v5

    .line 139
    .line 140
    if-eq v3, v5, :cond_6

    .line 141
    .line 142
    const/16 v5, 0x5e

    .line 143
    .line 144
    if-eq v3, v5, :cond_6

    .line 145
    .line 146
    const/16 v5, -0x64

    .line 147
    .line 148
    if-eq v3, v5, :cond_6

    .line 149
    .line 150
    const/16 v5, -0x26

    .line 151
    .line 152
    if-ne v3, v5, :cond_7

    .line 153
    .line 154
    :cond_6
    const-string v0, "deflate"

    .line 155
    .line 156
    goto/16 :goto_a

    .line 157
    .line 158
    :cond_7
    const/4 v3, 0x6

    .line 159
    if-ge v0, v3, :cond_8

    .line 160
    .line 161
    sget-object v3, Lfe5;->a:[B

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_8
    move v5, v2

    .line 165
    :goto_3
    sget-object v6, Lfe5;->a:[B

    .line 166
    .line 167
    if-ge v5, v3, :cond_13

    .line 168
    .line 169
    aget-byte v7, v1, v5

    .line 170
    .line 171
    aget-byte v6, v6, v5

    .line 172
    .line 173
    if-eq v7, v6, :cond_12

    .line 174
    .line 175
    :goto_4
    if-ge v0, v4, :cond_9

    .line 176
    .line 177
    sget-object v3, Lm42;->a:[B

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    move v3, v2

    .line 181
    :goto_5
    sget-object v5, Lm42;->a:[B

    .line 182
    .line 183
    if-ge v3, v4, :cond_11

    .line 184
    .line 185
    aget-byte v6, v1, v3

    .line 186
    .line 187
    aget-byte v5, v5, v3

    .line 188
    .line 189
    if-eq v6, v5, :cond_10

    .line 190
    .line 191
    :goto_6
    sget-object v3, Lqe1;->B:[B

    .line 192
    .line 193
    const/4 v5, 0x4

    .line 194
    if-ge v0, v5, :cond_a

    .line 195
    .line 196
    move v3, v2

    .line 197
    goto :goto_7

    .line 198
    :cond_a
    new-array v6, v5, [B

    .line 199
    .line 200
    invoke-static {v1, v2, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 201
    .line 202
    .line 203
    invoke-static {v6, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    :goto_7
    if-eqz v3, :cond_b

    .line 208
    .line 209
    const-string v0, "lz4-framed"

    .line 210
    .line 211
    goto :goto_a

    .line 212
    :cond_b
    if-lt v0, v5, :cond_e

    .line 213
    .line 214
    move v0, v2

    .line 215
    :goto_8
    sget-object v3, Lse5;->a:[B

    .line 216
    .line 217
    if-ge v0, v5, :cond_d

    .line 218
    .line 219
    aget-byte v6, v1, v0

    .line 220
    .line 221
    aget-byte v3, v3, v0

    .line 222
    .line 223
    if-eq v6, v3, :cond_c

    .line 224
    .line 225
    aget-byte v0, v1, v2

    .line 226
    .line 227
    and-int/lit16 v0, v0, 0xf0

    .line 228
    .line 229
    const/16 v3, 0x50

    .line 230
    .line 231
    if-ne v3, v0, :cond_f

    .line 232
    .line 233
    :goto_9
    sget-object v0, Lse5;->b:[B

    .line 234
    .line 235
    if-ge v2, v4, :cond_d

    .line 236
    .line 237
    add-int/lit8 v3, v2, 0x1

    .line 238
    .line 239
    aget-byte v5, v1, v3

    .line 240
    .line 241
    aget-byte v0, v0, v2

    .line 242
    .line 243
    if-ne v5, v0, :cond_f

    .line 244
    .line 245
    move v2, v3

    .line 246
    goto :goto_9

    .line 247
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_d
    const-string v0, "zstd"

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_e
    sget-object p0, Lse5;->a:[B

    .line 254
    .line 255
    :cond_f
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 256
    .line 257
    const-string p1, "No Compressor found for the stream signature."

    .line 258
    .line 259
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p0

    .line 263
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_11
    const-string v0, "lzma"

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_13
    const-string v0, "xz"

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_14
    add-int/lit8 v7, v7, 0x1

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_15
    const-string v0, "pack200"

    .line 280
    .line 281
    :goto_a
    invoke-virtual {p0, v0, p1}, Lk90;->b(Ljava/lang/String;Ljava/io/ByteArrayInputStream;)Li90;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    :catch_0
    move-exception p0

    .line 287
    new-instance p1, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 288
    .line 289
    const-string v0, "IOException while reading signature."

    .line 290
    .line 291
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    throw p1

    .line 295
    :cond_16
    const-string p0, "Mark is not supported."

    .line 296
    .line 297
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const/4 p0, 0x0

    .line 301
    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/io/ByteArrayInputStream;)Li90;
    .locals 7

    .line 1
    const-string v0, "LZMA compression is not available"

    .line 2
    .line 3
    const-string v1, "Zstandard compression is not available."

    .line 4
    .line 5
    const-string v2, "XZ compression is not available."

    .line 6
    .line 7
    const-string v3, "Brotli compression is not available."

    .line 8
    .line 9
    :try_start_0
    const-string v4, "gz"

    .line 10
    .line 11
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    new-instance p0, Lrk1;

    .line 18
    .line 19
    invoke-direct {p0, p2}, Lrk1;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string v4, "bzip2"

    .line 24
    .line 25
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    new-instance p0, Lmo;

    .line 32
    .line 33
    invoke-direct {p0, p2}, Lmo;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    const-string v4, "br"

    .line 38
    .line 39
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x2

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    sget p0, Lnv;->a:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 48
    .line 49
    if-eq p0, v6, :cond_2

    .line 50
    .line 51
    if-ne p0, v5, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_1
    const-string p0, "org.brotli.dec.BrotliInputStream"

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    .line 58
    .line 59
    :goto_0
    :try_start_2
    new-instance p0, Lmv;

    .line 60
    .line 61
    invoke-direct {p0, p2}, Lmv;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :catch_0
    :cond_3
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 66
    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    sget-object p2, Lk90;->c:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_4
    const-string v3, "xz"

    .line 86
    .line 87
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_7

    .line 92
    .line 93
    sget p0, Lfe5;->b:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 94
    .line 95
    if-eq p0, v6, :cond_5

    .line 96
    .line 97
    if-ne p0, v5, :cond_6

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    :try_start_3
    invoke-static {}, Lee5;->f()V
    :try_end_3
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 101
    .line 102
    .line 103
    :goto_1
    :try_start_4
    new-instance p0, Lee5;

    .line 104
    .line 105
    invoke-direct {p0, p2}, Lee5;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :catch_1
    :cond_6
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 110
    .line 111
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object p2, Lk90;->d:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_7
    const-string v2, "zstd"

    .line 130
    .line 131
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_a

    .line 136
    .line 137
    sget p0, Lse5;->c:I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 138
    .line 139
    if-eq p0, v6, :cond_8

    .line 140
    .line 141
    if-ne p0, v5, :cond_9

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    :try_start_5
    const-string p0, "com.github.luben.zstd.ZstdInputStream"

    .line 145
    .line 146
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 147
    .line 148
    .line 149
    :goto_2
    :try_start_6
    new-instance p0, Lre5;

    .line 150
    .line 151
    invoke-direct {p0, p2}, Lre5;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 152
    .line 153
    .line 154
    return-object p0

    .line 155
    :catch_2
    :cond_9
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 156
    .line 157
    new-instance p1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    sget-object p2, Lk90;->e:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :cond_a
    const-string v1, "lzma"

    .line 176
    .line 177
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_d

    .line 182
    .line 183
    sget p0, Lm42;->b:I
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 184
    .line 185
    if-eq p0, v6, :cond_b

    .line 186
    .line 187
    if-ne p0, v5, :cond_c

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_b
    :try_start_7
    sget p0, Ll42;->p:I
    :try_end_7
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 191
    .line 192
    :goto_3
    :try_start_8
    new-instance p0, Ll42;

    .line 193
    .line 194
    invoke-direct {p0, p2}, Ll42;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    :catch_3
    :cond_c
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 199
    .line 200
    new-instance p1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    sget-object p2, Lk90;->d:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_d
    const-string v0, "pack200"

    .line 219
    .line 220
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_e

    .line 225
    .line 226
    new-instance p0, Lxb3;

    .line 227
    .line 228
    invoke-direct {p0, p2}, Lxb3;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :cond_e
    const-string v0, "snappy-raw"

    .line 233
    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_f

    .line 239
    .line 240
    new-instance p0, Lbh4;

    .line 241
    .line 242
    const p1, 0x8000

    .line 243
    .line 244
    .line 245
    invoke-direct {p0, p2, p1}, Lbh4;-><init>(Ljava/io/InputStream;I)V

    .line 246
    .line 247
    .line 248
    return-object p0

    .line 249
    :cond_f
    const-string v0, "snappy-framed"

    .line 250
    .line 251
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_10

    .line 256
    .line 257
    new-instance p0, Lre1;

    .line 258
    .line 259
    invoke-direct {p0, p2}, Lre1;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 260
    .line 261
    .line 262
    return-object p0

    .line 263
    :cond_10
    const-string v0, "z"

    .line 264
    .line 265
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_11

    .line 270
    .line 271
    new-instance p0, Lme5;

    .line 272
    .line 273
    invoke-direct {p0, p2}, Lme5;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 274
    .line 275
    .line 276
    return-object p0

    .line 277
    :cond_11
    const-string v0, "deflate"

    .line 278
    .line 279
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_12

    .line 284
    .line 285
    new-instance p0, Lyn0;

    .line 286
    .line 287
    invoke-direct {p0, p2}, Lyn0;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 288
    .line 289
    .line 290
    return-object p0

    .line 291
    :cond_12
    const-string v0, "deflate64"

    .line 292
    .line 293
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_13

    .line 298
    .line 299
    new-instance p0, Lxn0;

    .line 300
    .line 301
    invoke-direct {p0, p2}, Lxn0;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 302
    .line 303
    .line 304
    return-object p0

    .line 305
    :cond_13
    const-string v0, "lz4-block"

    .line 306
    .line 307
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_14

    .line 312
    .line 313
    new-instance p0, Lgt;

    .line 314
    .line 315
    invoke-direct {p0, p2}, Lgt;-><init>(Ljava/io/InputStream;)V

    .line 316
    .line 317
    .line 318
    return-object p0

    .line 319
    :cond_14
    const-string v0, "lz4-framed"

    .line 320
    .line 321
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_15

    .line 326
    .line 327
    new-instance p0, Lqe1;

    .line 328
    .line 329
    invoke-direct {p0, p2}, Lqe1;-><init>(Ljava/io/ByteArrayInputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 330
    .line 331
    .line 332
    return-object p0

    .line 333
    :cond_15
    iget-object v0, p0, Lk90;->a:Ljava/util/SortedMap;

    .line 334
    .line 335
    if-nez v0, :cond_16

    .line 336
    .line 337
    new-instance v0, Lj90;

    .line 338
    .line 339
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/util/SortedMap;

    .line 347
    .line 348
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, p0, Lk90;->a:Ljava/util/SortedMap;

    .line 353
    .line 354
    :cond_16
    iget-object p0, p0, Lk90;->a:Ljava/util/SortedMap;

    .line 355
    .line 356
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 357
    .line 358
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    check-cast p0, Lk90;

    .line 367
    .line 368
    if-eqz p0, :cond_17

    .line 369
    .line 370
    invoke-virtual {p0, p1, p2}, Lk90;->b(Ljava/lang/String;Ljava/io/ByteArrayInputStream;)Li90;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    return-object p0

    .line 375
    :cond_17
    new-instance p0, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 376
    .line 377
    const-string p2, "Compressor: "

    .line 378
    .line 379
    const-string v0, " not found."

    .line 380
    .line 381
    invoke-static {p2, p1, v0}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    throw p0

    .line 389
    :catch_4
    move-exception p0

    .line 390
    new-instance p1, Lorg/apache/commons/compress/compressors/CompressorException;

    .line 391
    .line 392
    const-string p2, "Could not create CompressorInputStream."

    .line 393
    .line 394
    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    throw p1
.end method
