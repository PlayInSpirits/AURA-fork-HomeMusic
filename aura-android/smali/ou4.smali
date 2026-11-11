.class public final Lou4;
.super Lfp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lou4;->i:I

    .line 8
    .line 9
    return-void
.end method

.method public static m(ILjava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    const-wide v0, 0x3e00000000200000L    # 4.656612875245797E-10

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-double v2, p0

    .line 7
    mul-double/2addr v2, v0

    .line 8
    double-to-float p0, v2

    .line 9
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget v0, Lou4;->i:I

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    :cond_0
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lgm;)Lgm;
    .locals 2

    .line 1
    iget p0, p1, Lgm;->c:I

    .line 2
    .line 3
    const/16 v0, 0x15

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    .line 8
    const/high16 v0, 0x50000000

    .line 9
    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/16 v0, 0x16

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/high16 v0, 0x60000000

    .line 17
    .line 18
    if-eq p0, v0, :cond_2

    .line 19
    .line 20
    if-ne p0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    if-ne p0, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance p0, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;-><init>(Lgm;)V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_2
    :goto_0
    if-eq p0, v1, :cond_3

    .line 34
    .line 35
    new-instance p0, Lgm;

    .line 36
    .line 37
    iget v0, p1, Lgm;->a:I

    .line 38
    .line 39
    iget p1, p1, Lgm;->b:I

    .line 40
    .line 41
    invoke-direct {p0, v0, p1, v1}, Lgm;-><init>(III)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object p0, Lgm;->e:Lgm;

    .line 46
    .line 47
    return-object p0
.end method

