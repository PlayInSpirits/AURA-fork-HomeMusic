.class public final Lvf4;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lu62;


# instance fields
.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:Z


# virtual methods
.method public final r(Lcf2;Lpi2;J)Lvi2;
    .locals 6

    .line 1
    iget v0, p0, Lvf4;->D:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lvf4;->D:F

    .line 14
    .line 15
    invoke-interface {p1, v0}, Loo0;->V(F)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-gez v0, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :cond_1
    :goto_0
    iget v3, p0, Lvf4;->E:F

    .line 25
    .line 26
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    iget v3, p0, Lvf4;->E:F

    .line 33
    .line 34
    invoke-interface {p1, v3}, Loo0;->V(F)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-gez v3, :cond_3

    .line 39
    .line 40
    move v3, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v3, v1

    .line 43
    :cond_3
    :goto_1
    iget v4, p0, Lvf4;->B:F

    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_6

    .line 50
    .line 51
    iget v4, p0, Lvf4;->B:F

    .line 52
    .line 53
    invoke-interface {p1, v4}, Loo0;->V(F)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-gez v4, :cond_4

    .line 58
    .line 59
    move v4, v2

    .line 60
    :cond_4
    if-le v4, v0, :cond_5

    .line 61
    .line 62
    move v4, v0

    .line 63
    :cond_5
    if-eq v4, v1, :cond_6

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_6
    move v4, v2

    .line 67
    :goto_2
    iget v5, p0, Lvf4;->C:F

    .line 68
    .line 69
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_9

    .line 74
    .line 75
    iget v5, p0, Lvf4;->C:F

    .line 76
    .line 77
    invoke-interface {p1, v5}, Loo0;->V(F)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-gez v5, :cond_7

    .line 82
    .line 83
    move v5, v2

    .line 84
    :cond_7
    if-le v5, v3, :cond_8

    .line 85
    .line 86
    move v5, v3

    .line 87
    :cond_8
    if-eq v5, v1, :cond_9

    .line 88
    .line 89
    move v2, v5

    .line 90
    :cond_9
    invoke-static {v4, v0, v2, v3}, Lqc0;->a(IIII)J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    iget-boolean v2, p0, Lvf4;->F:Z

    .line 95
    .line 96
    if-eqz v2, :cond_12

    .line 97
    .line 98
    invoke-static {p3, p4}, Lnc0;->j(J)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-static {p3, p4}, Lnc0;->h(J)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-static {p3, p4}, Lnc0;->i(J)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {p3, p4}, Lnc0;->g(J)I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    invoke-static {v0, v1}, Lnc0;->j(J)I

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-ge p4, p0, :cond_a

    .line 119
    .line 120
    move p4, p0

    .line 121
    :cond_a
    if-le p4, v2, :cond_b

    .line 122
    .line 123
    move p4, v2

    .line 124
    :cond_b
    invoke-static {v0, v1}, Lnc0;->h(J)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-ge v4, p0, :cond_c

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_c
    move p0, v4

    .line 132
    :goto_3
    if-le p0, v2, :cond_d

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_d
    move v2, p0

    .line 136
    :goto_4
    invoke-static {v0, v1}, Lnc0;->i(J)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-ge p0, v3, :cond_e

    .line 141
    .line 142
    move p0, v3

    .line 143
    :cond_e
    if-le p0, p3, :cond_f

    .line 144
    .line 145
    move p0, p3

    .line 146
    :cond_f
    invoke-static {v0, v1}, Lnc0;->g(J)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-ge v0, v3, :cond_10

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_10
    move v3, v0

    .line 154
    :goto_5
    if-le v3, p3, :cond_11

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_11
    move p3, v3

    .line 158
    :goto_6
    invoke-static {p4, v2, p0, p3}, Lqc0;->a(IIII)J

    .line 159
    .line 160
    .line 161
    move-result-wide p3

    .line 162
    goto :goto_b

    .line 163
    :cond_12
    iget v2, p0, Lvf4;->B:F

    .line 164
    .line 165
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_13

    .line 170
    .line 171
    invoke-static {v0, v1}, Lnc0;->j(J)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    goto :goto_7

    .line 176
    :cond_13
    invoke-static {p3, p4}, Lnc0;->j(J)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-static {v0, v1}, Lnc0;->h(J)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-le v2, v3, :cond_14

    .line 185
    .line 186
    move v2, v3

    .line 187
    :cond_14
    :goto_7
    iget v3, p0, Lvf4;->D:F

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_15

    .line 194
    .line 195
    invoke-static {v0, v1}, Lnc0;->h(J)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    goto :goto_8

    .line 200
    :cond_15
    invoke-static {p3, p4}, Lnc0;->h(J)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-static {v0, v1}, Lnc0;->j(J)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-ge v3, v4, :cond_16

    .line 209
    .line 210
    move v3, v4

    .line 211
    :cond_16
    :goto_8
    iget v4, p0, Lvf4;->C:F

    .line 212
    .line 213
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-nez v4, :cond_17

    .line 218
    .line 219
    invoke-static {v0, v1}, Lnc0;->i(J)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    goto :goto_9

    .line 224
    :cond_17
    invoke-static {p3, p4}, Lnc0;->i(J)I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    invoke-static {v0, v1}, Lnc0;->g(J)I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-le v4, v5, :cond_18

    .line 233
    .line 234
    move v4, v5

    .line 235
    :cond_18
    :goto_9
    iget p0, p0, Lvf4;->E:F

    .line 236
    .line 237
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_19

    .line 242
    .line 243
    invoke-static {v0, v1}, Lnc0;->g(J)I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    goto :goto_a

    .line 248
    :cond_19
    invoke-static {p3, p4}, Lnc0;->g(J)I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    invoke-static {v0, v1}, Lnc0;->i(J)I

    .line 253
    .line 254
    .line 255
    move-result p3

    .line 256
    if-ge p0, p3, :cond_1a

    .line 257
    .line 258
    move p0, p3

    .line 259
    :cond_1a
    :goto_a
    invoke-static {v2, v3, v4, p0}, Lqc0;->a(IIII)J

    .line 260
    .line 261
    .line 262
    move-result-wide p3

    .line 263
    :goto_b
    invoke-interface {p2, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    iget p2, p0, Ljg3;->n:I

    .line 268
    .line 269
    iget p3, p0, Ljg3;->o:I

    .line 270
    .line 271
    new-instance p4, Lla;

    .line 272
    .line 273
    const/4 v0, 0x5

    .line 274
    invoke-direct {p4, p0, v0}, Lla;-><init>(Ljg3;I)V

    .line 275
    .line 276
    .line 277
    sget-object p0, Lv01;->n:Lv01;

    .line 278
    .line 279
    invoke-interface {p1, p2, p3, p0, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    return-object p0
.end method
