.class public final Lyc5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Law1;
.implements Lkg1;
.implements Lretrofit2/Callback;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance p1, Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lyc5;->o:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance p1, Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lyc5;->p:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lyc5;->p:Ljava/lang/Object;

    iput-object p2, p0, Lyc5;->n:Ljava/lang/Object;

    iput-object p3, p0, Lyc5;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lzg5;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 44
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Lyc5;->o:Ljava/lang/Object;

    .line 45
    new-instance p1, Lsd;

    invoke-direct {p1, p0}, Lsd;-><init>(Lyc5;)V

    iput-object p1, p0, Lyc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lym2;)Lkk0;
    .locals 14

    .line 1
    new-instance v0, Lbl0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbl0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v4, Lll;

    .line 8
    .line 9
    iget-object v2, p0, Lym2;->b:Landroid/net/Uri;

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move-object v2, v10

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    iget-boolean v3, p0, Lym2;->f:Z

    .line 21
    .line 22
    invoke-direct {v4, v2, v3, v0}, Lll;-><init>(Ljava/lang/String;ZLbl0;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lym2;->c:Lbx1;

    .line 26
    .line 27
    iget-object v2, v0, Lbx1;->n:Ljx1;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lbx1;->c()Liy3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, v0, Lbx1;->n:Ljx1;

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2}, Lrw1;->h()Lo15;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v5, v4, Lll;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v5, Ljava/util/HashMap;

    .line 74
    .line 75
    monitor-enter v5

    .line 76
    :try_start_0
    iget-object v6, v4, Lll;->r:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v6, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    monitor-exit v5

    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    throw p0

    .line 89
    :cond_2
    new-instance v5, Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lax;->a:Ljava/util/UUID;

    .line 95
    .line 96
    new-instance v9, Li80;

    .line 97
    .line 98
    const/16 v0, 0x1c

    .line 99
    .line 100
    invoke-direct {v9, v0}, Li80;-><init>(I)V

    .line 101
    .line 102
    .line 103
    iget-object v3, p0, Lym2;->a:Ljava/util/UUID;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-boolean v6, p0, Lym2;->d:Z

    .line 109
    .line 110
    iget-boolean v8, p0, Lym2;->e:Z

    .line 111
    .line 112
    iget-object v0, p0, Lym2;->g:Lyw1;

    .line 113
    .line 114
    invoke-static {v0}, Ljz4;->N(Ljava/util/Collection;)[I

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    array-length v2, v0

    .line 119
    move v7, v1

    .line 120
    :goto_2
    if-ge v7, v2, :cond_5

    .line 121
    .line 122
    aget v11, v0, v7

    .line 123
    .line 124
    const/4 v12, 0x2

    .line 125
    const/4 v13, 0x1

    .line 126
    if-eq v11, v12, :cond_4

    .line 127
    .line 128
    if-ne v11, v13, :cond_3

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move v13, v1

    .line 132
    :cond_4
    :goto_3
    invoke-static {v13}, Lrr2;->l(Z)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    move-object v7, v0

    .line 143
    check-cast v7, [I

    .line 144
    .line 145
    new-instance v2, Lkk0;

    .line 146
    .line 147
    invoke-direct/range {v2 .. v9}, Lkk0;-><init>(Ljava/util/UUID;Lll;Ljava/util/HashMap;Z[IZLi80;)V

    .line 148
    .line 149
    .line 150
    iget-object p0, p0, Lym2;->h:[B

    .line 151
    .line 152
    if-eqz p0, :cond_6

    .line 153
    .line 154
    array-length v0, p0

    .line 155
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    :cond_6
    iget-object p0, v2, Lkk0;->m:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-static {p0}, Lrr2;->w(Z)V

    .line 166
    .line 167
    .line 168
    iput-object v10, v2, Lkk0;->v:[B

    .line 169
    .line 170
    return-object v2
.end method


# virtual methods
.method public b(Lgn2;)Lww0;
    .locals 2

    .line 1
    iget-object v0, p1, Lgn2;->b:Lbn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lgn2;->b:Lbn2;

    .line 7
    .line 8
    iget-object p1, p1, Lbn2;->c:Lym2;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lww0;->a:Luw0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p0, Lyc5;->n:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, p0, Lyc5;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lym2;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Lym2;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iput-object p1, p0, Lyc5;->o:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p1}, Lyc5;->a(Lym2;)Lkk0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lyc5;->p:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    iget-object p0, p0, Lyc5;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkk0;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lhg3;

    .line 8
    .line 9
    iget-object v1, v1, Lhg3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Law3;

    .line 12
    .line 13
    invoke-virtual {v1}, Law3;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lyc5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lqj0;

    .line 19
    .line 20
    invoke-static {v0, v1, p0}, Lkb4;->A(Ljava/util/List;Ljava/io/InputStream;Lqj0;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    iget-object v0, p0, Lyc5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    iget-object v1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const v3, 0x7f0a021a

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v3}, Landroid/view/View;->setId(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lyc5;->p:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->n:Lqj3;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-virtual {p0, p1, v0}, Lqj3;->h(Landroid/view/View;Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "The media route button placeholder missing layout params."

    .line 52
    .line 53
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public i(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object p0, p0, Lyc5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lhg3;

    .line 4
    .line 5
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Law3;

    .line 8
    .line 9
    invoke-virtual {p0}, Law3;->reset()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, v0, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyc5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lhg3;

    .line 4
    .line 5
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Law3;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Law3;->n:[B

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    iput v0, p0, Law3;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 2

    .line 1
    iget-object v0, p0, Lyc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lhg3;

    .line 8
    .line 9
    iget-object v1, v1, Lhg3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Law3;

    .line 12
    .line 13
    invoke-virtual {v1}, Law3;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lyc5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lqj0;

    .line 19
    .line 20
    invoke-static {v0, v1, p0}, Lkb4;->B(Ljava/util/List;Ljava/io/InputStream;Lqj0;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyc5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lyc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lxi4;

    .line 4
    .line 5
    iget-object p2, p0, Lyc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lyc5;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lk03;

    .line 12
    .line 13
    invoke-virtual {p1, p2, p0}, Lxi4;->l(Ljava/lang/String;Lk03;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lyc5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lk03;

    .line 4
    .line 5
    iget-object v0, p0, Lyc5;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxi4;

    .line 8
    .line 9
    const-string v1, "similarSongs2"

    .line 10
    .line 11
    invoke-static {v0, p2, v1}, Lxi4;->h(Lxi4;Lretrofit2/Response;Ljava/lang/String;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lad2;->i(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p0, p0, Lyc5;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, p0, p1}, Lxi4;->l(Ljava/lang/String;Lk03;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