.method public final e(Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v2, v1, v0

    .line 10
    .line 11
    iget-object v3, p0, Lfp;->b:Lgm;

    .line 12
    .line 13
    iget v3, v3, Lgm;->c:I

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v3, v4, :cond_4

    .line 17
    .line 18
    const/high16 v4, 0x50000000

    .line 19
    .line 20
    if-eq v3, v4, :cond_3

    .line 21
    .line 22
    const/high16 v4, 0x60000000

    .line 23
    .line 24
    if-eq v3, v4, :cond_2

    .line 25
    .line 26
    const/16 v4, 0x15

    .line 27
    .line 28
    if-eq v3, v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x16

    .line 31
    .line 32
    if-ne v3, v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    if-ge v0, v1, :cond_5

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    and-int/lit16 v2, v2, 0xff

    .line 45
    .line 46
    add-int/lit8 v3, v0, 0x1

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    and-int/lit16 v3, v3, 0xff

    .line 53
    .line 54
    shl-int/lit8 v3, v3, 0x8

    .line 55
    .line 56
    or-int/2addr v2, v3

    .line 57
    add-int/lit8 v3, v0, 0x2

    .line 58
    .line 59
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    and-int/lit16 v3, v3, 0xff

    .line 64
    .line 65
    shl-int/lit8 v3, v3, 0x10

    .line 66
    .line 67
    or-int/2addr v2, v3

    .line 68
    add-int/lit8 v3, v0, 0x3

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    and-int/lit16 v3, v3, 0xff

    .line 75
    .line 76
    shl-int/lit8 v3, v3, 0x18

    .line 77
    .line 78
    or-int/2addr v2, v3

    .line 79
    invoke-static {v2, p0}, Lou4;->m(ILjava/nio/ByteBuffer;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    div-int/lit8 v2, v2, 0x3

    .line 90
    .line 91
    mul-int/lit8 v2, v2, 0x4

    .line 92
    .line 93
    invoke-virtual {p0, v2}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_1
    if-ge v0, v1, :cond_5

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    and-int/lit16 v2, v2, 0xff

    .line 104
    .line 105
    shl-int/lit8 v2, v2, 0x8

    .line 106
    .line 107
    add-int/lit8 v3, v0, 0x1

    .line 108
    .line 109
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    and-int/lit16 v3, v3, 0xff

    .line 114
    .line 115
    shl-int/lit8 v3, v3, 0x10

    .line 116
    .line 117
    or-int/2addr v2, v3

    .line 118
    add-int/lit8 v3, v0, 0x2

    .line 119
    .line 120
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    and-int/lit16 v3, v3, 0xff

    .line 125
    .line 126
    shl-int/lit8 v3, v3, 0x18

    .line 127
    .line 128
    or-int/2addr v2, v3

    .line 129
    invoke-static {v2, p0}, Lou4;->m(ILjava/nio/ByteBuffer;)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v0, v0, 0x3

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {p0, v2}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_2
    if-ge v0, v1, :cond_5

    .line 140
    .line 141
    add-int/lit8 v2, v0, 0x3

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    and-int/lit16 v2, v2, 0xff

    .line 148
    .line 149
    add-int/lit8 v3, v0, 0x2

    .line 150
    .line 151
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    and-int/lit16 v3, v3, 0xff

    .line 156
    .line 157
    shl-int/lit8 v3, v3, 0x8

    .line 158
    .line 159
    or-int/2addr v2, v3

    .line 160
    add-int/lit8 v3, v0, 0x1

    .line 161
    .line 162
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    and-int/lit16 v3, v3, 0xff

    .line 167
    .line 168
    shl-int/lit8 v3, v3, 0x10

    .line 169
    .line 170
    or-int/2addr v2, v3

    .line 171
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    and-int/lit16 v3, v3, 0xff

    .line 176
    .line 177
    shl-int/lit8 v3, v3, 0x18

    .line 178
    .line 179
    or-int/2addr v2, v3

    .line 180
    invoke-static {v2, p0}, Lou4;->m(ILjava/nio/ByteBuffer;)V

    .line 181
    .line 182
    .line 183
    add-int/lit8 v0, v0, 0x4

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    div-int/lit8 v2, v2, 0x3

    .line 187
    .line 188
    mul-int/lit8 v2, v2, 0x4

    .line 189
    .line 190
    invoke-virtual {p0, v2}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    :goto_3
    if-ge v0, v1, :cond_5

    .line 195
    .line 196
    add-int/lit8 v2, v0, 0x2

    .line 197
    .line 198
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    and-int/lit16 v2, v2, 0xff

    .line 203
    .line 204
    shl-int/lit8 v2, v2, 0x8

    .line 205
    .line 206
    add-int/lit8 v3, v0, 0x1

    .line 207
    .line 208
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    and-int/lit16 v3, v3, 0xff

    .line 213
    .line 214
    shl-int/lit8 v3, v3, 0x10

    .line 215
    .line 216
    or-int/2addr v2, v3

    .line 217
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    and-int/lit16 v3, v3, 0xff

    .line 222
    .line 223
    shl-int/lit8 v3, v3, 0x18

    .line 224
    .line 225
    or-int/2addr v2, v3

    .line 226
    invoke-static {v2, p0}, Lou4;->m(ILjava/nio/ByteBuffer;)V

    .line 227
    .line 228
    .line 229
    add-int/lit8 v0, v0, 0x3

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_4
    mul-int/2addr v2, v4

    .line 233
    invoke-virtual {p0, v2}, Lfp;->l(I)Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    :goto_4
    if-ge v0, v1, :cond_5

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    and-int/lit16 v2, v2, 0xff

    .line 244
    .line 245
    shl-int/lit8 v2, v2, 0x10

    .line 246
    .line 247
    add-int/lit8 v3, v0, 0x1

    .line 248
    .line 249
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    and-int/lit16 v3, v3, 0xff

    .line 254
    .line 255
    shl-int/lit8 v3, v3, 0x18

    .line 256
    .line 257
    or-int/2addr v2, v3

    .line 258
    invoke-static {v2, p0}, Lou4;->m(ILjava/nio/ByteBuffer;)V

    .line 259
    .line 260
    .line 261
    add-int/lit8 v0, v0, 0x2

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 272
    .line 273
    .line 274
    return-void
.end method
