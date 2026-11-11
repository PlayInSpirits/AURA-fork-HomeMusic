.class public final synthetic Ls7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ls7;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ls7;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget v0, p0, Ls7;->n:I

    .line 2
    .line 3
    const-string v1, "input_method"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ls7;->o:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->h0(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return v2

    .line 17
    :pswitch_0
    check-cast p0, Lcom/google/android/material/search/SearchView;

    .line 18
    .line 19
    sget p1, Lcom/google/android/material/search/SearchView;->Q:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->f()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return v2

    .line 31
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->h0(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return v2

    .line 37
    :pswitch_2
    check-cast p0, Lol3;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_5

    .line 44
    .line 45
    iget-object p1, p0, Lol3;->v:Lzd0;

    .line 46
    .line 47
    iget-object p1, p1, Lzd0;->s:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 50
    .line 51
    iget-object p2, p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 52
    .line 53
    iget-boolean p2, p2, Lwl3;->i:Z

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->o0:Lf22;

    .line 59
    .line 60
    iget-object p2, p1, Lf22;->m:Le22;

    .line 61
    .line 62
    iget-object v0, p1, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    iget p2, p2, Le22;->c:I

    .line 65
    .line 66
    or-int/lit8 v1, p2, 0x3

    .line 67
    .line 68
    shl-int/lit8 p2, p2, 0x8

    .line 69
    .line 70
    or-int/2addr p2, v1

    .line 71
    const/high16 v1, 0x30000

    .line 72
    .line 73
    or-int/2addr p2, v1

    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {p2, v0}, Le22;->b(II)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/high16 v0, 0xff0000

    .line 83
    .line 84
    and-int/2addr p2, v0

    .line 85
    const-string v0, "ItemTouchHelper"

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    iget-object p2, p0, Lcx3;->a:Landroid/view/View;

    .line 90
    .line 91
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    iget-object v1, p1, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 96
    .line 97
    if-eq p2, v1, :cond_2

    .line 98
    .line 99
    const-string p0, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper."

    .line 100
    .line 101
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    iget-object p2, p1, Lf22;->t:Landroid/view/VelocityTracker;

    .line 106
    .line 107
    if-eqz p2, :cond_3

    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/VelocityTracker;->recycle()V

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iput-object p2, p1, Lf22;->t:Landroid/view/VelocityTracker;

    .line 117
    .line 118
    const/4 p2, 0x0

    .line 119
    iput p2, p1, Lf22;->i:F

    .line 120
    .line 121
    iput p2, p1, Lf22;->h:F

    .line 122
    .line 123
    const/4 p2, 0x2

    .line 124
    invoke-virtual {p1, p0, p2}, Lf22;->r(Lcx3;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    const-string p0, "Start drag has been called but dragging is not enabled"

    .line 129
    .line 130
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_0
    return v2

    .line 134
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->h0(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    return v2

    .line 140
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->h0(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    return v2

    .line 146
    :pswitch_5
    check-cast p0, Lix0;

    .line 147
    .line 148
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    const/4 p2, 0x1

    .line 153
    if-ne p1, p2, :cond_8

    .line 154
    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    iget-wide v3, p0, Lix0;->o:J

    .line 160
    .line 161
    sub-long/2addr v0, v3

    .line 162
    const-wide/16 v3, 0x0

    .line 163
    .line 164
    cmp-long p1, v0, v3

    .line 165
    .line 166
    if-ltz p1, :cond_6

    .line 167
    .line 168
    const-wide/16 v3, 0x12c

    .line 169
    .line 170
    cmp-long p1, v0, v3

    .line 171
    .line 172
    if-lez p1, :cond_7

    .line 173
    .line 174
    :cond_6
    iput-boolean v2, p0, Lix0;->m:Z

    .line 175
    .line 176
    :cond_7
    invoke-virtual {p0}, Lix0;->t()V

    .line 177
    .line 178
    .line 179
    iput-boolean p2, p0, Lix0;->m:Z

    .line 180
    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 182
    .line 183
    .line 184
    move-result-wide p1

    .line 185
    iput-wide p1, p0, Lix0;->o:J

    .line 186
    .line 187
    :cond_8
    return v2

    .line 188
    :pswitch_6
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 189
    .line 190
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p0, p1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 205
    .line 206
    .line 207
    return v2

    .line 208
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 209
    .line 210
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->i0(Landroid/view/View;)V

    .line 211
    .line 212
    .line 213
    return v2

    .line 214
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 215
    .line 216
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 225
    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p0, p1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 231
    .line 232
    .line 233
    return v2

    .line 234
    :pswitch_9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 235
    .line 236
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->i0(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    return v2

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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
