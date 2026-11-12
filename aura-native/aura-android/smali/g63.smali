.class public abstract Lg63;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lp03;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lr73;->a:Lp03;

    .line 2
    .line 3
    new-instance v0, Lp03;

    .line 4
    .line 5
    invoke-direct {v0}, Lp03;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg63;->a:Lp03;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lcx2;II)V
    .locals 3

    .line 1
    instance-of v0, p0, Lfo0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lfo0;

    .line 7
    .line 8
    iget v1, v0, Lfo0;->B:I

    .line 9
    .line 10
    and-int v2, v1, p1

    .line 11
    .line 12
    invoke-static {p0, v2, p2}, Lg63;->b(Lcx2;II)V

    .line 13
    .line 14
    .line 15
    not-int p0, v1

    .line 16
    and-int/2addr p0, p1

    .line 17
    iget-object p1, v0, Lfo0;->C:Lcx2;

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p1, p0, p2}, Lg63;->a(Lcx2;II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lcx2;->s:Lcx2;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    iget v0, p0, Lcx2;->p:I

    .line 29
    .line 30
    and-int/2addr p1, v0

    .line 31
    invoke-static {p0, p1, p2}, Lg63;->b(Lcx2;II)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final b(Lcx2;II)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcx2;->f0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v0, p0, Lu62;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Lu62;

    .line 22
    .line 23
    invoke-static {v0}, Lg12;->A(Lu62;)V

    .line 24
    .line 25
    .line 26
    if-ne p2, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v1}, Lj51;->M(Leo0;I)Lf63;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lf63;->O0()V

    .line 33
    .line 34
    .line 35
    :cond_1
    and-int/lit16 v0, p1, 0x80

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eq p2, v1, :cond_2

    .line 40
    .line 41
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lc72;->D()V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/high16 v0, 0x400000

    .line 49
    .line 50
    and-int/2addr v0, p1

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    if-eq p2, v1, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, v2}, Lc72;->V(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3
    and-int/lit16 v0, p1, 0x100

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    if-eqz v0, :cond_8

    .line 67
    .line 68
    instance-of v0, p0, Lvi1;

    .line 69
    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    if-eq p2, v2, :cond_5

    .line 73
    .line 74
    if-eq p2, v1, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v3, v0, Lc72;->Y:I

    .line 82
    .line 83
    add-int/lit8 v3, v3, -0x1

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lc72;->b0(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v3, v0, Lc72;->Y:I

    .line 94
    .line 95
    add-int/2addr v3, v2

    .line 96
    invoke-virtual {v0, v3}, Lc72;->b0(I)V

    .line 97
    .line 98
    .line 99
    :goto_0
    if-eq p2, v1, :cond_8

    .line 100
    .line 101
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget v3, v0, Lc72;->Y:I

    .line 106
    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    invoke-virtual {v0}, Lc72;->p()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_8

    .line 114
    .line 115
    invoke-virtual {v0}, Lc72;->q()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_8

    .line 120
    .line 121
    iget-boolean v3, v0, Lc72;->X:Z

    .line 122
    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    check-cast v3, Lra;

    .line 131
    .line 132
    iget-object v4, v3, Lra;->f0:Lri2;

    .line 133
    .line 134
    iget-object v4, v4, Lri2;->e:Lrm3;

    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget v5, v0, Lc72;->Y:I

    .line 140
    .line 141
    if-lez v5, :cond_7

    .line 142
    .line 143
    iget-object v4, v4, Lrm3;->n:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Lf13;

    .line 146
    .line 147
    invoke-virtual {v4, v0}, Lf13;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-boolean v2, v0, Lc72;->X:Z

    .line 151
    .line 152
    :cond_7
    const/4 v0, 0x0

    .line 153
    invoke-virtual {v3, v0}, Lra;->D(Lc72;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_1
    and-int/lit8 v0, p1, 0x4

    .line 157
    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    instance-of v0, p0, Lrv0;

    .line 161
    .line 162
    if-eqz v0, :cond_9

    .line 163
    .line 164
    move-object v0, p0

    .line 165
    check-cast v0, Lrv0;

    .line 166
    .line 167
    invoke-static {v0}, Ljz4;->z(Lrv0;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    and-int/lit8 v0, p1, 0x8

    .line 171
    .line 172
    if-eqz v0, :cond_a

    .line 173
    .line 174
    instance-of v0, p0, Lg94;

    .line 175
    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iput-boolean v2, v0, Lc72;->D:Z

    .line 183
    .line 184
    :cond_a
    and-int/lit8 v0, p1, 0x40

    .line 185
    .line 186
    if-eqz v0, :cond_b

    .line 187
    .line 188
    instance-of v0, p0, Lxo;

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    move-object v0, p0

    .line 193
    check-cast v0, Lxo;

    .line 194
    .line 195
    invoke-static {v0}, Lj51;->O(Leo0;)Lc72;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 200
    .line 201
    iget-object v0, v0, Lf72;->p:Lti2;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    :cond_b
    and-int/lit16 v0, p1, 0x800

    .line 207
    .line 208
    if-eqz v0, :cond_d

    .line 209
    .line 210
    instance-of v0, p0, Lxo;

    .line 211
    .line 212
    if-nez v0, :cond_c

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_c
    check-cast p0, Lxo;

    .line 216
    .line 217
    iget-object p0, p0, Lxo;->B:Lbx2;

    .line 218
    .line 219
    const-string p1, "applyFocusProperties called on wrong node"

    .line 220
    .line 221
    invoke-static {p1}, Lcz1;->b(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {}, Lkf2;->k()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_d
    :goto_2
    and-int/lit16 v0, p1, 0x1000

    .line 232
    .line 233
    if-eqz v0, :cond_e

    .line 234
    .line 235
    instance-of v0, p0, Lxo;

    .line 236
    .line 237
    if-eqz v0, :cond_e

    .line 238
    .line 239
    move-object v0, p0

    .line 240
    check-cast v0, Lxo;

    .line 241
    .line 242
    invoke-static {v0}, Lj51;->P(Leo0;)Lub3;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v2, Lra;

    .line 247
    .line 248
    invoke-virtual {v2}, Lra;->getFocusOwner()Lu91;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ley;

    .line 253
    .line 254
    iget-object v2, v2, Ley;->d:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Ls91;

    .line 257
    .line 258
    iget-object v3, v2, Ls91;->d:Lx03;

    .line 259
    .line 260
    invoke-virtual {v3, v0}, Lx03;->a(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_e

    .line 265
    .line 266
    invoke-virtual {v2}, Ls91;->a()V

    .line 267
    .line 268
    .line 269
    :cond_e
    const/high16 v0, 0x200000

    .line 270
    .line 271
    and-int/2addr p1, v0

    .line 272
    if-eqz p1, :cond_f

    .line 273
    .line 274
    instance-of p1, p0, Lmy1;

    .line 275
    .line 276
    if-eqz p1, :cond_f

    .line 277
    .line 278
    if-ne p2, v1, :cond_f

    .line 279
    .line 280
    check-cast p0, Lmy1;

    .line 281
    .line 282
    invoke-interface {p0}, Lmy1;->N()V

    .line 283
    .line 284
    .line 285
    :cond_f
    :goto_3
    return-void
.end method

.method public static final c(Lcx2;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lg63;->a(Lcx2;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final d(Lcx2;)I
    .locals 4

    .line 1
    iget v0, p0, Lcx2;->p:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lg63;->a:Lp03;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lp03;->d(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ltz v2, :cond_1

    .line 17
    .line 18
    iget-object p0, v1, Lp03;->c:[I

    .line 19
    .line 20
    aget p0, p0, v2

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    instance-of v2, p0, Lu62;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x1

    .line 30
    :goto_0
    instance-of v3, p0, Lrv0;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    or-int/lit8 v2, v2, 0x4

    .line 35
    .line 36
    :cond_3
    instance-of v3, p0, Lg94;

    .line 37
    .line 38
    if-eqz v3, :cond_4

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    :cond_4
    instance-of v3, p0, Lrn3;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x10

    .line 47
    .line 48
    :cond_5
    instance-of v3, p0, Lfx2;

    .line 49
    .line 50
    if-eqz v3, :cond_6

    .line 51
    .line 52
    or-int/lit8 v2, v2, 0x20

    .line 53
    .line 54
    :cond_6
    instance-of v3, p0, Lxo;

    .line 55
    .line 56
    if-eqz v3, :cond_7

    .line 57
    .line 58
    or-int/lit8 v2, v2, 0x40

    .line 59
    .line 60
    :cond_7
    instance-of v3, p0, Lo62;

    .line 61
    .line 62
    if-eqz v3, :cond_8

    .line 63
    .line 64
    const v3, 0x400080

    .line 65
    .line 66
    .line 67
    or-int/2addr v2, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_8
    instance-of v3, p0, Lyi2;

    .line 70
    .line 71
    if-eqz v3, :cond_9

    .line 72
    .line 73
    or-int/lit16 v2, v2, 0x80

    .line 74
    .line 75
    :cond_9
    :goto_1
    instance-of v3, p0, Lvi1;

    .line 76
    .line 77
    if-eqz v3, :cond_a

    .line 78
    .line 79
    or-int/lit16 v2, v2, 0x100

    .line 80
    .line 81
    :cond_a
    instance-of v3, p0, Lba1;

    .line 82
    .line 83
    if-eqz v3, :cond_b

    .line 84
    .line 85
    or-int/lit16 v2, v2, 0x400

    .line 86
    .line 87
    :cond_b
    instance-of v3, p0, Lxo;

    .line 88
    .line 89
    if-eqz v3, :cond_c

    .line 90
    .line 91
    or-int/lit16 v2, v2, 0x800

    .line 92
    .line 93
    :cond_c
    if-eqz v3, :cond_d

    .line 94
    .line 95
    or-int/lit16 v2, v2, 0x1000

    .line 96
    .line 97
    :cond_d
    instance-of v3, p0, Lj42;

    .line 98
    .line 99
    if-eqz v3, :cond_e

    .line 100
    .line 101
    or-int/lit16 v2, v2, 0x2000

    .line 102
    .line 103
    :cond_e
    instance-of v3, p0, Lma;

    .line 104
    .line 105
    if-eqz v3, :cond_f

    .line 106
    .line 107
    or-int/lit16 v2, v2, 0x4000

    .line 108
    .line 109
    :cond_f
    instance-of v3, p0, La90;

    .line 110
    .line 111
    if-eqz v3, :cond_10

    .line 112
    .line 113
    const v3, 0x8000

    .line 114
    .line 115
    .line 116
    or-int/2addr v2, v3

    .line 117
    :cond_10
    instance-of v3, p0, Lrx4;

    .line 118
    .line 119
    if-eqz v3, :cond_11

    .line 120
    .line 121
    const/high16 v3, 0x40000

    .line 122
    .line 123
    or-int/2addr v2, v3

    .line 124
    :cond_11
    instance-of v3, p0, Lzu;

    .line 125
    .line 126
    if-eqz v3, :cond_12

    .line 127
    .line 128
    const/high16 v3, 0x80000

    .line 129
    .line 130
    or-int/2addr v2, v3

    .line 131
    :cond_12
    instance-of v3, p0, Lba1;

    .line 132
    .line 133
    if-eqz v3, :cond_13

    .line 134
    .line 135
    const/high16 v3, 0x100000

    .line 136
    .line 137
    or-int/2addr v2, v3

    .line 138
    :cond_13
    instance-of v3, p0, Lmy1;

    .line 139
    .line 140
    if-eqz v3, :cond_14

    .line 141
    .line 142
    const/high16 v3, 0x200000

    .line 143
    .line 144
    or-int/2addr v2, v3

    .line 145
    :cond_14
    instance-of p0, p0, Lz72;

    .line 146
    .line 147
    if-eqz p0, :cond_15

    .line 148
    .line 149
    const/high16 p0, 0x800000

    .line 150
    .line 151
    or-int/2addr v2, p0

    .line 152
    :cond_15
    invoke-virtual {v1, v2, v0}, Lp03;->g(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return v2
.end method

.method public static final e(Lcx2;)I
    .locals 2

    .line 1
    instance-of v0, p0, Lfo0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lfo0;

    .line 6
    .line 7
    iget v0, p0, Lfo0;->B:I

    .line 8
    .line 9
    iget-object p0, p0, Lfo0;->C:Lcx2;

    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lg63;->e(Lcx2;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v0

    .line 22
    :cond_1
    invoke-static {p0}, Lg63;->d(Lcx2;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static final f(I)Z
    .locals 4

    .line 1
    and-int/lit16 v0, p0, 0x80

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/high16 v3, 0x400000

    .line 11
    .line 12
    and-int/2addr p0, v3

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_1
    or-int p0, v0, v1

    .line 17
    .line 18
    return p0
.end method
