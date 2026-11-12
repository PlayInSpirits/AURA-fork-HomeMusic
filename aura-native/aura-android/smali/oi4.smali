.class public final synthetic Loi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Loi4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Loi4;->b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

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
    iget v0, p0, Loi4;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Loi4;->b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 17
    .line 18
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 19
    .line 20
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_0
    invoke-virtual {p0, v0, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void

    .line 41
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 44
    .line 45
    if-eqz p1, :cond_7

    .line 46
    .line 47
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 48
    .line 49
    iget-object p1, p1, Lui4;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v3, -0x1

    .line 59
    sparse-switch v0, :sswitch_data_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :sswitch_0
    const-string v0, "MEDIA_BY_YEAR"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 v3, 0x4

    .line 73
    goto :goto_0

    .line 74
    :sswitch_1
    const-string v0, "MEDIA_BY_GENRES"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    const/4 v3, 0x3

    .line 84
    goto :goto_0

    .line 85
    :sswitch_2
    const-string v0, "MEDIA_BY_ARTIST"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const/4 v3, 0x2

    .line 95
    goto :goto_0

    .line 96
    :sswitch_3
    const-string v0, "MEDIA_STARRED"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    move v3, v2

    .line 106
    goto :goto_0

    .line 107
    :sswitch_4
    const-string v0, "MEDIA_BY_GENRE"

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_6

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_6
    move v3, v1

    .line 117
    :goto_0
    packed-switch v3, :pswitch_data_1

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 122
    .line 123
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 124
    .line 125
    check-cast p1, Landroid/widget/Button;

    .line 126
    .line 127
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 132
    .line 133
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 134
    .line 135
    check-cast p1, Landroid/widget/Button;

    .line 136
    .line 137
    const/16 v0, 0x8

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    :goto_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 143
    .line 144
    iget-object p1, p1, Lup0;->f:Landroid/view/View;

    .line 145
    .line 146
    check-cast p1, Landroid/widget/Button;

    .line 147
    .line 148
    new-instance v0, Lpi4;

    .line 149
    .line 150
    invoke-direct {v0, p0, v2}, Lpi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    :cond_7
    return-void

    .line 157
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 158
    .line 159
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 160
    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 164
    .line 165
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 166
    .line 167
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/lang/Boolean;

    .line 172
    .line 173
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 174
    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    move v1, v2

    .line 184
    :cond_8
    invoke-virtual {p0, p1, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    :cond_9
    return-void

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
    .end packed-switch

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    :sswitch_data_0
    .sparse-switch
        -0x684a2a6a -> :sswitch_4
        -0xe5e209c -> :sswitch_3
        0x55819574 -> :sswitch_2
        0x5f04dd7d -> :sswitch_1
        0x7889e9aa -> :sswitch_0
    .end sparse-switch

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
