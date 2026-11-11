.class public final synthetic Lj92;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj92;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lj92;->b:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lj92;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    iget-object p0, p0, Lj92;->b:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Lxc1;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    iget-object p0, v0, Lxc1;->k:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, v0, Lxc1;->k:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v2

    .line 37
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->q0:Ls6;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ls6;->p(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_1
    return-void

    .line 46
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Lxc1;

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    if-eqz v0, :cond_7

    .line 53
    .line 54
    iget-object p0, v0, Lxc1;->l:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    if-eqz v0, :cond_6

    .line 61
    .line 62
    iget-object v0, v0, Lxc1;->l:Landroid/widget/LinearLayout;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    move v1, v2

    .line 72
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    :cond_6
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->r0:Lvi;

    .line 76
    .line 77
    iput-object p1, p0, Lvi;->u:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {p0}, Ldw3;->d()V

    .line 80
    .line 81
    .line 82
    :cond_7
    :goto_3
    return-void

    .line 83
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 84
    .line 85
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ln92;

    .line 86
    .line 87
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1}, Ln92;->c()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_8

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_8
    invoke-virtual {p1, p0}, Ln92;->d(Lle1;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Ln92;->e(Lle1;)V

    .line 102
    .line 103
    .line 104
    :goto_4
    return-void

    .line 105
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 106
    .line 107
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Lxc1;

    .line 108
    .line 109
    if-nez p1, :cond_9

    .line 110
    .line 111
    if-eqz v0, :cond_c

    .line 112
    .line 113
    iget-object p0, v0, Lxc1;->m:Landroid/widget/LinearLayout;

    .line 114
    .line 115
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_9
    if-eqz v0, :cond_b

    .line 120
    .line 121
    iget-object v0, v0, Lxc1;->m:Landroid/widget/LinearLayout;

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_a

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_a
    move v1, v2

    .line 131
    :goto_5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    :cond_b
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->s0:Lzd0;

    .line 135
    .line 136
    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    .line 137
    .line 138
    invoke-virtual {p0}, Ldw3;->d()V

    .line 139
    .line 140
    .line 141
    :cond_c
    :goto_6
    return-void

    .line 142
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 143
    .line 144
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Lxc1;

    .line 145
    .line 146
    if-nez p1, :cond_d

    .line 147
    .line 148
    if-eqz v0, :cond_10

    .line 149
    .line 150
    iget-object p0, v0, Lxc1;->q:Landroid/widget/LinearLayout;

    .line 151
    .line 152
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_d
    if-eqz v0, :cond_f

    .line 157
    .line 158
    iget-object v0, v0, Lxc1;->q:Landroid/widget/LinearLayout;

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_e

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_e
    move v1, v2

    .line 168
    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    :cond_f
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->t0:Lq7;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v0, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 179
    .line 180
    .line 181
    iput-object v0, p0, Lq7;->s:Ljava/util/List;

    .line 182
    .line 183
    iget-object p1, p0, Lq7;->v:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {p1, v0}, Lsu3;->q(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iput-object p1, p0, Lq7;->t:Ljava/util/List;

    .line 192
    .line 193
    invoke-virtual {p0}, Ldw3;->d()V

    .line 194
    .line 195
    .line 196
    :cond_10
    :goto_8
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
