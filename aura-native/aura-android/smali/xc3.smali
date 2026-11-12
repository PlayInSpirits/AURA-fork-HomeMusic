.class public final Lxc3;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lad3;

.field public final synthetic r:I

.field public final synthetic s:F

.field public final synthetic t:Lwd;


# direct methods
.method public constructor <init>(Lad3;IFLwd;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxc3;->q:Lad3;

    .line 2
    .line 3
    iput p2, p0, Lxc3;->r:I

    .line 4
    .line 5
    iput p3, p0, Lxc3;->s:F

    .line 6
    .line 7
    iput-object p4, p0, Lxc3;->t:Lwd;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 6

    .line 1
    new-instance v0, Lxc3;

    .line 2
    .line 3
    iget v3, p0, Lxc3;->s:F

    .line 4
    .line 5
    iget-object v4, p0, Lxc3;->t:Lwd;

    .line 6
    .line 7
    iget-object v1, p0, Lxc3;->q:Lad3;

    .line 8
    .line 9
    iget v2, p0, Lxc3;->r:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lxc3;-><init>(Lad3;IFLwd;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lxc3;->p:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq64;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxc3;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxc3;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxc3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lxc3;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lxc3;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lq64;

    .line 27
    .line 28
    new-instance v0, Lsm0;

    .line 29
    .line 30
    iget-object v3, p0, Lxc3;->q:Lad3;

    .line 31
    .line 32
    invoke-direct {v0, p1, v3}, Lsm0;-><init>(Lq64;Lad3;)V

    .line 33
    .line 34
    .line 35
    iput v2, p0, Lxc3;->o:I

    .line 36
    .line 37
    sget-object p1, Led3;->a:Ldd3;

    .line 38
    .line 39
    new-instance p1, Ljava/lang/Integer;

    .line 40
    .line 41
    iget v4, p0, Lxc3;->r:I

    .line 42
    .line 43
    invoke-direct {p1, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v3, p1}, Lad3;->j(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v5, v3, Lad3;->q:Lwd3;

    .line 55
    .line 56
    invoke-virtual {v5, p1}, Lwd3;->h(I)V

    .line 57
    .line 58
    .line 59
    iget p1, v3, Lad3;->e:I

    .line 60
    .line 61
    if-le v4, p1, :cond_2

    .line 62
    .line 63
    move p1, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    :goto_0
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v5, v5, Lqc3;->a:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v5}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lxi2;

    .line 77
    .line 78
    iget v5, v5, Lxi2;->a:I

    .line 79
    .line 80
    iget v6, v3, Lad3;->e:I

    .line 81
    .line 82
    sub-int/2addr v5, v6

    .line 83
    add-int/2addr v5, v2

    .line 84
    const/4 v6, 0x0

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v7, v7, Lqc3;->a:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v7}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lxi2;

    .line 98
    .line 99
    iget v7, v7, Lxi2;->a:I

    .line 100
    .line 101
    if-gt v4, v7, :cond_4

    .line 102
    .line 103
    :cond_3
    if-nez p1, :cond_9

    .line 104
    .line 105
    iget v7, v3, Lad3;->e:I

    .line 106
    .line 107
    if-ge v4, v7, :cond_9

    .line 108
    .line 109
    :cond_4
    iget v7, v3, Lad3;->e:I

    .line 110
    .line 111
    sub-int v7, v4, v7

    .line 112
    .line 113
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    const/4 v8, 0x3

    .line 118
    if-lt v7, v8, :cond_9

    .line 119
    .line 120
    iget v7, v3, Lad3;->e:I

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    sub-int p1, v4, v5

    .line 125
    .line 126
    if-ge p1, v7, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move v7, p1

    .line 130
    goto :goto_1

    .line 131
    :cond_6
    add-int/2addr v5, v4

    .line 132
    if-le v5, v7, :cond_7

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    move v7, v5

    .line 136
    :goto_1
    invoke-virtual {v3}, Lad3;->p()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-float p1, p1

    .line 141
    cmpg-float v5, p1, v6

    .line 142
    .line 143
    if-nez v5, :cond_8

    .line 144
    .line 145
    move p1, v6

    .line 146
    goto :goto_2

    .line 147
    :cond_8
    div-float p1, v6, p1

    .line 148
    .line 149
    :goto_2
    invoke-virtual {v3, p1, v7, v2}, Lad3;->t(FIZ)V

    .line 150
    .line 151
    .line 152
    :cond_9
    invoke-virtual {v3}, Lad3;->k()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    sub-int/2addr v4, p1

    .line 157
    invoke-virtual {v3}, Lad3;->p()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    mul-int/2addr p1, v4

    .line 162
    int-to-float p1, p1

    .line 163
    invoke-virtual {v3}, Lad3;->l()F

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-virtual {v3}, Lad3;->p()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    int-to-float v4, v4

    .line 172
    mul-float/2addr v2, v4

    .line 173
    sub-float/2addr p1, v2

    .line 174
    add-float/2addr p1, v6

    .line 175
    invoke-static {p1}, Lji2;->L(F)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-static {v3}, Le35;->t(Lad3;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v4

    .line 183
    int-to-long v6, p1

    .line 184
    add-long v8, v4, v6

    .line 185
    .line 186
    iget-wide v10, v3, Lad3;->h:J

    .line 187
    .line 188
    iget-wide v12, v3, Lad3;->g:J

    .line 189
    .line 190
    invoke-static/range {v8 .. v13}, Lgb;->n(JJJ)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    invoke-static {v3}, Le35;->t(Lad3;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    sub-long/2addr v4, v2

    .line 199
    long-to-int p1, v4

    .line 200
    int-to-float p1, p1

    .line 201
    iget v2, p0, Lxc3;->s:F

    .line 202
    .line 203
    add-float/2addr p1, v2

    .line 204
    new-instance v2, Lgx3;

    .line 205
    .line 206
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    new-instance v3, Lib;

    .line 210
    .line 211
    const/16 v4, 0x9

    .line 212
    .line 213
    invoke-direct {v3, v4, v2, v0}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x4

    .line 217
    iget-object v2, p0, Lxc3;->t:Lwd;

    .line 218
    .line 219
    invoke-static {p1, v2, v3, p0, v0}, Lj51;->f(FLwd;Lwf1;Lep4;I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    sget-object p1, Lxe0;->n:Lxe0;

    .line 224
    .line 225
    if-ne p0, p1, :cond_a

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_a
    move-object p0, v1

    .line 229
    :goto_3
    if-ne p0, p1, :cond_b

    .line 230
    .line 231
    return-object p1

    .line 232
    :cond_b
    return-object v1
.end method
