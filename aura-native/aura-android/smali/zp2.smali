.class public final Lzp2;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Ljava/util/ArrayList;

.field public final r:Landroid/view/LayoutInflater;

.field public final s:Landroid/graphics/drawable/Drawable;

.field public final t:Landroid/graphics/drawable/Drawable;

.field public final u:Landroid/graphics/drawable/Drawable;

.field public final v:Landroid/graphics/drawable/Drawable;

.field public final synthetic w:Laq2;


# direct methods
.method public constructor <init>(Laq2;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lzp2;->w:Laq2;

    .line 2
    .line 3
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lzp2;->q:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object p1, p1, Laq2;->v:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lzp2;->r:Landroid/view/LayoutInflater;

    .line 20
    .line 21
    const v0, 0x7f04036d

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lfu;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lzp2;->s:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    const v0, 0x7f040376

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lfu;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lzp2;->t:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    const v0, 0x7f040373

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lfu;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lzp2;->u:Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    const v0, 0x7f040372

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, Lfu;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lzp2;->v:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    invoke-virtual {p0}, Lzp2;->p()V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lzp2;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lzp2;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwp2;

    .line 8
    .line 9
    iget p0, p0, Lwp2;->b:I

    .line 10
    .line 11
    return p0
.end method

.method public final g(Lcx3;I)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lzp2;->c(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lzp2;->q:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lwp2;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    if-eq v0, p2, :cond_5

    .line 15
    .line 16
    const-string v1, "RecyclerAdapter"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_0

    .line 20
    .line 21
    const-string p0, "Cannot bind item to ViewHolder because of wrong view type"

    .line 22
    .line 23
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    check-cast p1, Lyp2;

    .line 28
    .line 29
    iget-object p0, p0, Lwp2;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lwq2;

    .line 32
    .line 33
    iget-object v0, p1, Lyp2;->u:Landroid/view/View;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p1, Lyp2;->w:Landroid/widget/ProgressBar;

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lxp2;

    .line 46
    .line 47
    invoke-direct {v3, p1, p0}, Lxp2;-><init>(Lyp2;Lwq2;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, Lyp2;->x:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object v3, p0, Lwq2;->d:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p1, Lyp2;->v:Landroid/widget/ImageView;

    .line 61
    .line 62
    iget-object p1, p1, Lyp2;->y:Lzp2;

    .line 63
    .line 64
    iget-object v3, p0, Lwq2;->f:Landroid/net/Uri;

    .line 65
    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    :try_start_0
    iget-object v4, p1, Lzp2;->w:Laq2;

    .line 69
    .line 70
    iget-object v4, v4, Laq2;->v:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-static {v4, v5}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catch_0
    move-exception v4

    .line 89
    new-instance v5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v6, "Failed to load "

    .line 92
    .line 93
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 104
    .line 105
    .line 106
    :cond_1
    iget v1, p0, Lwq2;->n:I

    .line 107
    .line 108
    if-eq v1, p2, :cond_4

    .line 109
    .line 110
    if-eq v1, v2, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0}, Lwq2;->e()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_2

    .line 117
    .line 118
    iget-object p0, p1, Lzp2;->v:Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    :goto_0
    move-object v1, p0

    .line 121
    goto :goto_1

    .line 122
    :cond_2
    iget-object p0, p1, Lzp2;->s:Landroid/graphics/drawable/Drawable;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    iget-object p0, p1, Lzp2;->u:Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    iget-object p0, p1, Lzp2;->t:Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_5
    check-cast p1, Lvp2;

    .line 136
    .line 137
    iget-object p0, p0, Lwp2;->a:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p1, p1, Lvp2;->u:Landroid/widget/TextView;

    .line 144
    .line 145
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lzp2;->r:Landroid/view/LayoutInflater;

    .line 4
    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    const p2, 0x7f0d00e2

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, Lyp2;

    .line 18
    .line 19
    invoke-direct {p2, p0, p1}, Lyp2;-><init>(Lzp2;Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-object p2

    .line 23
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const p0, 0x7f0d00e1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance p1, Lvp2;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Lcx3;-><init>(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    const p2, 0x7f0a03dc

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Landroid/widget/TextView;

    .line 48
    .line 49
    iput-object p0, p1, Lvp2;->u:Landroid/widget/TextView;

    .line 50
    .line 51
    return-object p1
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-object v0, p0, Lzp2;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lwp2;

    .line 7
    .line 8
    iget-object v2, p0, Lzp2;->w:Laq2;

    .line 9
    .line 10
    iget-object v3, v2, Laq2;->v:Landroid/content/Context;

    .line 11
    .line 12
    const v4, 0x7f130355

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v1, v3}, Lwp2;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, v2, Laq2;->x:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    check-cast v4, Lwq2;

    .line 41
    .line 42
    new-instance v5, Lwp2;

    .line 43
    .line 44
    invoke-direct {v5, v4}, Lwp2;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ldw3;->d()V

    .line 52
    .line 53
    .line 54
    return-void
.end method
