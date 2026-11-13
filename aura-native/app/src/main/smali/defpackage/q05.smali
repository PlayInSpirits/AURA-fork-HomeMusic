.class public abstract Ldefpackage/q05;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/kr;

.field public static final b:Ldefpackage/f01;

.field public static final c:Ldefpackage/o54;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/kr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/q05;->a:Ldefpackage/kr;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/f01;

    .line 9
    .line 10
    const-string v1, "NO_OWNER"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldefpackage/q05;->b:Ldefpackage/f01;

    .line 17
    .line 18
    new-instance v0, Ldefpackage/o54;

    .line 19
    .line 20
    const/16 v1, 0x11

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ldefpackage/o54;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ldefpackage/q05;->c:Ldefpackage/o54;

    .line 26
    .line 27
    return-void
.end method

.method public static final A(I)Landroid/graphics/BlendMode;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Ldefpackage/k3;->a()Landroid/graphics/BlendMode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Ldefpackage/k3;->r()Landroid/graphics/BlendMode;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const/4 v0, 0x2

    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Ldefpackage/k3;->l()Landroid/graphics/BlendMode;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_2
    const/4 v0, 0x3

    .line 25
    if-ne p0, v0, :cond_3

    .line 26
    .line 27
    invoke-static {}, Ldefpackage/k3;->k()Landroid/graphics/BlendMode;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_3
    const/4 v0, 0x4

    .line 33
    if-ne p0, v0, :cond_4

    .line 34
    .line 35
    invoke-static {}, Ldefpackage/k3;->m()Landroid/graphics/BlendMode;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_4
    const/4 v0, 0x5

    .line 41
    if-ne p0, v0, :cond_5

    .line 42
    .line 43
    invoke-static {}, Ldefpackage/k3;->n()Landroid/graphics/BlendMode;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_5
    const/4 v0, 0x6

    .line 49
    if-ne p0, v0, :cond_6

    .line 50
    .line 51
    invoke-static {}, Ldefpackage/k3;->o()Landroid/graphics/BlendMode;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_6
    const/4 v0, 0x7

    .line 57
    if-ne p0, v0, :cond_7

    .line 58
    .line 59
    invoke-static {}, Ldefpackage/k3;->p()Landroid/graphics/BlendMode;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_7
    const/16 v0, 0x8

    .line 65
    .line 66
    if-ne p0, v0, :cond_8

    .line 67
    .line 68
    invoke-static {}, Ldefpackage/k3;->q()Landroid/graphics/BlendMode;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_8
    const/16 v0, 0x9

    .line 74
    .line 75
    if-ne p0, v0, :cond_9

    .line 76
    .line 77
    invoke-static {}, Ldefpackage/k3;->t()Landroid/graphics/BlendMode;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_9
    const/16 v0, 0xa

    .line 83
    .line 84
    if-ne p0, v0, :cond_a

    .line 85
    .line 86
    invoke-static {}, Ldefpackage/k3;->i()Landroid/graphics/BlendMode;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_a
    const/16 v0, 0xb

    .line 92
    .line 93
    if-ne p0, v0, :cond_b

    .line 94
    .line 95
    invoke-static {}, Ldefpackage/k3;->u()Landroid/graphics/BlendMode;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_b
    const/16 v0, 0xc

    .line 101
    .line 102
    if-ne p0, v0, :cond_c

    .line 103
    .line 104
    invoke-static {}, Ldefpackage/k3;->v()Landroid/graphics/BlendMode;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_c
    const/16 v0, 0xd

    .line 110
    .line 111
    if-ne p0, v0, :cond_d

    .line 112
    .line 113
    invoke-static {}, Ldefpackage/z9;->d()Landroid/graphics/BlendMode;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_d
    const/16 v0, 0xe

    .line 119
    .line 120
    if-ne p0, v0, :cond_e

    .line 121
    .line 122
    invoke-static {}, Ldefpackage/z9;->z()Landroid/graphics/BlendMode;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :cond_e
    const/16 v0, 0xf

    .line 128
    .line 129
    if-ne p0, v0, :cond_f

    .line 130
    .line 131
    invoke-static {}, Ldefpackage/z9;->A()Landroid/graphics/BlendMode;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_f
    const/16 v0, 0x10

    .line 137
    .line 138
    if-ne p0, v0, :cond_10

    .line 139
    .line 140
    invoke-static {}, Ldefpackage/z9;->B()Landroid/graphics/BlendMode;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :cond_10
    const/16 v0, 0x11

    .line 146
    .line 147
    if-ne p0, v0, :cond_11

    .line 148
    .line 149
    invoke-static {}, Ldefpackage/z9;->C()Landroid/graphics/BlendMode;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_11
    const/16 v0, 0x12

    .line 155
    .line 156
    if-ne p0, v0, :cond_12

    .line 157
    .line 158
    invoke-static {}, Ldefpackage/z9;->D()Landroid/graphics/BlendMode;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :cond_12
    const/16 v0, 0x13

    .line 164
    .line 165
    if-ne p0, v0, :cond_13

    .line 166
    .line 167
    invoke-static {}, Ldefpackage/k3;->f()Landroid/graphics/BlendMode;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :cond_13
    const/16 v0, 0x14

    .line 173
    .line 174
    if-ne p0, v0, :cond_14

    .line 175
    .line 176
    invoke-static {}, Ldefpackage/k3;->w()Landroid/graphics/BlendMode;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :cond_14
    const/16 v0, 0x15

    .line 182
    .line 183
    if-ne p0, v0, :cond_15

    .line 184
    .line 185
    invoke-static {}, Ldefpackage/k3;->y()Landroid/graphics/BlendMode;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :cond_15
    const/16 v0, 0x16

    .line 191
    .line 192
    if-ne p0, v0, :cond_16

    .line 193
    .line 194
    invoke-static {}, Ldefpackage/k3;->z()Landroid/graphics/BlendMode;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :cond_16
    const/16 v0, 0x17

    .line 200
    .line 201
    if-ne p0, v0, :cond_17

    .line 202
    .line 203
    invoke-static {}, Ldefpackage/k3;->A()Landroid/graphics/BlendMode;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :cond_17
    const/16 v0, 0x18

    .line 209
    .line 210
    if-ne p0, v0, :cond_18

    .line 211
    .line 212
    invoke-static {}, Ldefpackage/k3;->B()Landroid/graphics/BlendMode;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    :cond_18
    const/16 v0, 0x19

    .line 218
    .line 219
    if-ne p0, v0, :cond_19

    .line 220
    .line 221
    invoke-static {}, Ldefpackage/k3;->C()Landroid/graphics/BlendMode;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :cond_19
    const/16 v0, 0x1a

    .line 227
    .line 228
    if-ne p0, v0, :cond_1a

    .line 229
    .line 230
    invoke-static {}, Ldefpackage/k3;->D()Landroid/graphics/BlendMode;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :cond_1a
    const/16 v0, 0x1b

    .line 236
    .line 237
    if-ne p0, v0, :cond_1b

    .line 238
    .line 239
    invoke-static {}, Ldefpackage/k3;->h()Landroid/graphics/BlendMode;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :cond_1b
    const/16 v0, 0x1c

    .line 245
    .line 246
    if-ne p0, v0, :cond_1c

    .line 247
    .line 248
    invoke-static {}, Ldefpackage/k3;->j()Landroid/graphics/BlendMode;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_1c
    invoke-static {}, Ldefpackage/k3;->k()Landroid/graphics/BlendMode;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0
.end method

.method public static final B(I)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    if-ne p0, v0, :cond_3

    .line 20
    .line 21
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    const/4 v0, 0x4

    .line 25
    if-ne p0, v0, :cond_4

    .line 26
    .line 27
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_5

    .line 32
    .line 33
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const/4 v0, 0x6

    .line 37
    if-ne p0, v0, :cond_6

    .line 38
    .line 39
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_6
    const/4 v0, 0x7

    .line 43
    if-ne p0, v0, :cond_7

    .line 44
    .line 45
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_7
    const/16 v0, 0x8

    .line 49
    .line 50
    if-ne p0, v0, :cond_8

    .line 51
    .line 52
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_8
    const/16 v0, 0x9

    .line 56
    .line 57
    if-ne p0, v0, :cond_9

    .line 58
    .line 59
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_9
    const/16 v0, 0xa

    .line 63
    .line 64
    if-ne p0, v0, :cond_a

    .line 65
    .line 66
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_a
    const/16 v0, 0xb

    .line 70
    .line 71
    if-ne p0, v0, :cond_b

    .line 72
    .line 73
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_b
    const/16 v0, 0xc

    .line 77
    .line 78
    if-ne p0, v0, :cond_c

    .line 79
    .line 80
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_c
    const/16 v0, 0xe

    .line 84
    .line 85
    if-ne p0, v0, :cond_d

    .line 86
    .line 87
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_d
    const/16 v0, 0xf

    .line 91
    .line 92
    if-ne p0, v0, :cond_e

    .line 93
    .line 94
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_e
    const/16 v0, 0x10

    .line 98
    .line 99
    if-ne p0, v0, :cond_f

    .line 100
    .line 101
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_f
    const/16 v0, 0x11

    .line 105
    .line 106
    if-ne p0, v0, :cond_10

    .line 107
    .line 108
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->LIGHTEN:Landroid/graphics/PorterDuff$Mode;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_10
    const/16 v0, 0xd

    .line 112
    .line 113
    if-ne p0, v0, :cond_11

    .line 114
    .line 115
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_11
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 119
    .line 120
    return-object p0
.end method

