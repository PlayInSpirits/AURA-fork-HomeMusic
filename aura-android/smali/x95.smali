.class public final Lx95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# static fields
.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Liu4;

.field public final c:Lbe3;

.field public final d:Lxn4;

.field public final e:Z

.field public f:Lm51;

.field public g:[B

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "LOCAL:([^,]+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lx95;->i:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "MPEGTS:(-?\\d+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lx95;->j:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Liu4;Lxn4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx95;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lx95;->b:Liu4;

    .line 7
    .line 8
    new-instance p1, Lbe3;

    .line 9
    .line 10
    invoke-direct {p1}, Lbe3;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx95;->c:Lbe3;

    .line 14
    .line 15
    const/16 p1, 0x400

    .line 16
    .line 17
    new-array p1, p1, [B

    .line 18
    .line 19
    iput-object p1, p0, Lx95;->g:[B

    .line 20
    .line 21
    iput-object p3, p0, Lx95;->d:Lxn4;

    .line 22
    .line 23
    iput-boolean p4, p0, Lx95;->e:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx95;->f:Lm51;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p1 .. p1}, Ll51;->getLength()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    long-to-int v1, v1

    .line 13
    iget v2, v0, Lx95;->h:I

    .line 14
    .line 15
    iget-object v3, v0, Lx95;->g:[B

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    const/4 v5, -0x1

    .line 19
    if-ne v2, v4, :cond_1

    .line 20
    .line 21
    if-eq v1, v5, :cond_0

    .line 22
    .line 23
    move v2, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v2, v3

    .line 26
    :goto_0
    mul-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    div-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v0, Lx95;->g:[B

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Lx95;->g:[B

    .line 37
    .line 38
    iget v3, v0, Lx95;->h:I

    .line 39
    .line 40
    array-length v4, v2

    .line 41
    sub-int/2addr v4, v3

    .line 42
    move-object/from16 v6, p1

    .line 43
    .line 44
    invoke-interface {v6, v2, v3, v4}, Lwh0;->read([BII)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eq v2, v5, :cond_3

    .line 49
    .line 50
    iget v3, v0, Lx95;->h:I

    .line 51
    .line 52
    add-int/2addr v3, v2

    .line 53
    iput v3, v0, Lx95;->h:I

    .line 54
    .line 55
    if-eq v1, v5, :cond_2

    .line 56
    .line 57
    if-eq v3, v1, :cond_3

    .line 58
    .line 59
    :cond_2
    const/4 v0, 0x0

    .line 60
    return v0

    .line 61
    :cond_3
    new-instance v1, Lbe3;

    .line 62
    .line 63
    iget-object v2, v0, Lx95;->g:[B

    .line 64
    .line 65
    invoke-direct {v1, v2}, Lbe3;-><init>([B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Ly95;->d(Lbe3;)V

    .line 69
    .line 70
    .line 71
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lbe3;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-wide/16 v3, 0x0

    .line 78
    .line 79
    move-wide v6, v3

    .line 80
    move-wide v8, v6

    .line 81
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    const/4 v11, 0x1

    .line 86
    const/4 v12, 0x0

    .line 87
    if-nez v10, :cond_7

    .line 88
    .line 89
    const-string v10, "X-TIMESTAMP-MAP"

    .line 90
    .line 91
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_6

    .line 96
    .line 97
    sget-object v6, Lx95;->i:Ljava/util/regex/Pattern;

    .line 98
    .line 99
    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    sget-object v7, Lx95;->j:Ljava/util/regex/Pattern;

    .line 110
    .line 111
    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_4

    .line 120
    .line 121
    invoke-virtual {v6, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v2}, Ly95;->c(Ljava/lang/String;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v8

    .line 132
    invoke-virtual {v7, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v10

    .line 143
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 144
    .line 145
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 146
    .line 147
    const-wide/32 v12, 0xf4240

    .line 148
    .line 149
    .line 150
    const-wide/32 v14, 0x15f90

    .line 151
    .line 152
    .line 153
    invoke-static/range {v10 .. v16}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    goto :goto_2

    .line 158
    :cond_4
    const-string v0, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v12, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    throw v0

    .line 169
    :cond_5
    const-string v0, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v12, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    throw v0

    .line 180
    :cond_6
    :goto_2
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Lbe3;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    goto :goto_1

    .line 187
    :cond_7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Lbe3;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-eqz v2, :cond_9

    .line 194
    .line 195
    sget-object v10, Ly95;->a:Ljava/util/regex/Pattern;

    .line 196
    .line 197
    invoke-virtual {v10, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_8

    .line 206
    .line 207
    :goto_3
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Lbe3;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-nez v2, :cond_7

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_8
    sget-object v10, Lw95;->a:Ljava/util/regex/Pattern;

    .line 223
    .line 224
    invoke-virtual {v10, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    if-eqz v10, :cond_7

    .line 233
    .line 234
    move-object v12, v2

    .line 235
    :cond_9
    if-nez v12, :cond_a

    .line 236
    .line 237
    invoke-virtual {v0, v3, v4}, Lx95;->g(J)Lwv4;

    .line 238
    .line 239
    .line 240
    return v5

    .line 241
    :cond_a
    invoke-virtual {v12, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {v1}, Ly95;->c(Ljava/lang/String;)J

    .line 249
    .line 250
    .line 251
    move-result-wide v1

    .line 252
    add-long/2addr v6, v1

    .line 253
    sub-long v10, v6, v8

    .line 254
    .line 255
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 256
    .line 257
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 258
    .line 259
    const-wide/32 v12, 0x15f90

    .line 260
    .line 261
    .line 262
    const-wide/32 v14, 0xf4240

    .line 263
    .line 264
    .line 265
    invoke-static/range {v10 .. v16}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 266
    .line 267
    .line 268
    move-result-wide v3

    .line 269
    const-wide v6, 0x200000000L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    rem-long/2addr v3, v6

    .line 275
    iget-object v6, v0, Lx95;->b:Liu4;

    .line 276
    .line 277
    invoke-virtual {v6, v3, v4}, Liu4;->b(J)J

    .line 278
    .line 279
    .line 280
    move-result-wide v8

    .line 281
    sub-long v1, v8, v1

    .line 282
    .line 283
    invoke-virtual {v0, v1, v2}, Lx95;->g(J)Lwv4;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    iget-object v1, v0, Lx95;->g:[B

    .line 288
    .line 289
    iget v2, v0, Lx95;->h:I

    .line 290
    .line 291
    iget-object v3, v0, Lx95;->c:Lbe3;

    .line 292
    .line 293
    invoke-virtual {v3, v2, v1}, Lbe3;->L(I[B)V

    .line 294
    .line 295
    .line 296
    iget v1, v0, Lx95;->h:I

    .line 297
    .line 298
    invoke-interface {v7, v1, v3}, Lwv4;->e(ILbe3;)V

    .line 299
    .line 300
    .line 301
    iget v11, v0, Lx95;->h:I

    .line 302
    .line 303
    const/4 v12, 0x0

    .line 304
    const/4 v13, 0x0

    .line 305
    const/4 v10, 0x1

    .line 306
    invoke-interface/range {v7 .. v13}, Lwv4;->a(JIIILvv4;)V

    .line 307
    .line 308
    .line 309
    return v5
.end method

.method public final c(Ll51;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lx95;->g:[B

    .line 2
    .line 3
    check-cast p1, Lrk0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x6

    .line 7
    invoke-virtual {p1, v0, v1, v2, v1}, Lrk0;->e([BIIZ)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx95;->g:[B

    .line 11
    .line 12
    iget-object v3, p0, Lx95;->c:Lbe3;

    .line 13
    .line 14
    invoke-virtual {v3, v2, v0}, Lbe3;->L(I[B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Ly95;->a(Lbe3;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    iget-object v0, p0, Lx95;->g:[B

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-virtual {p1, v0, v2, v4, v1}, Lrk0;->e([BIIZ)Z

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lx95;->g:[B

    .line 32
    .line 33
    const/16 p1, 0x9

    .line 34
    .line 35
    invoke-virtual {v3, p1, p0}, Lbe3;->L(I[B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Ly95;->a(Lbe3;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final d(JJ)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final f(Lm51;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx95;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lll;

    .line 6
    .line 7
    iget-object v1, p0, Lx95;->d:Lxn4;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lll;-><init>(Lm51;Lxn4;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Lx95;->f:Lm51;

    .line 14
    .line 15
    new-instance p0, Lbo;

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, Lbo;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p0}, Lm51;->w(Lm84;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final g(J)Lwv4;
    .locals 3

    .line 1
    iget-object v0, p0, Lx95;->f:Lm51;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-interface {v0, v1, v2}, Lm51;->t(II)Lwv4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lsb1;

    .line 10
    .line 11
    invoke-direct {v1}, Lsb1;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "text/vtt"

    .line 15
    .line 16
    invoke-static {v2}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v1, Lsb1;->m:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Lx95;->a:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v2, v1, Lsb1;->d:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide p1, v1, Lsb1;->r:J

    .line 27
    .line 28
    invoke-static {v1, v0}, Lf34;->l(Lsb1;Lwv4;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lx95;->f:Lm51;

    .line 32
    .line 33
    invoke-interface {p0}, Lm51;->p()V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
