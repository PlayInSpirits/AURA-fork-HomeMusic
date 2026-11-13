.class public final synthetic Ldefpackage/gc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/gc3;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/gc3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/gc3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/gc3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ldefpackage/gc3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/gc3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/text/Spannable;

    .line 13
    .line 14
    check-cast v3, Ldefpackage/lc;

    .line 15
    .line 16
    check-cast p1, Ldefpackage/ij4;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    check-cast p3, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    new-instance v0, Ldefpackage/ka1;

    .line 31
    .line 32
    iget-object v4, p1, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    .line 33
    .line 34
    iget-object v5, p1, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    sget-object v5, Ldefpackage/gb1;->p:Ldefpackage/gb1;

    .line 39
    .line 40
    :cond_0
    iget-object v6, p1, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    iget v2, v6, Ldefpackage/eb1;->a:I

    .line 45
    .line 46
    :cond_1
    iget-object p1, p1, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget p1, p1, Ldefpackage/fb1;->a:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const p1, 0xffff

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object v3, v3, Ldefpackage/lc;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ldefpackage/mc;

    .line 59
    .line 60
    iget-object v6, v3, Ldefpackage/mc;->r:Ldefpackage/ha1;

    .line 61
    .line 62
    check-cast v6, Ldefpackage/ia1;

    .line 63
    .line 64
    invoke-virtual {v6, v4, v5, v2, p1}, Ldefpackage/ia1;->b(Ldefpackage/vk0;Ldefpackage/gb1;II)Ldefpackage/n05;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    instance-of v2, p1, Ldefpackage/n05;

    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    new-instance v2, Ldefpackage/z05;

    .line 73
    .line 74
    iget-object v4, v3, Ldefpackage/mc;->w:Ldefpackage/z05;

    .line 75
    .line 76
    invoke-direct {v2, p1, v4}, Ldefpackage/z05;-><init>(Ldefpackage/n05;Ldefpackage/z05;)V

    .line 77
    .line 78
    .line 79
    iput-object v2, v3, Ldefpackage/mc;->w:Ldefpackage/z05;

    .line 80
    .line 81
    iget-object p1, v2, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast p1, Landroid/graphics/Typeface;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    iget-object p1, p1, Ldefpackage/n05;->n:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    check-cast p1, Landroid/graphics/Typeface;

    .line 95
    .line 96
    :goto_1
    invoke-direct {v0, v1, p1}, Ldefpackage/ka1;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const/16 p1, 0x21

    .line 100
    .line 101
    invoke-interface {p0, v0, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_0
    check-cast p0, Ldefpackage/lm0;

    .line 108
    .line 109
    check-cast v3, Ldefpackage/r62;

    .line 110
    .line 111
    check-cast p1, Ljava/lang/Float;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    check-cast p2, Ljava/lang/Float;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    check-cast p3, Ljava/lang/Float;

    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    invoke-static {p0, p1}, Ldefpackage/xl;->A(Ldefpackage/ad3;F)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Ldefpackage/ad3;->m()Ldefpackage/qc3;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iget-object v4, v4, Ldefpackage/qc3;->e:Ldefpackage/hb3;

    .line 138
    .line 139
    sget-object v5, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 140
    .line 141
    if-ne v4, v5, :cond_4

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    sget-object v4, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 145
    .line 146
    if-ne v3, v4, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    if-nez v0, :cond_6

    .line 150
    .line 151
    move v0, v1

    .line 152
    goto :goto_2

    .line 153
    :cond_6
    move v0, v2

    .line 154
    :goto_2
    invoke-virtual {p0}, Ldefpackage/ad3;->m()Ldefpackage/qc3;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget v3, v3, Ldefpackage/qc3;->b:I

    .line 159
    .line 160
    const/4 v4, 0x0

    .line 161
    if-nez v3, :cond_7

    .line 162
    .line 163
    move v5, v4

    .line 164
    goto :goto_3

    .line 165
    :cond_7
    invoke-static {p0}, Ldefpackage/xl;->k(Ldefpackage/ad3;)F

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    int-to-float v3, v3

    .line 170
    div-float/2addr v5, v3

    .line 171
    :goto_3
    float-to-int v3, v5

    .line 172
    int-to-float v3, v3

    .line 173
    sub-float v3, v5, v3

    .line 174
    .line 175
    iget-object v6, p0, Ldefpackage/ad3;->n:Ldefpackage/oo0;

    .line 176
    .line 177
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    const/high16 v8, 0x43c80000    # 400.0f

    .line 182
    .line 183
    invoke-interface {v6, v8}, Ldefpackage/oo0;->M(F)F

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    cmpg-float v6, v7, v6

    .line 188
    .line 189
    const/4 v7, 0x2

    .line 190
    if-gez v6, :cond_8

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_8
    cmpl-float p1, p1, v4

    .line 194
    .line 195
    if-lez p1, :cond_9

    .line 196
    .line 197
    move v2, v1

    .line 198
    goto :goto_4

    .line 199
    :cond_9
    move v2, v7

    .line 200
    :goto_4
    if-nez v2, :cond_c

    .line 201
    .line 202
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    const/high16 v1, 0x3f000000    # 0.5f

    .line 207
    .line 208
    cmpl-float p1, p1, v1

    .line 209
    .line 210
    if-lez p1, :cond_a

    .line 211
    .line 212
    if-eqz v0, :cond_10

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_a
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    iget-object v1, p0, Ldefpackage/ad3;->n:Ldefpackage/oo0;

    .line 220
    .line 221
    sget-object v2, Ldefpackage/ed3;->a:Ldefpackage/dd3;

    .line 222
    .line 223
    const/high16 v2, 0x42600000    # 56.0f

    .line 224
    .line 225
    invoke-interface {v1, v2}, Ldefpackage/oo0;->M(F)F

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {p0}, Ldefpackage/ad3;->o()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    int-to-float v2, v2

    .line 234
    const/high16 v3, 0x40000000    # 2.0f

    .line 235
    .line 236
    div-float/2addr v2, v3

    .line 237
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-virtual {p0}, Ldefpackage/ad3;->o()I

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    int-to-float p0, p0

    .line 246
    div-float/2addr v1, p0

    .line 247
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    cmpl-float p0, p1, p0

    .line 252
    .line 253
    if-ltz p0, :cond_b

    .line 254
    .line 255
    if-eqz v0, :cond_d

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_b
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    cmpg-float p0, p0, p1

    .line 267
    .line 268
    if-gez p0, :cond_d

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    if-ne v2, v1, :cond_e

    .line 272
    .line 273
    :cond_d
    :goto_5
    move p2, p3

    .line 274
    goto :goto_6

    .line 275
    :cond_e
    if-ne v2, v7, :cond_f

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_f
    move p2, v4

    .line 279
    :cond_10
    :goto_6
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    return-object p0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
