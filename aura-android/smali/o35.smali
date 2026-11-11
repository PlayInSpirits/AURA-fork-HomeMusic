.class public final synthetic Lo35;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo35;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p0, p0, Lo35;->n:I

    .line 2
    .line 3
    const-wide v0, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lbc5;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Lzd;

    .line 20
    .line 21
    iget p0, p1, Lzd;->a:F

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    check-cast p1, Lbe;

    .line 29
    .line 30
    new-instance p0, Lwv3;

    .line 31
    .line 32
    iget v0, p1, Lbe;->a:F

    .line 33
    .line 34
    iget v1, p1, Lbe;->b:F

    .line 35
    .line 36
    iget v2, p1, Lbe;->c:F

    .line 37
    .line 38
    iget p1, p1, Lbe;->d:F

    .line 39
    .line 40
    invoke-direct {p0, v0, v1, v2, p1}, Lwv3;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_2
    check-cast p1, Lwv3;

    .line 45
    .line 46
    new-instance p0, Lbe;

    .line 47
    .line 48
    iget v0, p1, Lwv3;->a:F

    .line 49
    .line 50
    iget v1, p1, Lwv3;->b:F

    .line 51
    .line 52
    iget v2, p1, Lwv3;->c:F

    .line 53
    .line 54
    iget p1, p1, Lwv3;->d:F

    .line 55
    .line 56
    invoke-direct {p0, v0, v1, v2, p1}, Lbe;-><init>(FFFF)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    check-cast p1, Lae;

    .line 61
    .line 62
    iget p0, p1, Lae;->a:F

    .line 63
    .line 64
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    const/4 v3, 0x0

    .line 69
    if-gez p0, :cond_0

    .line 70
    .line 71
    move p0, v3

    .line 72
    :cond_0
    iget p1, p1, Lae;->b:F

    .line 73
    .line 74
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-gez p1, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move v3, p1

    .line 82
    :goto_0
    int-to-long p0, p0

    .line 83
    shl-long/2addr p0, v2

    .line 84
    int-to-long v2, v3

    .line 85
    and-long/2addr v0, v2

    .line 86
    or-long/2addr p0, v0

    .line 87
    new-instance v0, Ln02;

    .line 88
    .line 89
    invoke-direct {v0, p0, p1}, Ln02;-><init>(J)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_4
    check-cast p1, Ln02;

    .line 94
    .line 95
    new-instance p0, Lae;

    .line 96
    .line 97
    iget-wide v3, p1, Ln02;->a:J

    .line 98
    .line 99
    shr-long v5, v3, v2

    .line 100
    .line 101
    long-to-int p1, v5

    .line 102
    int-to-float p1, p1

    .line 103
    and-long/2addr v0, v3

    .line 104
    long-to-int v0, v0

    .line 105
    int-to-float v0, v0

    .line 106
    invoke-direct {p0, p1, v0}, Lae;-><init>(FF)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_5
    check-cast p1, Lae;

    .line 111
    .line 112
    iget p0, p1, Lae;->a:F

    .line 113
    .line 114
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    iget p1, p1, Lae;->b:F

    .line 119
    .line 120
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    int-to-long v3, p0

    .line 125
    shl-long v2, v3, v2

    .line 126
    .line 127
    int-to-long p0, p1

    .line 128
    and-long/2addr p0, v0

    .line 129
    or-long/2addr p0, v2

    .line 130
    new-instance v0, Lg02;

    .line 131
    .line 132
    invoke-direct {v0, p0, p1}, Lg02;-><init>(J)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_6
    check-cast p1, Lg02;

    .line 137
    .line 138
    new-instance p0, Lae;

    .line 139
    .line 140
    iget-wide v3, p1, Lg02;->a:J

    .line 141
    .line 142
    shr-long v5, v3, v2

    .line 143
    .line 144
    long-to-int p1, v5

    .line 145
    int-to-float p1, p1

    .line 146
    and-long/2addr v0, v3

    .line 147
    long-to-int v0, v0

    .line 148
    int-to-float v0, v0

    .line 149
    invoke-direct {p0, p1, v0}, Lae;-><init>(FF)V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_7
    check-cast p1, Lae;

    .line 154
    .line 155
    iget p0, p1, Lae;->a:F

    .line 156
    .line 157
    iget p1, p1, Lae;->b:F

    .line 158
    .line 159
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    int-to-long v3, p0

    .line 164
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    int-to-long p0, p0

    .line 169
    shl-long v2, v3, v2

    .line 170
    .line 171
    and-long/2addr p0, v0

    .line 172
    or-long/2addr p0, v2

    .line 173
    new-instance v0, Lg83;

    .line 174
    .line 175
    invoke-direct {v0, p0, p1}, Lg83;-><init>(J)V

    .line 176
    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_8
    check-cast p1, Lg83;

    .line 180
    .line 181
    new-instance p0, Lae;

    .line 182
    .line 183
    iget-wide v3, p1, Lg83;->a:J

    .line 184
    .line 185
    shr-long v2, v3, v2

    .line 186
    .line 187
    long-to-int v2, v2

    .line 188
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    iget-wide v3, p1, Lg83;->a:J

    .line 193
    .line 194
    and-long/2addr v0, v3

    .line 195
    long-to-int p1, v0

    .line 196
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    invoke-direct {p0, v2, p1}, Lae;-><init>(FF)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_9
    check-cast p1, Lae;

    .line 205
    .line 206
    iget p0, p1, Lae;->a:F

    .line 207
    .line 208
    iget p1, p1, Lae;->b:F

    .line 209
    .line 210
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    int-to-long v3, p0

    .line 215
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    int-to-long p0, p0

    .line 220
    shl-long v2, v3, v2

    .line 221
    .line 222
    and-long/2addr p0, v0

    .line 223
    or-long/2addr p0, v2

    .line 224
    new-instance v0, Lqf4;

    .line 225
    .line 226
    invoke-direct {v0, p0, p1}, Lqf4;-><init>(J)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_a
    check-cast p1, Lqf4;

    .line 231
    .line 232
    new-instance p0, Lae;

    .line 233
    .line 234
    iget-wide v3, p1, Lqf4;->a:J

    .line 235
    .line 236
    shr-long v2, v3, v2

    .line 237
    .line 238
    long-to-int v2, v2

    .line 239
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    iget-wide v3, p1, Lqf4;->a:J

    .line 244
    .line 245
    and-long/2addr v0, v3

    .line 246
    long-to-int p1, v0

    .line 247
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-direct {p0, v2, p1}, Lae;-><init>(FF)V

    .line 252
    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_b
    check-cast p1, Lae;

    .line 256
    .line 257
    iget p0, p1, Lae;->a:F

    .line 258
    .line 259
    iget p1, p1, Lae;->b:F

    .line 260
    .line 261
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    int-to-long v3, p0

    .line 266
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    int-to-long p0, p0

    .line 271
    shl-long v2, v3, v2

    .line 272
    .line 273
    and-long/2addr p0, v0

    .line 274
    or-long/2addr p0, v2

    .line 275
    new-instance v0, Lmu0;

    .line 276
    .line 277
    invoke-direct {v0, p0, p1}, Lmu0;-><init>(J)V

    .line 278
    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
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
