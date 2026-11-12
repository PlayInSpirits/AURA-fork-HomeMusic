.class public final synthetic Ly90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ltn2;

.field public final synthetic p:Lfr2;


# direct methods
.method public synthetic constructor <init>(Ltn2;Lfr2;I)V
    .locals 0

    .line 1
    iput p3, p0, Ly90;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ly90;->o:Ltn2;

    .line 4
    .line 5
    iput-object p2, p0, Ly90;->p:Lfr2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Ly90;->n:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/high16 v4, -0x80000000

    .line 8
    .line 9
    iget-object v5, p0, Ly90;->p:Lfr2;

    .line 10
    .line 11
    iget-object p0, p0, Ly90;->o:Ltn2;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 17
    .line 18
    invoke-virtual {p0, v5, v4}, Lkt2;->M0(Lfr2;I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 23
    .line 24
    invoke-virtual {p0, v5, v4}, Lkt2;->M0(Lfr2;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 29
    .line 30
    new-instance v0, Lzr2;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Lzr2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v5, v4, v3, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 44
    .line 45
    new-instance v0, Lzr2;

    .line 46
    .line 47
    const/16 v1, 0xe

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-virtual {p0, v5, v4, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_3
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 62
    .line 63
    new-instance v0, Lzr2;

    .line 64
    .line 65
    const/4 v1, 0x5

    .line 66
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-virtual {p0, v5, v4, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_4
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 80
    .line 81
    new-instance v0, Lzr2;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/16 v1, 0xc

    .line 91
    .line 92
    invoke-virtual {p0, v5, v4, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_5
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 97
    .line 98
    new-instance v0, Lzr2;

    .line 99
    .line 100
    const/4 v1, 0x6

    .line 101
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v1, 0x7

    .line 109
    invoke-virtual {p0, v5, v4, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_6
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 114
    .line 115
    new-instance v0, Lzr2;

    .line 116
    .line 117
    const/16 v2, 0xa

    .line 118
    .line 119
    invoke-direct {v0, v2}, Lzr2;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p0, v5, v4, v1, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_7
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 131
    .line 132
    new-instance v0, Lzr2;

    .line 133
    .line 134
    invoke-direct {v0, v2}, Lzr2;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, Lkt2;->Q0(Lwc0;)Lss2;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0, v5, v4, v3, v0}, Lkt2;->O0(Lfr2;IILit2;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_8
    invoke-virtual {p0}, Ltn2;->l()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_0
    iget-object v0, p0, Ltn2;->F:Lnl1;

    .line 153
    .line 154
    iget-object v1, v5, Lfr2;->d:Ler2;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lnl1;->l(Ljava/lang/Object;)Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1}, Ljx1;->k(Ljava/util/Collection;)Ljx1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Lrw1;->h()Lo15;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_1

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ljava/lang/String;

    .line 182
    .line 183
    iget-object v3, v5, Lfr2;->d:Ler2;

    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v4, p0, Ltn2;->E:Lnl1;

    .line 189
    .line 190
    invoke-virtual {v4, v2, v5}, Lu1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v3, v2}, Lu1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_1
    iget-boolean v0, p0, Ltn2;->y:Z

    .line 198
    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    invoke-static {v5}, Ltn2;->m(Lfr2;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_2

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_2
    invoke-virtual {p0, v5}, Ltn2;->k(Lfr2;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_3

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    iput-boolean v0, p0, Ltn2;->y:Z

    .line 216
    .line 217
    :cond_3
    iget-object p0, p0, Ltn2;->e:Lpq;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    :goto_1
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
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
