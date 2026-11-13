.class public final Ldefpackage/gt;
.super Ldefpackage/w0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public x:I

.field public y:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 1
    const/high16 v0, 0x10000

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Ldefpackage/w0;-><init>(Ljava/io/InputStream;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Ldefpackage/gt;->y:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final read([BII)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, v1, Ldefpackage/gt;->y:I

    .line 8
    .line 9
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v2, "Premature end of stream while parsing length"

    .line 14
    .line 15
    const/16 v3, 0xff

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    const/4 v7, 0x4

    .line 19
    const/4 v8, 0x2

    .line 20
    const/4 v9, -0x1

    .line 21
    if-eqz v0, :cond_11

    .line 22
    .line 23
    const/4 v10, 0x1

    .line 24
    if-eq v0, v10, :cond_10

    .line 25
    .line 26
    if-eq v0, v8, :cond_8

    .line 27
    .line 28
    if-eq v0, v4, :cond_7

    .line 29
    .line 30
    if-ne v0, v7, :cond_1

    .line 31
    .line 32
    return v9

    .line 33
    :cond_1
    iget v0, v1, Ldefpackage/gt;->y:I

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    if-eq v0, v1, :cond_6

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    if-eq v0, v1, :cond_5

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    if-eq v0, v1, :cond_4

    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    if-eq v0, v1, :cond_3

    .line 46
    .line 47
    const/4 v1, 0x5

    .line 48
    if-eq v0, v1, :cond_2

    .line 49
    .line 50
    const-string v0, "null"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string v0, "EOF"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-string v0, "IN_BACK_REFERENCE"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const-string v0, "LOOKING_FOR_BACK_REFERENCE"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    const-string v0, "IN_LITERAL"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    const-string v0, "NO_BLOCK"

    .line 66
    .line 67
    :goto_0
    const-string v1, "Unknown stream state "

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    const/4 v0, 0x0

    .line 77
    return v0

    .line 78
    :cond_7
    const-wide/16 v15, 0x0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_8
    :try_start_0
    iget-object v0, v1, Ldefpackage/w0;->w:Ldefpackage/hg3;

    .line 82
    .line 83
    invoke-static {v0, v8}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 84
    .line 85
    .line 86
    move-result-wide v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 87
    long-to-int v0, v11

    .line 88
    iget v4, v1, Ldefpackage/gt;->x:I

    .line 89
    .line 90
    int-to-long v11, v4

    .line 91
    const/16 v8, 0xf

    .line 92
    .line 93
    if-ne v4, v8, :cond_b

    .line 94
    .line 95
    const-wide/16 v13, 0x0

    .line 96
    .line 97
    :cond_9
    invoke-virtual {v1}, Ldefpackage/w0;->q()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eq v4, v9, :cond_a

    .line 102
    .line 103
    const-wide/16 v15, 0x0

    .line 104
    .line 105
    int-to-long v5, v4

    .line 106
    add-long/2addr v13, v5

    .line 107
    if-eq v4, v3, :cond_9

    .line 108
    .line 109
    add-long/2addr v11, v13

    .line 110
    goto :goto_2

    .line 111
    :cond_a
    invoke-static {v2}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_b
    const-wide/16 v15, 0x0

    .line 116
    .line 117
    :goto_2
    cmp-long v2, v11, v15

    .line 118
    .line 119
    if-ltz v2, :cond_e

    .line 120
    .line 121
    const-wide/16 v2, 0x4

    .line 122
    .line 123
    add-long/2addr v11, v2

    .line 124
    :try_start_1
    invoke-virtual {v1, v0, v11, v12}, Ldefpackage/w0;->s(IJ)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    .line 126
    .line 127
    iput v7, v1, Ldefpackage/gt;->y:I

    .line 128
    .line 129
    :goto_3
    invoke-virtual/range {p0 .. p3}, Ldefpackage/w0;->f([BII)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iget-wide v2, v1, Ldefpackage/w0;->t:J

    .line 134
    .line 135
    cmp-long v2, v2, v15

    .line 136
    .line 137
    if-lez v2, :cond_c

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_c
    iput v10, v1, Ldefpackage/gt;->y:I

    .line 141
    .line 142
    :goto_4
    if-lez v0, :cond_d

    .line 143
    .line 144
    return v0

    .line 145
    :cond_d
    invoke-virtual/range {p0 .. p3}, Ldefpackage/gt;->read([BII)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    return v0

    .line 150
    :catch_0
    move-exception v0

    .line 151
    new-instance v1, Ljava/io/IOException;

    .line 152
    .line 153
    const-string v2, "Illegal block with bad offset found"

    .line 154
    .line 155
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_e
    const-string v0, "Illegal block with a negative match length found"

    .line 160
    .line 161
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :catch_1
    move-exception v0

    .line 166
    iget v2, v1, Ldefpackage/gt;->x:I

    .line 167
    .line 168
    if-nez v2, :cond_f

    .line 169
    .line 170
    const/4 v0, 0x5

    .line 171
    iput v0, v1, Ldefpackage/gt;->y:I

    .line 172
    .line 173
    return v9

    .line 174
    :cond_f
    throw v0

    .line 175
    :cond_10
    const-wide/16 v15, 0x0

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_11
    const-wide/16 v15, 0x0

    .line 179
    .line 180
    invoke-virtual {v1}, Ldefpackage/w0;->q()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eq v0, v9, :cond_19

    .line 185
    .line 186
    and-int/lit8 v5, v0, 0xf

    .line 187
    .line 188
    iput v5, v1, Ldefpackage/gt;->x:I

    .line 189
    .line 190
    and-int/lit16 v0, v0, 0xf0

    .line 191
    .line 192
    shr-int/2addr v0, v7

    .line 193
    int-to-long v5, v0

    .line 194
    const-wide/16 v10, 0xf

    .line 195
    .line 196
    cmp-long v0, v5, v10

    .line 197
    .line 198
    if-nez v0, :cond_14

    .line 199
    .line 200
    move-wide v10, v15

    .line 201
    :cond_12
    invoke-virtual {v1}, Ldefpackage/w0;->q()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eq v0, v9, :cond_13

    .line 206
    .line 207
    int-to-long v12, v0

    .line 208
    add-long/2addr v10, v12

    .line 209
    if-eq v0, v3, :cond_12

    .line 210
    .line 211
    add-long/2addr v5, v10

    .line 212
    goto :goto_5

    .line 213
    :cond_13
    invoke-static {v2}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :cond_14
    :goto_5
    cmp-long v0, v5, v15

    .line 219
    .line 220
    if-ltz v0, :cond_18

    .line 221
    .line 222
    if-ltz v0, :cond_17

    .line 223
    .line 224
    iput-wide v5, v1, Ldefpackage/w0;->t:J

    .line 225
    .line 226
    iput v8, v1, Ldefpackage/gt;->y:I

    .line 227
    .line 228
    :goto_6
    invoke-virtual/range {p0 .. p3}, Ldefpackage/w0;->n([BII)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iget-wide v2, v1, Ldefpackage/w0;->t:J

    .line 233
    .line 234
    cmp-long v2, v2, v15

    .line 235
    .line 236
    if-lez v2, :cond_15

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_15
    iput v4, v1, Ldefpackage/gt;->y:I

    .line 240
    .line 241
    :goto_7
    if-lez v0, :cond_16

    .line 242
    .line 243
    return v0

    .line 244
    :cond_16
    invoke-virtual/range {p0 .. p3}, Ldefpackage/gt;->read([BII)I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    return v0

    .line 249
    :cond_17
    const-string v0, "length must not be negative"

    .line 250
    .line 251
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :cond_18
    const-string v0, "Illegal block with a negative literal size found"

    .line 257
    .line 258
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :cond_19
    const-string v0, "Premature end of stream while looking for next block"

    .line 264
    .line 265
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_1
.end method
