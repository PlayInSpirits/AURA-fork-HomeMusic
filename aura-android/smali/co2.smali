.class public final Lco2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Ljava/lang/Integer;

.field public C:Ljava/lang/Integer;

.field public D:Ljava/lang/CharSequence;

.field public E:Ljava/lang/CharSequence;

.field public F:Ljava/lang/CharSequence;

.field public G:Ljava/lang/Integer;

.field public H:Landroid/os/Bundle;

.field public I:Lyw1;

.field public a:Ljava/lang/CharSequence;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:Ljava/lang/CharSequence;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/CharSequence;

.field public h:Ljava/lang/Long;

.field public i:Llu3;

.field public j:Llu3;

.field public k:[B

.field public l:Ljava/lang/Integer;

.field public m:Landroid/net/Uri;

.field public n:Ljava/lang/Integer;

.field public o:Ljava/lang/Integer;

.field public p:Ljava/lang/Integer;

.field public q:Ljava/lang/Boolean;

.field public r:Ljava/lang/Boolean;

.field public s:Ljava/lang/Integer;

.field public t:Ljava/lang/Integer;

.field public u:Ljava/lang/Integer;

.field public v:Ljava/lang/Integer;

.field public w:Ljava/lang/Integer;

.field public x:Ljava/lang/Integer;

.field public y:Ljava/lang/CharSequence;

.field public z:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyw1;->o:Lvw1;

    .line 5
    .line 6
    sget-object v0, Lgy3;->r:Lgy3;

    .line 7
    .line 8
    iput-object v0, p0, Lco2;->I:Lyw1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I[B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco2;->k:[B

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lco2;->l:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, [B

    .line 27
    .line 28
    iput-object p2, p0, Lco2;->k:[B

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lco2;->l:Ljava/lang/Integer;

    .line 35
    .line 36
    return-void
.end method

.method public final b(Ldo2;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    iget-object v0, p1, Ldo2;->J:Lyw1;

    .line 6
    .line 7
    iget-object v1, p1, Ldo2;->k:[B

    .line 8
    .line 9
    iget-object v2, p1, Ldo2;->a:Ljava/lang/CharSequence;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iput-object v2, p0, Lco2;->a:Ljava/lang/CharSequence;

    .line 14
    .line 15
    :cond_1
    iget-object v2, p1, Ldo2;->b:Ljava/lang/CharSequence;

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    iput-object v2, p0, Lco2;->b:Ljava/lang/CharSequence;

    .line 20
    .line 21
    :cond_2
    iget-object v2, p1, Ldo2;->c:Ljava/lang/CharSequence;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    iput-object v2, p0, Lco2;->c:Ljava/lang/CharSequence;

    .line 26
    .line 27
    :cond_3
    iget-object v2, p1, Ldo2;->d:Ljava/lang/CharSequence;

    .line 28
    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    iput-object v2, p0, Lco2;->d:Ljava/lang/CharSequence;

    .line 32
    .line 33
    :cond_4
    iget-object v2, p1, Ldo2;->e:Ljava/lang/CharSequence;

    .line 34
    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    iput-object v2, p0, Lco2;->e:Ljava/lang/CharSequence;

    .line 38
    .line 39
    :cond_5
    iget-object v2, p1, Ldo2;->f:Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v2, :cond_6

    .line 42
    .line 43
    iput-object v2, p0, Lco2;->f:Ljava/lang/CharSequence;

    .line 44
    .line 45
    :cond_6
    iget-object v2, p1, Ldo2;->g:Ljava/lang/CharSequence;

    .line 46
    .line 47
    if-eqz v2, :cond_7

    .line 48
    .line 49
    iput-object v2, p0, Lco2;->g:Ljava/lang/CharSequence;

    .line 50
    .line 51
    :cond_7
    iget-object v2, p1, Ldo2;->h:Ljava/lang/Long;

    .line 52
    .line 53
    if-eqz v2, :cond_8

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lco2;->d(Ljava/lang/Long;)V

    .line 56
    .line 57
    .line 58
    :cond_8
    iget-object v2, p1, Ldo2;->i:Llu3;

    .line 59
    .line 60
    if-eqz v2, :cond_9

    .line 61
    .line 62
    iput-object v2, p0, Lco2;->i:Llu3;

    .line 63
    .line 64
    :cond_9
    iget-object v2, p1, Ldo2;->j:Llu3;

    .line 65
    .line 66
    if-eqz v2, :cond_a

    .line 67
    .line 68
    iput-object v2, p0, Lco2;->j:Llu3;

    .line 69
    .line 70
    :cond_a
    iget-object v2, p1, Ldo2;->m:Landroid/net/Uri;

    .line 71
    .line 72
    if-nez v2, :cond_b

    .line 73
    .line 74
    if-eqz v1, :cond_c

    .line 75
    .line 76
    :cond_b
    iput-object v2, p0, Lco2;->m:Landroid/net/Uri;

    .line 77
    .line 78
    iget-object v2, p1, Ldo2;->l:Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p0, v1, v2}, Lco2;->c([BLjava/lang/Integer;)V

    .line 81
    .line 82
    .line 83
    :cond_c
    iget-object v1, p1, Ldo2;->n:Ljava/lang/Integer;

    .line 84
    .line 85
    if-eqz v1, :cond_d

    .line 86
    .line 87
    iput-object v1, p0, Lco2;->n:Ljava/lang/Integer;

    .line 88
    .line 89
    :cond_d
    iget-object v1, p1, Ldo2;->o:Ljava/lang/Integer;

    .line 90
    .line 91
    if-eqz v1, :cond_e

    .line 92
    .line 93
    iput-object v1, p0, Lco2;->o:Ljava/lang/Integer;

    .line 94
    .line 95
    :cond_e
    iget-object v1, p1, Ldo2;->p:Ljava/lang/Integer;

    .line 96
    .line 97
    if-eqz v1, :cond_f

    .line 98
    .line 99
    iput-object v1, p0, Lco2;->p:Ljava/lang/Integer;

    .line 100
    .line 101
    :cond_f
    iget-object v1, p1, Ldo2;->q:Ljava/lang/Boolean;

    .line 102
    .line 103
    if-eqz v1, :cond_10

    .line 104
    .line 105
    iput-object v1, p0, Lco2;->q:Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_10
    iget-object v1, p1, Ldo2;->r:Ljava/lang/Boolean;

    .line 108
    .line 109
    if-eqz v1, :cond_11

    .line 110
    .line 111
    iput-object v1, p0, Lco2;->r:Ljava/lang/Boolean;

    .line 112
    .line 113
    :cond_11
    iget-object v1, p1, Ldo2;->s:Ljava/lang/Integer;

    .line 114
    .line 115
    if-eqz v1, :cond_12

    .line 116
    .line 117
    iput-object v1, p0, Lco2;->s:Ljava/lang/Integer;

    .line 118
    .line 119
    :cond_12
    iget-object v1, p1, Ldo2;->t:Ljava/lang/Integer;

    .line 120
    .line 121
    if-eqz v1, :cond_13

    .line 122
    .line 123
    iput-object v1, p0, Lco2;->s:Ljava/lang/Integer;

    .line 124
    .line 125
    :cond_13
    iget-object v1, p1, Ldo2;->u:Ljava/lang/Integer;

    .line 126
    .line 127
    if-eqz v1, :cond_14

    .line 128
    .line 129
    iput-object v1, p0, Lco2;->t:Ljava/lang/Integer;

    .line 130
    .line 131
    :cond_14
    iget-object v1, p1, Ldo2;->v:Ljava/lang/Integer;

    .line 132
    .line 133
    if-eqz v1, :cond_15

    .line 134
    .line 135
    iput-object v1, p0, Lco2;->u:Ljava/lang/Integer;

    .line 136
    .line 137
    :cond_15
    iget-object v1, p1, Ldo2;->w:Ljava/lang/Integer;

    .line 138
    .line 139
    if-eqz v1, :cond_16

    .line 140
    .line 141
    iput-object v1, p0, Lco2;->v:Ljava/lang/Integer;

    .line 142
    .line 143
    :cond_16
    iget-object v1, p1, Ldo2;->x:Ljava/lang/Integer;

    .line 144
    .line 145
    if-eqz v1, :cond_17

    .line 146
    .line 147
    iput-object v1, p0, Lco2;->w:Ljava/lang/Integer;

    .line 148
    .line 149
    :cond_17
    iget-object v1, p1, Ldo2;->y:Ljava/lang/Integer;

    .line 150
    .line 151
    if-eqz v1, :cond_18

    .line 152
    .line 153
    iput-object v1, p0, Lco2;->x:Ljava/lang/Integer;

    .line 154
    .line 155
    :cond_18
    iget-object v1, p1, Ldo2;->z:Ljava/lang/CharSequence;

    .line 156
    .line 157
    if-eqz v1, :cond_19

    .line 158
    .line 159
    iput-object v1, p0, Lco2;->y:Ljava/lang/CharSequence;

    .line 160
    .line 161
    :cond_19
    iget-object v1, p1, Ldo2;->A:Ljava/lang/CharSequence;

    .line 162
    .line 163
    if-eqz v1, :cond_1a

    .line 164
    .line 165
    iput-object v1, p0, Lco2;->z:Ljava/lang/CharSequence;

    .line 166
    .line 167
    :cond_1a
    iget-object v1, p1, Ldo2;->B:Ljava/lang/CharSequence;

    .line 168
    .line 169
    if-eqz v1, :cond_1b

    .line 170
    .line 171
    iput-object v1, p0, Lco2;->A:Ljava/lang/CharSequence;

    .line 172
    .line 173
    :cond_1b
    iget-object v1, p1, Ldo2;->C:Ljava/lang/Integer;

    .line 174
    .line 175
    if-eqz v1, :cond_1c

    .line 176
    .line 177
    iput-object v1, p0, Lco2;->B:Ljava/lang/Integer;

    .line 178
    .line 179
    :cond_1c
    iget-object v1, p1, Ldo2;->D:Ljava/lang/Integer;

    .line 180
    .line 181
    if-eqz v1, :cond_1d

    .line 182
    .line 183
    iput-object v1, p0, Lco2;->C:Ljava/lang/Integer;

    .line 184
    .line 185
    :cond_1d
    iget-object v1, p1, Ldo2;->E:Ljava/lang/CharSequence;

    .line 186
    .line 187
    if-eqz v1, :cond_1e

    .line 188
    .line 189
    iput-object v1, p0, Lco2;->D:Ljava/lang/CharSequence;

    .line 190
    .line 191
    :cond_1e
    iget-object v1, p1, Ldo2;->F:Ljava/lang/CharSequence;

    .line 192
    .line 193
    if-eqz v1, :cond_1f

    .line 194
    .line 195
    iput-object v1, p0, Lco2;->E:Ljava/lang/CharSequence;

    .line 196
    .line 197
    :cond_1f
    iget-object v1, p1, Ldo2;->G:Ljava/lang/CharSequence;

    .line 198
    .line 199
    if-eqz v1, :cond_20

    .line 200
    .line 201
    iput-object v1, p0, Lco2;->F:Ljava/lang/CharSequence;

    .line 202
    .line 203
    :cond_20
    iget-object v1, p1, Ldo2;->H:Ljava/lang/Integer;

    .line 204
    .line 205
    if-eqz v1, :cond_21

    .line 206
    .line 207
    iput-object v1, p0, Lco2;->G:Ljava/lang/Integer;

    .line 208
    .line 209
    :cond_21
    iget-object p1, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 210
    .line 211
    if-eqz p1, :cond_22

    .line 212
    .line 213
    iput-object p1, p0, Lco2;->H:Landroid/os/Bundle;

    .line 214
    .line 215
    :cond_22
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_23

    .line 220
    .line 221
    invoke-static {v0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iput-object p1, p0, Lco2;->I:Lyw1;

    .line 226
    .line 227
    :cond_23
    :goto_0
    return-void
.end method

.method public final c([BLjava/lang/Integer;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, [B

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lco2;->k:[B

    .line 12
    .line 13
    iput-object p2, p0, Lco2;->l:Ljava/lang/Integer;

    .line 14
    .line 15
    return-void
.end method

.method public final d(Ljava/lang/Long;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    :goto_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lco2;->h:Ljava/lang/Long;

    .line 21
    .line 22
    return-void
.end method
