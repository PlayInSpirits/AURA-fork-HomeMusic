.class public final Lti4;
.super Lrw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lti4;->b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lti4;->a:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 8

    .line 1
    iget-object p1, p0, Lti4;->a:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Lmw3;->v()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1}, Lmw3;->D()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object p0, p0, Lti4;->b:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    if-ltz p1, :cond_2

    .line 22
    .line 23
    add-int/2addr p2, p1

    .line 24
    div-int/lit8 p3, p3, 0x4

    .line 25
    .line 26
    mul-int/lit8 p3, p3, 0x3

    .line 27
    .line 28
    if-lt p2, p3, :cond_2

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 32
    .line 33
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget p2, p1, Lui4;->o:I

    .line 40
    .line 41
    iget-object p3, p1, Lui4;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sparse-switch v0, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :sswitch_0
    const-string p0, "MEDIA_BY_YEAR"

    .line 53
    .line 54
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_1
    const-string p0, "MEDIA_BY_GENRES"

    .line 59
    .line 60
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :sswitch_2
    const-string p0, "MEDIA_BY_ARTIST"

    .line 65
    .line 66
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_3
    const-string p0, "MEDIA_STARRED"

    .line 71
    .line 72
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :sswitch_4
    const-string v0, "MEDIA_BY_GENRE"

    .line 77
    .line 78
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    iget-object p3, p1, Lui4;->j:Lk03;

    .line 85
    .line 86
    invoke-virtual {p3}, Lad2;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    const/4 v0, 0x0

    .line 91
    if-eqz p3, :cond_0

    .line 92
    .line 93
    iget-object p3, p1, Lui4;->j:Lk03;

    .line 94
    .line 95
    invoke-virtual {p3}, Lad2;->d()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    check-cast p3, Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move p3, v0

    .line 107
    :goto_0
    if-lez p3, :cond_1

    .line 108
    .line 109
    rem-int v1, p3, p2

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    div-int/2addr p3, p2

    .line 115
    iget-object p2, p1, Lui4;->c:Lxi4;

    .line 116
    .line 117
    iget-object v1, p1, Lui4;->g:Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance p2, Lk03;

    .line 127
    .line 128
    invoke-direct {p2}, Lad2;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lpn4;->a()Lxc5;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v5, 0x64

    .line 140
    .line 141
    mul-int/lit8 v6, p3, 0x64

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const-string p3, "BrowsingClient"

    .line 147
    .line 148
    const-string v1, "getSongsByGenre()"

    .line 149
    .line 150
    invoke-static {p3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    iget-object p3, v0, Lxc5;->p:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v2, p3

    .line 156
    check-cast v2, Lw8;

    .line 157
    .line 158
    iget-object p3, v0, Lxc5;->o:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p3, Lpn4;

    .line 161
    .line 162
    invoke-virtual {p3}, Lpn4;->f()Ljava/util/HashMap;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-interface/range {v2 .. v7}, Lw8;->e(Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)Lretrofit2/Call;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    new-instance v0, Lq8;

    .line 175
    .line 176
    const/4 v1, 0x5

    .line 177
    invoke-direct {v0, p2, v1}, Lq8;-><init>(Lk03;I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p3, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 181
    .line 182
    .line 183
    new-instance p3, Ld8;

    .line 184
    .line 185
    const/16 v0, 0x18

    .line 186
    .line 187
    invoke-direct {p3, v0, p1}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, p0, p3}, Lad2;->e(Lba2;La83;)V

    .line 191
    .line 192
    .line 193
    :cond_2
    :goto_1
    return-void

    .line 194
    nop

    .line 195
    :sswitch_data_0
    .sparse-switch
        -0x684a2a6a -> :sswitch_4
        -0xe5e209c -> :sswitch_3
        0x55819574 -> :sswitch_2
        0x5f04dd7d -> :sswitch_1
        0x7889e9aa -> :sswitch_0
    .end sparse-switch
.end method
