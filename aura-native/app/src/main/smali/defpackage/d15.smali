.class public final Ldefpackage/d15;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/bi;


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:Ljava/util/ArrayList;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/c72;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/d15;->n:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/d15;->o:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldefpackage/c72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/c72;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ldefpackage/c72;->A(ILdefpackage/c72;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/d15;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object p0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/c72;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, "onReuse is only expected on attached node"

    .line 14
    .line 15
    invoke-static {v1}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Ldefpackage/c72;->S:Ldefpackage/o72;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ldefpackage/o72;->i(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iput-boolean v2, p0, Ldefpackage/c72;->F:Z

    .line 27
    .line 28
    iget-boolean v1, p0, Ldefpackage/c72;->Z:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iput-boolean v2, p0, Ldefpackage/c72;->Z:Z

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    iget-object v1, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 36
    .line 37
    iget-object v1, v1, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ldefpackage/sq4;

    .line 40
    .line 41
    move-object v3, v1

    .line 42
    :goto_0
    if-eqz v3, :cond_4

    .line 43
    .line 44
    iget-boolean v4, v3, Ldefpackage/cx2;->A:Z

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3}, Ldefpackage/cx2;->l0()V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v3, v3, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    move-object v3, v1

    .line 55
    :goto_1
    if-eqz v3, :cond_6

    .line 56
    .line 57
    iget-boolean v4, v3, Ldefpackage/cx2;->A:Z

    .line 58
    .line 59
    if-eqz v4, :cond_5

    .line 60
    .line 61
    invoke-virtual {v3}, Ldefpackage/cx2;->n0()V

    .line 62
    .line 63
    .line 64
    :cond_5
    iget-object v3, v3, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_6
    :goto_2
    if-eqz v1, :cond_8

    .line 68
    .line 69
    iget-boolean v3, v1, Ldefpackage/cx2;->A:Z

    .line 70
    .line 71
    if-eqz v3, :cond_7

    .line 72
    .line 73
    invoke-virtual {v1}, Ldefpackage/cx2;->h0()V

    .line 74
    .line 75
    .line 76
    :cond_7
    iget-object v1, v1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_8
    :goto_3
    iget v1, p0, Ldefpackage/c72;->o:I

    .line 80
    .line 81
    iget-object v3, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 82
    .line 83
    if-eqz v3, :cond_9

    .line 84
    .line 85
    check-cast v3, Ldefpackage/ra;

    .line 86
    .line 87
    invoke-virtual {v3}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_9

    .line 92
    .line 93
    invoke-virtual {v3, p0}, Ldefpackage/yv3;->i(Ldefpackage/c72;)V

    .line 94
    .line 95
    .line 96
    :cond_9
    sget-object v3, Ldefpackage/f94;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    iput v3, p0, Ldefpackage/c72;->o:I

    .line 104
    .line 105
    iget-object v3, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 106
    .line 107
    if-eqz v3, :cond_a

    .line 108
    .line 109
    check-cast v3, Ldefpackage/ra;

    .line 110
    .line 111
    invoke-virtual {v3}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5, v1}, Ldefpackage/i03;->g(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget v5, p0, Ldefpackage/c72;->o:I

    .line 123
    .line 124
    invoke-virtual {v3, v5, p0}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    iget-object v3, v0, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, Ldefpackage/cx2;

    .line 130
    .line 131
    :goto_4
    if-eqz v3, :cond_b

    .line 132
    .line 133
    invoke-virtual {v3}, Ldefpackage/cx2;->g0()V

    .line 134
    .line 135
    .line 136
    iget-object v3, v3, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_b
    invoke-virtual {v0}, Ldefpackage/w12;->e()V

    .line 140
    .line 141
    .line 142
    const/16 v3, 0x8

    .line 143
    .line 144
    invoke-virtual {v0, v3}, Ldefpackage/w12;->d(I)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_c

    .line 149
    .line 150
    invoke-virtual {p0}, Ldefpackage/c72;->E()V

    .line 151
    .line 152
    .line 153
    :cond_c
    invoke-static {p0}, Ldefpackage/c72;->X(Ldefpackage/c72;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 157
    .line 158
    if-eqz v0, :cond_e

    .line 159
    .line 160
    check-cast v0, Ldefpackage/ra;

    .line 161
    .line 162
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_e

    .line 167
    .line 168
    invoke-virtual {v0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-eqz v0, :cond_e

    .line 173
    .line 174
    iget-object v3, v0, Ldefpackage/y9;->p:Ldefpackage/ra;

    .line 175
    .line 176
    iget-object v5, v0, Ldefpackage/y9;->n:Ldefpackage/qr2;

    .line 177
    .line 178
    iget-object v0, v0, Ldefpackage/y9;->t:Ldefpackage/j03;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ldefpackage/j03;->f(I)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-eqz v6, :cond_d

    .line 185
    .line 186
    invoke-virtual {v5, v3, v1, v2}, Ldefpackage/qr2;->p(Landroid/view/View;IZ)V

    .line 187
    .line 188
    .line 189
    :cond_d
    invoke-virtual {p0}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-eqz v1, :cond_e

    .line 194
    .line 195
    iget-object v1, v1, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 196
    .line 197
    sget-object v2, Ldefpackage/n94;->q:Ldefpackage/p94;

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-ne v1, v4, :cond_e

    .line 204
    .line 205
    iget v1, p0, Ldefpackage/c72;->o:I

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ldefpackage/j03;->a(I)Z

    .line 208
    .line 209
    .line 210
    iget v0, p0, Ldefpackage/c72;->o:I

    .line 211
    .line 212
    invoke-virtual {v5, v3, v0, v4}, Ldefpackage/qr2;->p(Landroid/view/View;IZ)V

    .line 213
    .line 214
    .line 215
    :cond_e
    iget-object v0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 216
    .line 217
    if-eqz v0, :cond_f

    .line 218
    .line 219
    check-cast v0, Ldefpackage/ra;

    .line 220
    .line 221
    invoke-virtual {v0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-eqz v0, :cond_f

    .line 226
    .line 227
    invoke-virtual {v0, p0}, Ldefpackage/yv3;->h(Ldefpackage/c72;)V

    .line 228
    .line 229
    .line 230
    :cond_f
    return-void
.end method

.method public final d(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/c72;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/c72;->K(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/c72;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ldefpackage/c72;->R(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/d15;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/d15;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/d15;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/c72;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/c72;->Q()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/d15;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public final bridge synthetic h(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldefpackage/c72;

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/d15;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/c72;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p0, Ldefpackage/ra;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/ra;->s()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/d15;->p:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