.method public static C(ILdefpackage/jc0;Ldefpackage/nr3;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-boolean v2, v0, Ldefpackage/jc0;->n:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    instance-of v2, v0, Ldefpackage/kc0;

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/jc0;->x()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Ldefpackage/kr;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v2, 0x3

    .line 36
    invoke-virtual {v0, v2}, Ldefpackage/jc0;->g(I)Ldefpackage/hb0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v4, 0x5

    .line 41
    invoke-virtual {v0, v4}, Ldefpackage/jc0;->g(I)Ldefpackage/hb0;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3}, Ldefpackage/hb0;->c()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {v4}, Ldefpackage/hb0;->c()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    iget-object v7, v3, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 54
    .line 55
    const/16 v9, 0x8

    .line 56
    .line 57
    if-eqz v7, :cond_d

    .line 58
    .line 59
    iget-boolean v3, v3, Ldefpackage/hb0;->c:Z

    .line 60
    .line 61
    if-eqz v3, :cond_d

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_d

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Ldefpackage/hb0;

    .line 78
    .line 79
    iget-object v12, v7, Ldefpackage/hb0;->d:Ldefpackage/jc0;

    .line 80
    .line 81
    add-int/lit8 v13, p0, 0x1

    .line 82
    .line 83
    invoke-static {v12}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    iget-object v15, v12, Ldefpackage/jc0;->I:Ldefpackage/hb0;

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    iget-object v8, v12, Ldefpackage/jc0;->K:Ldefpackage/hb0;

    .line 92
    .line 93
    invoke-virtual {v12}, Ldefpackage/jc0;->x()Z

    .line 94
    .line 95
    .line 96
    move-result v17

    .line 97
    if-eqz v17, :cond_3

    .line 98
    .line 99
    if-eqz v14, :cond_3

    .line 100
    .line 101
    new-instance v10, Ldefpackage/kr;

    .line 102
    .line 103
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v12, v1, v10}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    if-ne v7, v15, :cond_4

    .line 110
    .line 111
    iget-object v10, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 112
    .line 113
    if-eqz v10, :cond_4

    .line 114
    .line 115
    iget-boolean v10, v10, Ldefpackage/hb0;->c:Z

    .line 116
    .line 117
    if-nez v10, :cond_5

    .line 118
    .line 119
    :cond_4
    if-ne v7, v8, :cond_6

    .line 120
    .line 121
    iget-object v10, v15, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 122
    .line 123
    if-eqz v10, :cond_6

    .line 124
    .line 125
    iget-boolean v10, v10, Ldefpackage/hb0;->c:Z

    .line 126
    .line 127
    if-eqz v10, :cond_6

    .line 128
    .line 129
    :cond_5
    const/4 v10, 0x1

    .line 130
    :goto_1
    const/16 v18, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    const/4 v10, 0x0

    .line 134
    goto :goto_1

    .line 135
    :goto_2
    iget-object v11, v12, Ldefpackage/jc0;->o0:[I

    .line 136
    .line 137
    aget v11, v11, v18

    .line 138
    .line 139
    if-ne v11, v2, :cond_9

    .line 140
    .line 141
    if-eqz v14, :cond_7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    if-ne v11, v2, :cond_2

    .line 145
    .line 146
    iget v7, v12, Ldefpackage/jc0;->y:I

    .line 147
    .line 148
    if-ltz v7, :cond_2

    .line 149
    .line 150
    iget v7, v12, Ldefpackage/jc0;->x:I

    .line 151
    .line 152
    if-ltz v7, :cond_2

    .line 153
    .line 154
    iget v7, v12, Ldefpackage/jc0;->f0:I

    .line 155
    .line 156
    if-eq v7, v9, :cond_8

    .line 157
    .line 158
    iget v7, v12, Ldefpackage/jc0;->s:I

    .line 159
    .line 160
    if-nez v7, :cond_2

    .line 161
    .line 162
    iget v7, v12, Ldefpackage/jc0;->V:F

    .line 163
    .line 164
    cmpl-float v7, v7, v16

    .line 165
    .line 166
    if-nez v7, :cond_2

    .line 167
    .line 168
    :cond_8
    invoke-virtual {v12}, Ldefpackage/jc0;->w()Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-nez v7, :cond_2

    .line 173
    .line 174
    if-eqz v10, :cond_2

    .line 175
    .line 176
    invoke-virtual {v12}, Ldefpackage/jc0;->w()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-nez v7, :cond_2

    .line 181
    .line 182
    invoke-static {v13, v0, v1, v12}, Ldefpackage/q05;->y(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_9
    :goto_3
    invoke-virtual {v12}, Ldefpackage/jc0;->x()Z

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-eqz v11, :cond_a

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_a
    if-ne v7, v15, :cond_b

    .line 194
    .line 195
    iget-object v11, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 196
    .line 197
    if-nez v11, :cond_b

    .line 198
    .line 199
    invoke-virtual {v15}, Ldefpackage/hb0;->d()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    add-int/2addr v7, v5

    .line 204
    invoke-virtual {v12}, Ldefpackage/jc0;->i()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    add-int/2addr v8, v7

    .line 209
    invoke-virtual {v12, v7, v8}, Ldefpackage/jc0;->G(II)V

    .line 210
    .line 211
    .line 212
    invoke-static {v13, v12, v1}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_b
    if-ne v7, v8, :cond_c

    .line 218
    .line 219
    iget-object v7, v15, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 220
    .line 221
    if-nez v7, :cond_c

    .line 222
    .line 223
    invoke-virtual {v8}, Ldefpackage/hb0;->d()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    sub-int v7, v5, v7

    .line 228
    .line 229
    invoke-virtual {v12}, Ldefpackage/jc0;->i()I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    sub-int v8, v7, v8

    .line 234
    .line 235
    invoke-virtual {v12, v8, v7}, Ldefpackage/jc0;->G(II)V

    .line 236
    .line 237
    .line 238
    invoke-static {v13, v12, v1}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_c
    if-eqz v10, :cond_2

    .line 244
    .line 245
    invoke-virtual {v12}, Ldefpackage/jc0;->w()Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-nez v7, :cond_2

    .line 250
    .line 251
    invoke-static {v13, v12, v1}, Ldefpackage/q05;->x(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_d
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v18, 0x1

    .line 259
    .line 260
    instance-of v3, v0, Ldefpackage/pk1;

    .line 261
    .line 262
    if-eqz v3, :cond_e

    .line 263
    .line 264
    :goto_4
    return-void

    .line 265
    :cond_e
    iget-object v3, v4, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 266
    .line 267
    if-eqz v3, :cond_1a

    .line 268
    .line 269
    iget-boolean v4, v4, Ldefpackage/hb0;->c:Z

    .line 270
    .line 271
    if-eqz v4, :cond_1a

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    :cond_f
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_1a

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    check-cast v4, Ldefpackage/hb0;

    .line 288
    .line 289
    iget-object v5, v4, Ldefpackage/hb0;->d:Ldefpackage/jc0;

    .line 290
    .line 291
    add-int/lit8 v7, p0, 0x1

    .line 292
    .line 293
    invoke-static {v5}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    iget-object v10, v5, Ldefpackage/jc0;->I:Ldefpackage/hb0;

    .line 298
    .line 299
    iget-object v11, v5, Ldefpackage/jc0;->K:Ldefpackage/hb0;

    .line 300
    .line 301
    invoke-virtual {v5}, Ldefpackage/jc0;->x()Z

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    if-eqz v12, :cond_10

    .line 306
    .line 307
    if-eqz v8, :cond_10

    .line 308
    .line 309
    new-instance v12, Ldefpackage/kr;

    .line 310
    .line 311
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-static {v5, v1, v12}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 315
    .line 316
    .line 317
    :cond_10
    if-ne v4, v10, :cond_11

    .line 318
    .line 319
    iget-object v12, v11, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 320
    .line 321
    if-eqz v12, :cond_11

    .line 322
    .line 323
    iget-boolean v12, v12, Ldefpackage/hb0;->c:Z

    .line 324
    .line 325
    if-nez v12, :cond_12

    .line 326
    .line 327
    :cond_11
    if-ne v4, v11, :cond_13

    .line 328
    .line 329
    iget-object v12, v10, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 330
    .line 331
    if-eqz v12, :cond_13

    .line 332
    .line 333
    iget-boolean v12, v12, Ldefpackage/hb0;->c:Z

    .line 334
    .line 335
    if-eqz v12, :cond_13

    .line 336
    .line 337
    :cond_12
    move/from16 v12, v18

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_13
    const/4 v12, 0x0

    .line 341
    :goto_6
    iget-object v13, v5, Ldefpackage/jc0;->o0:[I

    .line 342
    .line 343
    aget v13, v13, v18

    .line 344
    .line 345
    if-ne v13, v2, :cond_16

    .line 346
    .line 347
    if-eqz v8, :cond_14

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_14
    if-ne v13, v2, :cond_f

    .line 351
    .line 352
    iget v4, v5, Ldefpackage/jc0;->y:I

    .line 353
    .line 354
    if-ltz v4, :cond_f

    .line 355
    .line 356
    iget v4, v5, Ldefpackage/jc0;->x:I

    .line 357
    .line 358
    if-ltz v4, :cond_f

    .line 359
    .line 360
    iget v4, v5, Ldefpackage/jc0;->f0:I

    .line 361
    .line 362
    if-eq v4, v9, :cond_15

    .line 363
    .line 364
    iget v4, v5, Ldefpackage/jc0;->s:I

    .line 365
    .line 366
    if-nez v4, :cond_f

    .line 367
    .line 368
    iget v4, v5, Ldefpackage/jc0;->V:F

    .line 369
    .line 370
    cmpl-float v4, v4, v16

    .line 371
    .line 372
    if-nez v4, :cond_f

    .line 373
    .line 374
    :cond_15
    invoke-virtual {v5}, Ldefpackage/jc0;->w()Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-nez v4, :cond_f

    .line 379
    .line 380
    if-eqz v12, :cond_f

    .line 381
    .line 382
    invoke-virtual {v5}, Ldefpackage/jc0;->w()Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-nez v4, :cond_f

    .line 387
    .line 388
    invoke-static {v7, v0, v1, v5}, Ldefpackage/q05;->y(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;)V

    .line 389
    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_16
    :goto_7
    invoke-virtual {v5}, Ldefpackage/jc0;->x()Z

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-eqz v8, :cond_17

    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_17
    if-ne v4, v10, :cond_18

    .line 400
    .line 401
    iget-object v8, v11, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 402
    .line 403
    if-nez v8, :cond_18

    .line 404
    .line 405
    invoke-virtual {v10}, Ldefpackage/hb0;->d()I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    add-int/2addr v4, v6

    .line 410
    invoke-virtual {v5}, Ldefpackage/jc0;->i()I

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    add-int/2addr v8, v4

    .line 415
    invoke-virtual {v5, v4, v8}, Ldefpackage/jc0;->G(II)V

    .line 416
    .line 417
    .line 418
    invoke-static {v7, v5, v1}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 419
    .line 420
    .line 421
    goto/16 :goto_5

    .line 422
    .line 423
    :cond_18
    if-ne v4, v11, :cond_19

    .line 424
    .line 425
    iget-object v4, v10, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 426
    .line 427
    if-nez v4, :cond_19

    .line 428
    .line 429
    invoke-virtual {v11}, Ldefpackage/hb0;->d()I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    sub-int v4, v6, v4

    .line 434
    .line 435
    invoke-virtual {v5}, Ldefpackage/jc0;->i()I

    .line 436
    .line 437
    .line 438
    move-result v8

    .line 439
    sub-int v8, v4, v8

    .line 440
    .line 441
    invoke-virtual {v5, v8, v4}, Ldefpackage/jc0;->G(II)V

    .line 442
    .line 443
    .line 444
    invoke-static {v7, v5, v1}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_5

    .line 448
    .line 449
    :cond_19
    if-eqz v12, :cond_f

    .line 450
    .line 451
    invoke-virtual {v5}, Ldefpackage/jc0;->w()Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-nez v4, :cond_f

    .line 456
    .line 457
    invoke-static {v7, v5, v1}, Ldefpackage/q05;->x(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_5

    .line 461
    .line 462
    :cond_1a
    const/4 v3, 0x6

    .line 463
    invoke-virtual {v0, v3}, Ldefpackage/jc0;->g(I)Ldefpackage/hb0;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    iget-object v4, v3, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 468
    .line 469
    if-eqz v4, :cond_20

    .line 470
    .line 471
    iget-boolean v4, v3, Ldefpackage/hb0;->c:Z

    .line 472
    .line 473
    if-eqz v4, :cond_20

    .line 474
    .line 475
    invoke-virtual {v3}, Ldefpackage/hb0;->c()I

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    iget-object v3, v3, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 480
    .line 481
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_20

    .line 490
    .line 491
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    check-cast v5, Ldefpackage/hb0;

    .line 496
    .line 497
    iget-object v6, v5, Ldefpackage/hb0;->d:Ldefpackage/jc0;

    .line 498
    .line 499
    add-int/lit8 v11, p0, 0x1

    .line 500
    .line 501
    invoke-static {v6}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    iget-object v8, v6, Ldefpackage/jc0;->L:Ldefpackage/hb0;

    .line 506
    .line 507
    invoke-virtual {v6}, Ldefpackage/jc0;->x()Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    if-eqz v9, :cond_1b

    .line 512
    .line 513
    if-eqz v7, :cond_1b

    .line 514
    .line 515
    new-instance v9, Ldefpackage/kr;

    .line 516
    .line 517
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-static {v6, v1, v9}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 521
    .line 522
    .line 523
    :cond_1b
    iget-object v9, v6, Ldefpackage/jc0;->o0:[I

    .line 524
    .line 525
    aget v9, v9, v18

    .line 526
    .line 527
    if-ne v9, v2, :cond_1d

    .line 528
    .line 529
    if-eqz v7, :cond_1c

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_1c
    move/from16 v5, v18

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :cond_1d
    :goto_9
    invoke-virtual {v6}, Ldefpackage/jc0;->x()Z

    .line 536
    .line 537
    .line 538
    move-result v7

    .line 539
    if-eqz v7, :cond_1e

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_1e
    if-ne v5, v8, :cond_1c

    .line 543
    .line 544
    invoke-virtual {v5}, Ldefpackage/hb0;->d()I

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    add-int/2addr v5, v4

    .line 549
    iget-boolean v7, v6, Ldefpackage/jc0;->E:Z

    .line 550
    .line 551
    if-nez v7, :cond_1f

    .line 552
    .line 553
    move/from16 v5, v18

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_1f
    iget v7, v6, Ldefpackage/jc0;->Z:I

    .line 557
    .line 558
    sub-int v7, v5, v7

    .line 559
    .line 560
    iget v9, v6, Ldefpackage/jc0;->U:I

    .line 561
    .line 562
    add-int/2addr v9, v7

    .line 563
    iput v7, v6, Ldefpackage/jc0;->Y:I

    .line 564
    .line 565
    iget-object v10, v6, Ldefpackage/jc0;->I:Ldefpackage/hb0;

    .line 566
    .line 567
    invoke-virtual {v10, v7}, Ldefpackage/hb0;->i(I)V

    .line 568
    .line 569
    .line 570
    iget-object v7, v6, Ldefpackage/jc0;->K:Ldefpackage/hb0;

    .line 571
    .line 572
    invoke-virtual {v7, v9}, Ldefpackage/hb0;->i(I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v8, v5}, Ldefpackage/hb0;->i(I)V

    .line 576
    .line 577
    .line 578
    move/from16 v5, v18

    .line 579
    .line 580
    iput-boolean v5, v6, Ldefpackage/jc0;->l:Z

    .line 581
    .line 582
    :goto_a
    invoke-static {v11, v6, v1}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 583
    .line 584
    .line 585
    :goto_b
    move/from16 v18, v5

    .line 586
    .line 587
    goto :goto_8

    .line 588
    :cond_20
    move/from16 v5, v18

    .line 589
    .line 590
    iput-boolean v5, v0, Ldefpackage/jc0;->n:Z

    .line 591
    .line 592
    return-void
.end method

.method public static final a(Ldefpackage/r70;Ldefpackage/rg1;I)V
    .locals 11

    .line 1
    const v0, -0x2a4a252b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Ldefpackage/rg1;->S(I)Ldefpackage/rg1;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, Ldefpackage/rg1;->K(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x6

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    sget-object v0, Ldefpackage/z44;->a:Ldefpackage/wl4;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ldefpackage/x44;

    .line 32
    .line 33
    const v4, 0x753e26b5

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v4}, Ldefpackage/rg1;->R(I)V

    .line 37
    .line 38
    .line 39
    new-array v4, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p1}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    sget-object v6, Ldefpackage/j80;->a:Ldefpackage/i80;

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    new-instance v5, Ldefpackage/rd2;

    .line 50
    .line 51
    invoke-direct {v5, v1}, Ldefpackage/rd2;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v5}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    check-cast v5, Ldefpackage/gf1;

    .line 58
    .line 59
    const/16 v7, 0x180

    .line 60
    .line 61
    sget-object v8, Ldefpackage/w44;->r:Ldefpackage/xc5;

    .line 62
    .line 63
    invoke-static {v4, v8, v5, p1, v7}, Ldefpackage/gh0;->z([Ljava/lang/Object;Ldefpackage/m54;Ldefpackage/gf1;Ldefpackage/rg1;I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ldefpackage/w44;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ldefpackage/x44;

    .line 74
    .line 75
    iput-object v5, v4, Ldefpackage/w44;->p:Ldefpackage/x44;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Ldefpackage/rg1;->o(Z)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v7, Ldefpackage/d60;

    .line 85
    .line 86
    const/16 v8, 0xe

    .line 87
    .line 88
    invoke-direct {v7, v8, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 89
    .line 90
    .line 91
    new-instance v8, Ldefpackage/o;

    .line 92
    .line 93
    const/16 v9, 0x10

    .line 94
    .line 95
    invoke-direct {v8, v9, v3, v4}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v9, Ldefpackage/xc5;

    .line 99
    .line 100
    const/16 v10, 0x13

    .line 101
    .line 102
    invoke-direct {v9, v10, v7, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v3}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    invoke-virtual {p1, v4}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    or-int/2addr v7, v8

    .line 114
    invoke-virtual {p1}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    if-nez v7, :cond_2

    .line 119
    .line 120
    if-ne v8, v6, :cond_3

    .line 121
    .line 122
    :cond_2
    new-instance v8, Ldefpackage/fa;

    .line 123
    .line 124
    const/16 v6, 0xc

    .line 125
    .line 126
    invoke-direct {v8, v6, v3, v4}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v8}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    check-cast v8, Ldefpackage/gf1;

    .line 133
    .line 134
    invoke-static {v5, v9, v8, p1, v2}, Ldefpackage/gh0;->z([Ljava/lang/Object;Ldefpackage/m54;Ldefpackage/gf1;Ldefpackage/rg1;I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ldefpackage/z82;

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ldefpackage/wl4;->a(Ljava/lang/Object;)Ldefpackage/rr3;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v3, Ldefpackage/ib;

    .line 145
    .line 146
    const/4 v4, 0x5

    .line 147
    invoke-direct {v3, v4, p0, v2}, Ldefpackage/ib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const v2, -0x189b31eb

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v3, p1}, Ldefpackage/fh0;->w(ILdefpackage/sf1;Ldefpackage/rg1;)Ldefpackage/r70;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/16 v3, 0x38

    .line 158
    .line 159
    invoke-static {v0, v2, p1, v3}, Ldefpackage/gi1;->a(Ldefpackage/rr3;Ldefpackage/r70;Ldefpackage/rg1;I)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-virtual {p1}, Ldefpackage/rg1;->N()V

    .line 164
    .line 165
    .line 166
    :goto_1
    invoke-virtual {p1}, Ldefpackage/rg1;->p()Ldefpackage/lv3;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_5

    .line 171
    .line 172
    new-instance v0, Ldefpackage/z;

    .line 173
    .line 174
    invoke-direct {v0, p2, v1, p0}, Ldefpackage/z;-><init>(IILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iput-object v0, p1, Ldefpackage/lv3;->d:Ldefpackage/wf1;

    .line 178
    .line 179
    :cond_5
    return-void
.end method

.method public static b(I)Ldefpackage/ac3;
    .locals 1

    .line 1
    new-instance p0, Ldefpackage/ac3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, v0}, Ldefpackage/ac3;-><init>(FF)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public static c(Ldefpackage/df;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static d(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 9

    .line 1
    invoke-static {p0, p1, p2}, Ldefpackage/q05;->e(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1, p3}, Ldefpackage/q05;->e(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_b

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    const-string v0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 17
    .line 18
    const/16 v1, 0x82

    .line 19
    .line 20
    const/16 v3, 0x21

    .line 21
    .line 22
    const/16 v4, 0x42

    .line 23
    .line 24
    const/16 v5, 0x11

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    if-eq p0, v5, :cond_4

    .line 28
    .line 29
    if-eq p0, v3, :cond_3

    .line 30
    .line 31
    if-eq p0, v4, :cond_2

    .line 32
    .line 33
    if-ne p0, v1, :cond_1

    .line 34
    .line 35
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    iget v8, p3, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    if-gt v7, v8, :cond_a

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_2
    iget v7, p1, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    iget v8, p3, Landroid/graphics/Rect;->left:I

    .line 49
    .line 50
    if-gt v7, v8, :cond_a

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    iget v7, p1, Landroid/graphics/Rect;->top:I

    .line 54
    .line 55
    iget v8, p3, Landroid/graphics/Rect;->bottom:I

    .line 56
    .line 57
    if-lt v7, v8, :cond_a

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    iget v7, p1, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    iget v8, p3, Landroid/graphics/Rect;->right:I

    .line 63
    .line 64
    if-lt v7, v8, :cond_a

    .line 65
    .line 66
    :goto_0
    if-eq p0, v5, :cond_a

    .line 67
    .line 68
    if-ne p0, v4, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    invoke-static {p0, p1, p2}, Ldefpackage/q05;->s(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eq p0, v5, :cond_9

    .line 76
    .line 77
    if-eq p0, v3, :cond_8

    .line 78
    .line 79
    if-eq p0, v4, :cond_7

    .line 80
    .line 81
    if-ne p0, v1, :cond_6

    .line 82
    .line 83
    iget p0, p3, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 86
    .line 87
    :goto_1
    sub-int/2addr p0, p1

    .line 88
    goto :goto_2

    .line 89
    :cond_6
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return v2

    .line 93
    :cond_7
    iget p0, p3, Landroid/graphics/Rect;->right:I

    .line 94
    .line 95
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_8
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_9
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 104
    .line 105
    iget p1, p3, Landroid/graphics/Rect;->left:I

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_2
    invoke-static {v6, p0}, Ljava/lang/Math;->max(II)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-ge p2, p0, :cond_b

    .line 113
    .line 114
    :cond_a
    :goto_3
    return v6

    .line 115
    :cond_b
    :goto_4
    return v2
.end method

.method public static e(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p0, v0, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x21

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x42

    .line 11
    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x82

    .line 15
    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 20
    .line 21
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    :goto_0
    iget p0, p2, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    if-lt p0, v0, :cond_3

    .line 30
    .line 31
    iget p0, p2, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 34
    .line 35
    if-gt p0, p1, :cond_3

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget p0, p2, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    if-lt p0, v0, :cond_3

    .line 43
    .line 44
    iget p0, p2, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    if-gt p0, p1, :cond_3

    .line 49
    .line 50
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_3
    return v1
.end method

.method public static final f([JJ)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-gt v1, v0, :cond_2

    .line 6
    .line 7
    add-int v2, v1, v0

    .line 8
    .line 9
    ushr-int/lit8 v2, v2, 0x1

    .line 10
    .line 11
    aget-wide v3, p0, v2

    .line 12
    .line 13
    cmp-long v3, p1, v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-gez v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v2, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v2

    .line 26
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    neg-int p0, v1

    .line 29
    return p0
.end method

.method public static g(Ldefpackage/jc0;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/jc0;->o0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget v0, v0, v3

    .line 8
    .line 9
    iget-object v4, p0, Ldefpackage/jc0;->S:Ldefpackage/jc0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    check-cast v4, Ldefpackage/kc0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v5, v4, Ldefpackage/jc0;->o0:[I

    .line 20
    .line 21
    aget v5, v5, v1

    .line 22
    .line 23
    :cond_1
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, Ldefpackage/jc0;->o0:[I

    .line 26
    .line 27
    aget v4, v4, v3

    .line 28
    .line 29
    :cond_2
    const/4 v4, 0x3

    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eq v2, v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/jc0;->y()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_5

    .line 41
    .line 42
    if-ne v2, v4, :cond_3

    .line 43
    .line 44
    iget v7, p0, Ldefpackage/jc0;->r:I

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    iget v7, p0, Ldefpackage/jc0;->V:F

    .line 49
    .line 50
    cmpl-float v7, v7, v6

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ldefpackage/jc0;->r(I)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_5

    .line 59
    .line 60
    :cond_3
    if-ne v2, v4, :cond_4

    .line 61
    .line 62
    iget v2, p0, Ldefpackage/jc0;->r:I

    .line 63
    .line 64
    if-ne v2, v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Ldefpackage/jc0;->o()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0, v1, v2}, Ldefpackage/jc0;->s(II)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v2, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    :goto_1
    move v2, v3

    .line 80
    :goto_2
    if-eq v0, v3, :cond_8

    .line 81
    .line 82
    invoke-virtual {p0}, Ldefpackage/jc0;->z()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_8

    .line 87
    .line 88
    if-eq v0, v5, :cond_8

    .line 89
    .line 90
    if-ne v0, v4, :cond_6

    .line 91
    .line 92
    iget v5, p0, Ldefpackage/jc0;->s:I

    .line 93
    .line 94
    if-nez v5, :cond_6

    .line 95
    .line 96
    iget v5, p0, Ldefpackage/jc0;->V:F

    .line 97
    .line 98
    cmpl-float v5, v5, v6

    .line 99
    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0, v3}, Ldefpackage/jc0;->r(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_8

    .line 107
    .line 108
    :cond_6
    if-ne v0, v4, :cond_7

    .line 109
    .line 110
    iget v0, p0, Ldefpackage/jc0;->s:I

    .line 111
    .line 112
    if-ne v0, v3, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0}, Ldefpackage/jc0;->i()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0, v3, v0}, Ldefpackage/jc0;->s(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move v0, v1

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    :goto_3
    move v0, v3

    .line 128
    :goto_4
    iget p0, p0, Ldefpackage/jc0;->V:F

    .line 129
    .line 130
    cmpl-float p0, p0, v6

    .line 131
    .line 132
    if-lez p0, :cond_9

    .line 133
    .line 134
    if-nez v2, :cond_a

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    if-eqz v2, :cond_b

    .line 140
    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    :cond_a
    :goto_5
    return v3

    .line 144
    :cond_b
    return v1
.end method

.method public static final h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p1, p0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public static i(Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    array-length v2, p0

    .line 17
    move v3, v0

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v5, p0, v3

    .line 22
    .line 23
    invoke-static {v5}, Ldefpackage/q05;->i(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v0

    .line 34
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v4

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    return v1
.end method

.method public static j(Ljava/util/function/Function;)Ldefpackage/b35;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/b35;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Ldefpackage/b35;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/function/Function;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-object v1

    .line 12
    :catch_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static k(Z)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ldefpackage/sb1;

    .line 3
    .line 4
    invoke-direct {v1}, Ldefpackage/sb1;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v2, "video/avc"

    .line 8
    .line 9
    invoke-static {v2}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, v1, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v2, Ldefpackage/tb1;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Ldefpackage/jk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v2}, Ldefpackage/jk2;->c(Ldefpackage/tb1;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    sget-object p0, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p0, v0, v2}, Ldefpackage/jk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, v1}, Ldefpackage/pw1;->d(Ljava/lang/Iterable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p0}, Ldefpackage/pw1;->d(Ljava/lang/Iterable;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move v1, v0

    .line 56
    :goto_1
    iget v2, p0, Ldefpackage/gy3;->q:I

    .line 57
    .line 58
    if-ge v1, v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ldefpackage/dk2;

    .line 65
    .line 66
    iget-object v2, v2, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ldefpackage/dk2;

    .line 75
    .line 76
    iget-object v2, v2, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-static {v2}, Ldefpackage/yj1;->e(Landroid/media/MediaCodecInfo$VideoCapabilities;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    invoke-static {}, Ldefpackage/ek2;->m()V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Ldefpackage/ek2;->g()Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    move v1, v0

    .line 104
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-ge v1, v3, :cond_2

    .line 109
    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3}, Ldefpackage/yj1;->c(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3, p0}, Ldefpackage/ek2;->t(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 119
    .line 120
    .line 121
    move-result v3
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    if-eqz v3, :cond_1

    .line 123
    .line 124
    const/4 p0, 0x2

    .line 125
    return p0

    .line 126
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    const/4 p0, 0x1

    .line 130
    return p0

    .line 131
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :catch_0
    :cond_4
    return v0
.end method

.method public static l(Ldefpackage/kc1;)Ldefpackage/v23;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v1, v0, Landroidx/navigation/fragment/NavHostFragment;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroidx/navigation/fragment/NavHostFragment;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/navigation/fragment/NavHostFragment;->h0()Ldefpackage/v23;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Ldefpackage/ld1;->y:Ldefpackage/kc1;

    .line 23
    .line 24
    instance-of v2, v1, Landroidx/navigation/fragment/NavHostFragment;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v1, Landroidx/navigation/fragment/NavHostFragment;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/navigation/fragment/NavHostFragment;->h0()Ldefpackage/v23;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    iget-object v0, v0, Ldefpackage/kc1;->I:Ldefpackage/kc1;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v0, p0, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-static {v0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_3
    instance-of v0, p0, Ldefpackage/pp0;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    move-object v0, p0

    .line 53
    check-cast v0, Ldefpackage/pp0;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v0, v1

    .line 57
    :goto_1
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object v0, v0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_2

    .line 74
    :cond_5
    move-object v0, v1

    .line 75
    :goto_2
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-static {v0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_6
    const-string v0, "Fragment "

    .line 83
    .line 84
    const-string v2, " does not have a NavController set"

    .line 85
    .line 86
    invoke-static {v0, p0, v2}, Ldefpackage/b11;->l(Ljava/lang/String;Ldefpackage/kc1;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object v1
.end method

.method public static final m(Ldefpackage/dd5;)Ldefpackage/rc5;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/rc5;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/dd5;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget p0, p0, Ldefpackage/dd5;->t:I

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Ldefpackage/rc5;-><init>(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static final n(III)I
    .locals 1

    .line 1
    if-lez p2, :cond_4

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    rem-int v0, p1, p2

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    add-int/2addr v0, p2

    .line 12
    :goto_0
    rem-int/2addr p0, p2

    .line 13
    if-ltz p0, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    add-int/2addr p0, p2

    .line 17
    :goto_1
    sub-int/2addr v0, p0

    .line 18
    rem-int/2addr v0, p2

    .line 19
    if-ltz v0, :cond_3

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_3
    add-int/2addr v0, p2

    .line 23
    :goto_2
    sub-int/2addr p1, v0

    .line 24
    return p1

    .line 25
    :cond_4
    if-gez p2, :cond_9

    .line 26
    .line 27
    if-gt p0, p1, :cond_5

    .line 28
    .line 29
    :goto_3
    return p1

    .line 30
    :cond_5
    neg-int p2, p2

    .line 31
    rem-int/2addr p0, p2

    .line 32
    if-ltz p0, :cond_6

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_6
    add-int/2addr p0, p2

    .line 36
    :goto_4
    rem-int v0, p1, p2

    .line 37
    .line 38
    if-ltz v0, :cond_7

    .line 39
    .line 40
    goto :goto_5

    .line 41
    :cond_7
    add-int/2addr v0, p2

    .line 42
    :goto_5
    sub-int/2addr p0, v0

    .line 43
    rem-int/2addr p0, p2

    .line 44
    if-ltz p0, :cond_8

    .line 45
    .line 46
    goto :goto_6

    .line 47
    :cond_8
    add-int/2addr p0, p2

    .line 48
    :goto_6
    add-int/2addr p0, p1

    .line 49
    return p0

    .line 50
    :cond_9
    const-string p0, "Step is zero."

    .line 51
    .line 52
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return p0
.end method

.method public static final o(Ldefpackage/ne0;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/re0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldefpackage/qe0;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p0, p1}, Ldefpackage/qe0;->n(Ldefpackage/ne0;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lkotlinx/coroutines/internal/ExceptionSuccessfullyProcessed; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    return-void

    .line 51
    :cond_1
    :try_start_1
    new-instance v0, Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;-><init>(Ldefpackage/ne0;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-boolean v3, v0, Ldefpackage/jc0;->m:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    instance-of v3, v0, Ldefpackage/kc0;

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/jc0;->x()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    new-instance v3, Ldefpackage/kr;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v3}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v3, 0x2

    .line 38
    invoke-virtual {v0, v3}, Ldefpackage/jc0;->g(I)Ldefpackage/hb0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const/4 v4, 0x4

    .line 43
    invoke-virtual {v0, v4}, Ldefpackage/jc0;->g(I)Ldefpackage/hb0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3}, Ldefpackage/hb0;->c()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v4}, Ldefpackage/hb0;->c()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    iget-object v7, v3, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 56
    .line 57
    const/4 v10, 0x3

    .line 58
    if-eqz v7, :cond_d

    .line 59
    .line 60
    iget-boolean v3, v3, Ldefpackage/hb0;->c:Z

    .line 61
    .line 62
    if-eqz v3, :cond_d

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_d

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Ldefpackage/hb0;

    .line 79
    .line 80
    iget-object v13, v7, Ldefpackage/hb0;->d:Ldefpackage/jc0;

    .line 81
    .line 82
    add-int/lit8 v14, p0, 0x1

    .line 83
    .line 84
    invoke-static {v13}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    iget-object v8, v13, Ldefpackage/jc0;->H:Ldefpackage/hb0;

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    iget-object v11, v13, Ldefpackage/jc0;->J:Ldefpackage/hb0;

    .line 95
    .line 96
    invoke-virtual {v13}, Ldefpackage/jc0;->x()Z

    .line 97
    .line 98
    .line 99
    move-result v18

    .line 100
    if-eqz v18, :cond_3

    .line 101
    .line 102
    if-eqz v15, :cond_3

    .line 103
    .line 104
    const/16 v18, 0x1

    .line 105
    .line 106
    new-instance v12, Ldefpackage/kr;

    .line 107
    .line 108
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v13, v1, v12}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    const/16 v18, 0x1

    .line 116
    .line 117
    :goto_1
    if-ne v7, v8, :cond_4

    .line 118
    .line 119
    iget-object v12, v11, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 120
    .line 121
    if-eqz v12, :cond_4

    .line 122
    .line 123
    iget-boolean v12, v12, Ldefpackage/hb0;->c:Z

    .line 124
    .line 125
    if-nez v12, :cond_5

    .line 126
    .line 127
    :cond_4
    if-ne v7, v11, :cond_6

    .line 128
    .line 129
    iget-object v12, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 130
    .line 131
    if-eqz v12, :cond_6

    .line 132
    .line 133
    iget-boolean v12, v12, Ldefpackage/hb0;->c:Z

    .line 134
    .line 135
    if-eqz v12, :cond_6

    .line 136
    .line 137
    :cond_5
    move/from16 v12, v18

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    move/from16 v12, v17

    .line 141
    .line 142
    :goto_2
    iget-object v9, v13, Ldefpackage/jc0;->o0:[I

    .line 143
    .line 144
    aget v9, v9, v17

    .line 145
    .line 146
    if-ne v9, v10, :cond_9

    .line 147
    .line 148
    if-eqz v15, :cond_7

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    if-ne v9, v10, :cond_2

    .line 152
    .line 153
    iget v7, v13, Ldefpackage/jc0;->v:I

    .line 154
    .line 155
    if-ltz v7, :cond_2

    .line 156
    .line 157
    iget v7, v13, Ldefpackage/jc0;->u:I

    .line 158
    .line 159
    if-ltz v7, :cond_2

    .line 160
    .line 161
    iget v7, v13, Ldefpackage/jc0;->f0:I

    .line 162
    .line 163
    const/16 v8, 0x8

    .line 164
    .line 165
    if-eq v7, v8, :cond_8

    .line 166
    .line 167
    iget v7, v13, Ldefpackage/jc0;->r:I

    .line 168
    .line 169
    if-nez v7, :cond_2

    .line 170
    .line 171
    iget v7, v13, Ldefpackage/jc0;->V:F

    .line 172
    .line 173
    cmpl-float v7, v7, v16

    .line 174
    .line 175
    if-nez v7, :cond_2

    .line 176
    .line 177
    :cond_8
    invoke-virtual {v13}, Ldefpackage/jc0;->v()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_2

    .line 182
    .line 183
    if-eqz v12, :cond_2

    .line 184
    .line 185
    invoke-virtual {v13}, Ldefpackage/jc0;->v()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-nez v7, :cond_2

    .line 190
    .line 191
    invoke-static {v14, v0, v1, v13, v2}, Ldefpackage/q05;->w(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;Z)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_9
    :goto_3
    invoke-virtual {v13}, Ldefpackage/jc0;->x()Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_a

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_a
    if-ne v7, v8, :cond_b

    .line 204
    .line 205
    iget-object v9, v11, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 206
    .line 207
    if-nez v9, :cond_b

    .line 208
    .line 209
    invoke-virtual {v8}, Ldefpackage/hb0;->d()I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    add-int/2addr v7, v5

    .line 214
    invoke-virtual {v13}, Ldefpackage/jc0;->o()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    add-int/2addr v8, v7

    .line 219
    invoke-virtual {v13, v7, v8}, Ldefpackage/jc0;->F(II)V

    .line 220
    .line 221
    .line 222
    invoke-static {v14, v13, v1, v2}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_b
    if-ne v7, v11, :cond_c

    .line 228
    .line 229
    iget-object v7, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 230
    .line 231
    if-nez v7, :cond_c

    .line 232
    .line 233
    invoke-virtual {v11}, Ldefpackage/hb0;->d()I

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    sub-int v7, v5, v7

    .line 238
    .line 239
    invoke-virtual {v13}, Ldefpackage/jc0;->o()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    sub-int v8, v7, v8

    .line 244
    .line 245
    invoke-virtual {v13, v8, v7}, Ldefpackage/jc0;->F(II)V

    .line 246
    .line 247
    .line 248
    invoke-static {v14, v13, v1, v2}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_c
    if-eqz v12, :cond_2

    .line 254
    .line 255
    invoke-virtual {v13}, Ldefpackage/jc0;->v()Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-nez v7, :cond_2

    .line 260
    .line 261
    invoke-static {v14, v13, v1, v2}, Ldefpackage/q05;->v(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_d
    const/16 v16, 0x0

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const/16 v18, 0x1

    .line 271
    .line 272
    instance-of v3, v0, Ldefpackage/pk1;

    .line 273
    .line 274
    if-eqz v3, :cond_e

    .line 275
    .line 276
    :goto_4
    return-void

    .line 277
    :cond_e
    iget-object v3, v4, Ldefpackage/hb0;->a:Ljava/util/HashSet;

    .line 278
    .line 279
    if-eqz v3, :cond_1b

    .line 280
    .line 281
    iget-boolean v4, v4, Ldefpackage/hb0;->c:Z

    .line 282
    .line 283
    if-eqz v4, :cond_1b

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    :cond_f
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_1b

    .line 294
    .line 295
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    check-cast v4, Ldefpackage/hb0;

    .line 300
    .line 301
    iget-object v5, v4, Ldefpackage/hb0;->d:Ldefpackage/jc0;

    .line 302
    .line 303
    add-int/lit8 v12, p0, 0x1

    .line 304
    .line 305
    invoke-static {v5}, Ldefpackage/q05;->g(Ldefpackage/jc0;)Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    iget-object v8, v5, Ldefpackage/jc0;->H:Ldefpackage/hb0;

    .line 310
    .line 311
    iget-object v9, v5, Ldefpackage/jc0;->J:Ldefpackage/hb0;

    .line 312
    .line 313
    invoke-virtual {v5}, Ldefpackage/jc0;->x()Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-eqz v11, :cond_10

    .line 318
    .line 319
    if-eqz v7, :cond_10

    .line 320
    .line 321
    new-instance v11, Ldefpackage/kr;

    .line 322
    .line 323
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-static {v5, v1, v11}, Ldefpackage/kc0;->R(Ldefpackage/jc0;Ldefpackage/nr3;Ldefpackage/kr;)V

    .line 327
    .line 328
    .line 329
    :cond_10
    if-ne v4, v8, :cond_11

    .line 330
    .line 331
    iget-object v11, v9, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 332
    .line 333
    if-eqz v11, :cond_11

    .line 334
    .line 335
    iget-boolean v11, v11, Ldefpackage/hb0;->c:Z

    .line 336
    .line 337
    if-nez v11, :cond_12

    .line 338
    .line 339
    :cond_11
    if-ne v4, v9, :cond_13

    .line 340
    .line 341
    iget-object v11, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 342
    .line 343
    if-eqz v11, :cond_13

    .line 344
    .line 345
    iget-boolean v11, v11, Ldefpackage/hb0;->c:Z

    .line 346
    .line 347
    if-eqz v11, :cond_13

    .line 348
    .line 349
    :cond_12
    move/from16 v11, v18

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_13
    move/from16 v11, v17

    .line 353
    .line 354
    :goto_6
    iget-object v13, v5, Ldefpackage/jc0;->o0:[I

    .line 355
    .line 356
    aget v13, v13, v17

    .line 357
    .line 358
    if-ne v13, v10, :cond_14

    .line 359
    .line 360
    if-eqz v7, :cond_15

    .line 361
    .line 362
    :cond_14
    const/16 v7, 0x8

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_15
    if-ne v13, v10, :cond_17

    .line 366
    .line 367
    iget v4, v5, Ldefpackage/jc0;->v:I

    .line 368
    .line 369
    if-ltz v4, :cond_17

    .line 370
    .line 371
    iget v4, v5, Ldefpackage/jc0;->u:I

    .line 372
    .line 373
    if-ltz v4, :cond_17

    .line 374
    .line 375
    iget v4, v5, Ldefpackage/jc0;->f0:I

    .line 376
    .line 377
    const/16 v7, 0x8

    .line 378
    .line 379
    if-eq v4, v7, :cond_16

    .line 380
    .line 381
    iget v4, v5, Ldefpackage/jc0;->r:I

    .line 382
    .line 383
    if-nez v4, :cond_f

    .line 384
    .line 385
    iget v4, v5, Ldefpackage/jc0;->V:F

    .line 386
    .line 387
    cmpl-float v4, v4, v16

    .line 388
    .line 389
    if-nez v4, :cond_f

    .line 390
    .line 391
    :cond_16
    invoke-virtual {v5}, Ldefpackage/jc0;->v()Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    if-nez v4, :cond_f

    .line 396
    .line 397
    if-eqz v11, :cond_f

    .line 398
    .line 399
    invoke-virtual {v5}, Ldefpackage/jc0;->v()Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-nez v4, :cond_f

    .line 404
    .line 405
    invoke-static {v12, v0, v1, v5, v2}, Ldefpackage/q05;->w(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;Z)V

    .line 406
    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_17
    const/16 v7, 0x8

    .line 410
    .line 411
    goto :goto_5

    .line 412
    :goto_7
    invoke-virtual {v5}, Ldefpackage/jc0;->x()Z

    .line 413
    .line 414
    .line 415
    move-result v13

    .line 416
    if-eqz v13, :cond_18

    .line 417
    .line 418
    goto/16 :goto_5

    .line 419
    .line 420
    :cond_18
    if-ne v4, v8, :cond_19

    .line 421
    .line 422
    iget-object v13, v9, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 423
    .line 424
    if-nez v13, :cond_19

    .line 425
    .line 426
    invoke-virtual {v8}, Ldefpackage/hb0;->d()I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    add-int/2addr v4, v6

    .line 431
    invoke-virtual {v5}, Ldefpackage/jc0;->o()I

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    add-int/2addr v8, v4

    .line 436
    invoke-virtual {v5, v4, v8}, Ldefpackage/jc0;->F(II)V

    .line 437
    .line 438
    .line 439
    invoke-static {v12, v5, v1, v2}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_5

    .line 443
    .line 444
    :cond_19
    if-ne v4, v9, :cond_1a

    .line 445
    .line 446
    iget-object v4, v8, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 447
    .line 448
    if-nez v4, :cond_1a

    .line 449
    .line 450
    invoke-virtual {v9}, Ldefpackage/hb0;->d()I

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    sub-int v4, v6, v4

    .line 455
    .line 456
    invoke-virtual {v5}, Ldefpackage/jc0;->o()I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    sub-int v8, v4, v8

    .line 461
    .line 462
    invoke-virtual {v5, v8, v4}, Ldefpackage/jc0;->F(II)V

    .line 463
    .line 464
    .line 465
    invoke-static {v12, v5, v1, v2}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_5

    .line 469
    .line 470
    :cond_1a
    if-eqz v11, :cond_f

    .line 471
    .line 472
    invoke-virtual {v5}, Ldefpackage/jc0;->v()Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-nez v4, :cond_f

    .line 477
    .line 478
    invoke-static {v12, v5, v1, v2}, Ldefpackage/q05;->v(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_5

    .line 482
    .line 483
    :cond_1b
    move/from16 v1, v18

    .line 484
    .line 485
    iput-boolean v1, v0, Ldefpackage/jc0;->m:Z

    .line 486
    .line 487
    return-void
.end method

.method public static final q([F[F)Z
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x10

    .line 8
    .line 9
    if-lt v2, v4, :cond_0

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ge v2, v4, :cond_1

    .line 13
    .line 14
    :cond_0
    move/from16 v19, v3

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_1
    aget v2, v0, v3

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    aget v5, v0, v4

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    aget v7, v0, v6

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    aget v9, v0, v8

    .line 28
    .line 29
    const/4 v10, 0x4

    .line 30
    aget v11, v0, v10

    .line 31
    .line 32
    const/4 v12, 0x5

    .line 33
    aget v13, v0, v12

    .line 34
    .line 35
    const/4 v14, 0x6

    .line 36
    aget v15, v0, v14

    .line 37
    .line 38
    const/16 v16, 0x7

    .line 39
    .line 40
    aget v17, v0, v16

    .line 41
    .line 42
    const/16 v18, 0x8

    .line 43
    .line 44
    move/from16 v19, v3

    .line 45
    .line 46
    aget v3, v0, v18

    .line 47
    .line 48
    const/16 v20, 0x9

    .line 49
    .line 50
    move/from16 v21, v4

    .line 51
    .line 52
    aget v4, v0, v20

    .line 53
    .line 54
    const/16 v22, 0xa

    .line 55
    .line 56
    aget v23, v0, v22

    .line 57
    .line 58
    const/16 v24, 0xb

    .line 59
    .line 60
    aget v25, v0, v24

    .line 61
    .line 62
    const/16 v26, 0xc

    .line 63
    .line 64
    move/from16 v27, v6

    .line 65
    .line 66
    aget v6, v0, v26

    .line 67
    .line 68
    const/16 v28, 0xd

    .line 69
    .line 70
    aget v29, v0, v28

    .line 71
    .line 72
    const/16 v30, 0xe

    .line 73
    .line 74
    aget v31, v0, v30

    .line 75
    .line 76
    const/16 v32, 0xf

    .line 77
    .line 78
    aget v0, v0, v32

    .line 79
    .line 80
    mul-float v33, v2, v13

    .line 81
    .line 82
    mul-float v34, v5, v11

    .line 83
    .line 84
    sub-float v33, v33, v34

    .line 85
    .line 86
    mul-float v34, v2, v15

    .line 87
    .line 88
    mul-float v35, v7, v11

    .line 89
    .line 90
    sub-float v34, v34, v35

    .line 91
    .line 92
    mul-float v35, v2, v17

    .line 93
    .line 94
    mul-float v36, v9, v11

    .line 95
    .line 96
    sub-float v35, v35, v36

    .line 97
    .line 98
    mul-float v36, v5, v15

    .line 99
    .line 100
    mul-float v37, v7, v13

    .line 101
    .line 102
    sub-float v36, v36, v37

    .line 103
    .line 104
    mul-float v37, v5, v17

    .line 105
    .line 106
    mul-float v38, v9, v13

    .line 107
    .line 108
    sub-float v37, v37, v38

    .line 109
    .line 110
    mul-float v38, v7, v17

    .line 111
    .line 112
    mul-float v39, v9, v15

    .line 113
    .line 114
    sub-float v38, v38, v39

    .line 115
    .line 116
    mul-float v39, v3, v29

    .line 117
    .line 118
    mul-float v40, v4, v6

    .line 119
    .line 120
    sub-float v39, v39, v40

    .line 121
    .line 122
    mul-float v40, v3, v31

    .line 123
    .line 124
    mul-float v41, v23, v6

    .line 125
    .line 126
    sub-float v40, v40, v41

    .line 127
    .line 128
    mul-float v41, v3, v0

    .line 129
    .line 130
    mul-float v42, v25, v6

    .line 131
    .line 132
    sub-float v41, v41, v42

    .line 133
    .line 134
    mul-float v42, v4, v31

    .line 135
    .line 136
    mul-float v43, v23, v29

    .line 137
    .line 138
    sub-float v42, v42, v43

    .line 139
    .line 140
    mul-float v43, v4, v0

    .line 141
    .line 142
    mul-float v44, v25, v29

    .line 143
    .line 144
    sub-float v43, v43, v44

    .line 145
    .line 146
    mul-float v44, v23, v0

    .line 147
    .line 148
    mul-float v45, v25, v31

    .line 149
    .line 150
    sub-float v44, v44, v45

    .line 151
    .line 152
    mul-float v45, v33, v44

    .line 153
    .line 154
    mul-float v46, v34, v43

    .line 155
    .line 156
    sub-float v45, v45, v46

    .line 157
    .line 158
    mul-float v46, v35, v42

    .line 159
    .line 160
    add-float v46, v46, v45

    .line 161
    .line 162
    mul-float v45, v36, v41

    .line 163
    .line 164
    add-float v45, v45, v46

    .line 165
    .line 166
    mul-float v46, v37, v40

    .line 167
    .line 168
    sub-float v45, v45, v46

    .line 169
    .line 170
    mul-float v46, v38, v39

    .line 171
    .line 172
    add-float v46, v46, v45

    .line 173
    .line 174
    const/16 v45, 0x0

    .line 175
    .line 176
    cmpg-float v45, v46, v45

    .line 177
    .line 178
    if-nez v45, :cond_2

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_2
    const/high16 v47, 0x3f800000    # 1.0f

    .line 183
    .line 184
    div-float v47, v47, v46

    .line 185
    .line 186
    mul-float v46, v13, v44

    .line 187
    .line 188
    mul-float v48, v15, v43

    .line 189
    .line 190
    sub-float v46, v46, v48

    .line 191
    .line 192
    mul-float v48, v17, v42

    .line 193
    .line 194
    add-float v48, v48, v46

    .line 195
    .line 196
    mul-float v48, v48, v47

    .line 197
    .line 198
    aput v48, v1, v19

    .line 199
    .line 200
    move/from16 v46, v8

    .line 201
    .line 202
    neg-float v8, v5

    .line 203
    mul-float v8, v8, v44

    .line 204
    .line 205
    mul-float v48, v7, v43

    .line 206
    .line 207
    add-float v48, v48, v8

    .line 208
    .line 209
    mul-float v8, v9, v42

    .line 210
    .line 211
    sub-float v48, v48, v8

    .line 212
    .line 213
    mul-float v48, v48, v47

    .line 214
    .line 215
    aput v48, v1, v21

    .line 216
    .line 217
    mul-float v8, v29, v38

    .line 218
    .line 219
    mul-float v48, v31, v37

    .line 220
    .line 221
    sub-float v8, v8, v48

    .line 222
    .line 223
    mul-float v48, v0, v36

    .line 224
    .line 225
    add-float v48, v48, v8

    .line 226
    .line 227
    mul-float v48, v48, v47

    .line 228
    .line 229
    aput v48, v1, v27

    .line 230
    .line 231
    neg-float v8, v4

    .line 232
    mul-float v8, v8, v38

    .line 233
    .line 234
    mul-float v27, v23, v37

    .line 235
    .line 236
    add-float v27, v27, v8

    .line 237
    .line 238
    mul-float v8, v25, v36

    .line 239
    .line 240
    sub-float v27, v27, v8

    .line 241
    .line 242
    mul-float v27, v27, v47

    .line 243
    .line 244
    aput v27, v1, v46

    .line 245
    .line 246
    neg-float v8, v11

    .line 247
    mul-float v27, v8, v44

    .line 248
    .line 249
    mul-float v46, v15, v41

    .line 250
    .line 251
    add-float v46, v46, v27

    .line 252
    .line 253
    mul-float v27, v17, v40

    .line 254
    .line 255
    sub-float v46, v46, v27

    .line 256
    .line 257
    mul-float v46, v46, v47

    .line 258
    .line 259
    aput v46, v1, v10

    .line 260
    .line 261
    mul-float v44, v44, v2

    .line 262
    .line 263
    mul-float v10, v7, v41

    .line 264
    .line 265
    sub-float v44, v44, v10

    .line 266
    .line 267
    mul-float v10, v9, v40

    .line 268
    .line 269
    add-float v10, v10, v44

    .line 270
    .line 271
    mul-float v10, v10, v47

    .line 272
    .line 273
    aput v10, v1, v12

    .line 274
    .line 275
    neg-float v10, v6

    .line 276
    mul-float v12, v10, v38

    .line 277
    .line 278
    mul-float v27, v31, v35

    .line 279
    .line 280
    add-float v27, v27, v12

    .line 281
    .line 282
    mul-float v12, v0, v34

    .line 283
    .line 284
    sub-float v27, v27, v12

    .line 285
    .line 286
    mul-float v27, v27, v47

    .line 287
    .line 288
    aput v27, v1, v14

    .line 289
    .line 290
    mul-float v38, v38, v3

    .line 291
    .line 292
    mul-float v12, v23, v35

    .line 293
    .line 294
    sub-float v38, v38, v12

    .line 295
    .line 296
    mul-float v12, v25, v34

    .line 297
    .line 298
    add-float v12, v12, v38

    .line 299
    .line 300
    mul-float v12, v12, v47

    .line 301
    .line 302
    aput v12, v1, v16

    .line 303
    .line 304
    mul-float v11, v11, v43

    .line 305
    .line 306
    mul-float v12, v13, v41

    .line 307
    .line 308
    sub-float/2addr v11, v12

    .line 309
    mul-float v17, v17, v39

    .line 310
    .line 311
    add-float v17, v17, v11

    .line 312
    .line 313
    mul-float v17, v17, v47

    .line 314
    .line 315
    aput v17, v1, v18

    .line 316
    .line 317
    neg-float v11, v2

    .line 318
    mul-float v11, v11, v43

    .line 319
    .line 320
    mul-float v41, v41, v5

    .line 321
    .line 322
    add-float v41, v41, v11

    .line 323
    .line 324
    mul-float v9, v9, v39

    .line 325
    .line 326
    sub-float v41, v41, v9

    .line 327
    .line 328
    mul-float v41, v41, v47

    .line 329
    .line 330
    aput v41, v1, v20

    .line 331
    .line 332
    mul-float v6, v6, v37

    .line 333
    .line 334
    mul-float v9, v29, v35

    .line 335
    .line 336
    sub-float/2addr v6, v9

    .line 337
    mul-float v0, v0, v33

    .line 338
    .line 339
    add-float/2addr v0, v6

    .line 340
    mul-float v0, v0, v47

    .line 341
    .line 342
    aput v0, v1, v22

    .line 343
    .line 344
    neg-float v0, v3

    .line 345
    mul-float v0, v0, v37

    .line 346
    .line 347
    mul-float v35, v35, v4

    .line 348
    .line 349
    add-float v35, v35, v0

    .line 350
    .line 351
    mul-float v25, v25, v33

    .line 352
    .line 353
    sub-float v35, v35, v25

    .line 354
    .line 355
    mul-float v35, v35, v47

    .line 356
    .line 357
    aput v35, v1, v24

    .line 358
    .line 359
    mul-float v8, v8, v42

    .line 360
    .line 361
    mul-float v13, v13, v40

    .line 362
    .line 363
    add-float/2addr v13, v8

    .line 364
    mul-float v15, v15, v39

    .line 365
    .line 366
    sub-float/2addr v13, v15

    .line 367
    mul-float v13, v13, v47

    .line 368
    .line 369
    aput v13, v1, v26

    .line 370
    .line 371
    mul-float v2, v2, v42

    .line 372
    .line 373
    mul-float v5, v5, v40

    .line 374
    .line 375
    sub-float/2addr v2, v5

    .line 376
    mul-float v7, v7, v39

    .line 377
    .line 378
    add-float/2addr v7, v2

    .line 379
    mul-float v7, v7, v47

    .line 380
    .line 381
    aput v7, v1, v28

    .line 382
    .line 383
    mul-float v10, v10, v36

    .line 384
    .line 385
    mul-float v29, v29, v34

    .line 386
    .line 387
    add-float v29, v29, v10

    .line 388
    .line 389
    mul-float v31, v31, v33

    .line 390
    .line 391
    sub-float v29, v29, v31

    .line 392
    .line 393
    mul-float v29, v29, v47

    .line 394
    .line 395
    aput v29, v1, v30

    .line 396
    .line 397
    mul-float v3, v3, v36

    .line 398
    .line 399
    mul-float v4, v4, v34

    .line 400
    .line 401
    sub-float/2addr v3, v4

    .line 402
    mul-float v23, v23, v33

    .line 403
    .line 404
    add-float v23, v23, v3

    .line 405
    .line 406
    mul-float v23, v23, v47

    .line 407
    .line 408
    aput v23, v1, v32

    .line 409
    .line 410
    :goto_0
    if-nez v45, :cond_3

    .line 411
    .line 412
    move/from16 v3, v21

    .line 413
    .line 414
    goto :goto_1

    .line 415
    :cond_3
    move/from16 v3, v19

    .line 416
    .line 417
    :goto_1
    xor-int/lit8 v0, v3, 0x1

    .line 418
    .line 419
    return v0

    .line 420
    :goto_2
    return v19
.end method

.method public static r(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p0, v0, :cond_6

    .line 5
    .line 6
    const/16 v0, 0x21

    .line 7
    .line 8
    if-eq p0, v0, :cond_4

    .line 9
    .line 10
    const/16 v0, 0x42

    .line 11
    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x82

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 21
    .line 22
    if-lt p0, v0, :cond_0

    .line 23
    .line 24
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    if-gt p0, v0, :cond_8

    .line 27
    .line 28
    :cond_0
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 29
    .line 30
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 31
    .line 32
    if-ge p0, p1, :cond_8

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string p0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 36
    .line 37
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 44
    .line 45
    if-lt p0, v0, :cond_3

    .line 46
    .line 47
    iget p0, p1, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    if-gt p0, v0, :cond_8

    .line 50
    .line 51
    :cond_3
    iget p0, p1, Landroid/graphics/Rect;->right:I

    .line 52
    .line 53
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 54
    .line 55
    if-ge p0, p1, :cond_8

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 59
    .line 60
    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 61
    .line 62
    if-gt p0, v0, :cond_5

    .line 63
    .line 64
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 65
    .line 66
    if-lt p0, v0, :cond_8

    .line 67
    .line 68
    :cond_5
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 69
    .line 70
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 71
    .line 72
    if-le p0, p1, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_6
    iget p0, p1, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    iget v0, p2, Landroid/graphics/Rect;->right:I

    .line 78
    .line 79
    if-gt p0, v0, :cond_7

    .line 80
    .line 81
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    if-lt p0, v0, :cond_8

    .line 84
    .line 85
    :cond_7
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 86
    .line 87
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    if-le p0, p1, :cond_8

    .line 90
    .line 91
    :goto_0
    const/4 p0, 0x1

    .line 92
    return p0

    .line 93
    :cond_8
    return v1
.end method

.method public static s(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p0, v0, :cond_3

    .line 5
    .line 6
    const/16 v0, 0x21

    .line 7
    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/16 v0, 0x42

    .line 11
    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x82

    .line 15
    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    iget p0, p2, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 21
    .line 22
    :goto_0
    sub-int/2addr p0, p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-string p0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 25
    .line 26
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    iget p0, p2, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :goto_1
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public static t(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    if-eq p0, v0, :cond_2

    .line 4
    .line 5
    const/16 v0, 0x21

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x42

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x82

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    div-int/lit8 p1, p1, 0x2

    .line 32
    .line 33
    add-int/2addr p1, p0

    .line 34
    iget p0, p2, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    div-int/lit8 p2, p2, 0x2

    .line 41
    .line 42
    add-int/2addr p2, p0

    .line 43
    sub-int/2addr p1, p2

    .line 44
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    div-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    add-int/2addr p1, p0

    .line 58
    iget p0, p2, Landroid/graphics/Rect;->top:I

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    div-int/lit8 p2, p2, 0x2

    .line 65
    .line 66
    add-int/2addr p2, p0

    .line 67
    sub-int/2addr p1, p2

    .line 68
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method public static final u(Landroid/view/ViewGroup;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 13
    .line 14
    const/high16 v1, 0x41c00000    # 24.0f

    .line 15
    .line 16
    mul-float/2addr v1, v0

    .line 17
    invoke-static {v1}, Ldefpackage/ji2;->L(F)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    move v3, v2

    .line 27
    :goto_0
    if-ge v3, v1, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    instance-of v5, v4, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v4, Landroid/widget/TextView;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 v4, 0x0

    .line 41
    :goto_1
    if-nez v4, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    aget-object v6, v5, v2

    .line 52
    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {v6, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawableTintList()Landroid/content/res/ColorStateList;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    if-eqz v7, :cond_3

    .line 70
    .line 71
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    const/4 v7, 0x1

    .line 75
    aget-object v7, v5, v7

    .line 76
    .line 77
    const/4 v8, 0x2

    .line 78
    aget-object v8, v5, v8

    .line 79
    .line 80
    const/4 v9, 0x3

    .line 81
    aget-object v5, v5, v9

    .line 82
    .line 83
    invoke-virtual {v4, v6, v7, v8, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return-void
.end method

.method public static v(ILdefpackage/jc0;Ldefpackage/nr3;Z)V
    .locals 6

    .line 1
    iget v0, p1, Ldefpackage/jc0;->c0:F

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/jc0;->H:Ldefpackage/hb0;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/hb0;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, Ldefpackage/jc0;->J:Ldefpackage/hb0;

    .line 12
    .line 13
    iget-object v4, v3, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 14
    .line 15
    invoke-virtual {v4}, Ldefpackage/hb0;->c()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Ldefpackage/hb0;->d()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Ldefpackage/hb0;->d()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p1}, Ldefpackage/jc0;->o()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int/2addr v0, v2

    .line 61
    add-int v3, v0, v1

    .line 62
    .line 63
    if-le v2, v4, :cond_3

    .line 64
    .line 65
    sub-int v3, v0, v1

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p1, v0, v3}, Ldefpackage/jc0;->F(II)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    invoke-static {p0, p1, p2, p3}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static w(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;Z)V
    .locals 7

    .line 1
    iget v0, p3, Ldefpackage/jc0;->c0:F

    .line 2
    .line 3
    iget-object v1, p3, Ldefpackage/jc0;->H:Ldefpackage/hb0;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/hb0;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Ldefpackage/hb0;->d()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Ldefpackage/jc0;->J:Ldefpackage/hb0;

    .line 17
    .line 18
    iget-object v3, v2, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 19
    .line 20
    invoke-virtual {v3}, Ldefpackage/hb0;->c()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Ldefpackage/hb0;->d()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Ldefpackage/jc0;->o()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Ldefpackage/jc0;->f0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Ldefpackage/jc0;->r:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, Ldefpackage/kc0;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Ldefpackage/jc0;->o()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Ldefpackage/jc0;->S:Ldefpackage/jc0;

    .line 58
    .line 59
    invoke-virtual {p1}, Ldefpackage/jc0;->o()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    iget v2, p3, Ldefpackage/jc0;->c0:F

    .line 64
    .line 65
    mul-float/2addr v2, v6

    .line 66
    int-to-float p1, p1

    .line 67
    mul-float/2addr v2, p1

    .line 68
    float-to-int v2, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    sub-int v2, v3, v1

    .line 73
    .line 74
    :cond_2
    :goto_1
    iget p1, p3, Ldefpackage/jc0;->u:I

    .line 75
    .line 76
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget p1, p3, Ldefpackage/jc0;->v:I

    .line 81
    .line 82
    if-lez p1, :cond_3

    .line 83
    .line 84
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :cond_3
    sub-int/2addr v3, v1

    .line 89
    sub-int/2addr v3, v2

    .line 90
    int-to-float p1, v3

    .line 91
    mul-float/2addr v0, p1

    .line 92
    add-float/2addr v0, v6

    .line 93
    float-to-int p1, v0

    .line 94
    add-int/2addr v1, p1

    .line 95
    add-int/2addr v2, v1

    .line 96
    invoke-virtual {p3, v1, v2}, Ldefpackage/jc0;->F(II)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 p0, p0, 0x1

    .line 100
    .line 101
    invoke-static {p0, p3, p2, p4}, Ldefpackage/q05;->p(ILdefpackage/jc0;Ldefpackage/nr3;Z)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public static x(ILdefpackage/jc0;Ldefpackage/nr3;)V
    .locals 6

    .line 1
    iget v0, p1, Ldefpackage/jc0;->d0:F

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/jc0;->I:Ldefpackage/hb0;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/hb0;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, Ldefpackage/jc0;->K:Ldefpackage/hb0;

    .line 12
    .line 13
    iget-object v4, v3, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 14
    .line 15
    invoke-virtual {v4}, Ldefpackage/hb0;->c()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Ldefpackage/hb0;->d()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Ldefpackage/hb0;->d()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p1}, Ldefpackage/jc0;->i()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int v3, v2, v0

    .line 61
    .line 62
    add-int v5, v3, v1

    .line 63
    .line 64
    if-le v2, v4, :cond_3

    .line 65
    .line 66
    sub-int v3, v2, v0

    .line 67
    .line 68
    sub-int v5, v3, v1

    .line 69
    .line 70
    :cond_3
    invoke-virtual {p1, v3, v5}, Ldefpackage/jc0;->G(II)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p0, p0, 0x1

    .line 74
    .line 75
    invoke-static {p0, p1, p2}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static y(ILdefpackage/jc0;Ldefpackage/nr3;Ldefpackage/jc0;)V
    .locals 7

    .line 1
    iget v0, p3, Ldefpackage/jc0;->d0:F

    .line 2
    .line 3
    iget-object v1, p3, Ldefpackage/jc0;->I:Ldefpackage/hb0;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/hb0;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Ldefpackage/hb0;->d()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Ldefpackage/jc0;->K:Ldefpackage/hb0;

    .line 17
    .line 18
    iget-object v3, v2, Ldefpackage/hb0;->f:Ldefpackage/hb0;

    .line 19
    .line 20
    invoke-virtual {v3}, Ldefpackage/hb0;->c()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Ldefpackage/hb0;->d()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Ldefpackage/jc0;->i()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Ldefpackage/jc0;->f0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Ldefpackage/jc0;->s:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, Ldefpackage/kc0;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Ldefpackage/jc0;->i()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Ldefpackage/jc0;->S:Ldefpackage/jc0;

    .line 58
    .line 59
    invoke-virtual {p1}, Ldefpackage/jc0;->i()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    mul-float v2, v0, v6

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    mul-float/2addr v2, p1

    .line 67
    float-to-int v2, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    if-nez v4, :cond_2

    .line 70
    .line 71
    sub-int v2, v3, v1

    .line 72
    .line 73
    :cond_2
    :goto_1
    iget p1, p3, Ldefpackage/jc0;->x:I

    .line 74
    .line 75
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget p1, p3, Ldefpackage/jc0;->y:I

    .line 80
    .line 81
    if-lez p1, :cond_3

    .line 82
    .line 83
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :cond_3
    sub-int/2addr v3, v1

    .line 88
    sub-int/2addr v3, v2

    .line 89
    int-to-float p1, v3

    .line 90
    mul-float/2addr v0, p1

    .line 91
    add-float/2addr v0, v6

    .line 92
    float-to-int p1, v0

    .line 93
    add-int/2addr v1, p1

    .line 94
    add-int/2addr v2, v1

    .line 95
    invoke-virtual {p3, v1, v2}, Ldefpackage/jc0;->G(II)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 p0, p0, 0x1

    .line 99
    .line 100
    invoke-static {p0, p3, p2}, Ldefpackage/q05;->C(ILdefpackage/jc0;Ldefpackage/nr3;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void
.end method

.method public static final z(JJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-float/2addr v2, v1

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v3

    .line 24
    long-to-int p0, p0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-long p1, p2, v3

    .line 30
    .line 31
    long-to-int p1, p1

    .line 32
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    mul-float/2addr p1, p0

    .line 37
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long p2, p0

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long p0, p0

    .line 47
    shl-long/2addr p2, v0

    .line 48
    and-long/2addr p0, v3

    .line 49
    or-long/2addr p0, p2

    .line 50
    return-wide p0
.end method
