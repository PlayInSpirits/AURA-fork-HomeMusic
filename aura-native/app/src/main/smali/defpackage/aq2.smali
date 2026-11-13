.class public final Ldefpackage/aq2;
.super Ldefpackage/dg;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:Z

.field public B:Ldefpackage/wq2;

.field public final C:J

.field public D:J

.field public final E:Ldefpackage/zk;

.field public final t:Ldefpackage/yq2;

.field public final u:Ldefpackage/ap2;

.field public final v:Landroid/content/Context;

.field public w:Ldefpackage/rq2;

.field public x:Ljava/util/ArrayList;

.field public y:Ldefpackage/zp2;

.field public z:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Ldefpackage/fu;->o(Landroid/content/Context;Z)Landroid/view/ContextThemeWrapper;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const v0, 0x7f040375

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Ldefpackage/fu;->B(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Ldefpackage/fu;->z(Landroid/content/Context;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :cond_0
    invoke-direct {p0, p1, v0}, Ldefpackage/dg;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Ldefpackage/rq2;->c:Ldefpackage/rq2;

    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/aq2;->w:Ldefpackage/rq2;

    .line 25
    .line 26
    new-instance p1, Ldefpackage/zk;

    .line 27
    .line 28
    const/4 v0, 0x6

    .line 29
    invoke-direct {p1, v0, p0}, Ldefpackage/zk;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/aq2;->E:Ldefpackage/zk;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Ldefpackage/yq2;->d(Landroid/content/Context;)Ldefpackage/yq2;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ldefpackage/aq2;->t:Ldefpackage/yq2;

    .line 43
    .line 44
    new-instance v0, Ldefpackage/ap2;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-direct {v0, p0, v1}, Ldefpackage/ap2;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Ldefpackage/aq2;->u:Ldefpackage/ap2;

    .line 51
    .line 52
    iput-object p1, p0, Ldefpackage/aq2;->v:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const v0, 0x7f0b0036

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    int-to-long v0, p1

    .line 66
    iput-wide v0, p0, Ldefpackage/aq2;->C:J

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/aq2;->B:Ldefpackage/wq2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-boolean v0, p0, Ldefpackage/aq2;->A:Z

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/aq2;->t:Ldefpackage/yq2;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ldefpackage/yq2;->b()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ldefpackage/yq2;->c()Ldefpackage/ui1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 35
    .line 36
    if-lez v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ldefpackage/wq2;

    .line 43
    .line 44
    invoke-virtual {v1}, Ldefpackage/wq2;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    iget-boolean v3, v1, Ldefpackage/wq2;->g:Z

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    iget-object v3, p0, Ldefpackage/aq2;->w:Ldefpackage/rq2;

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ldefpackage/wq2;->h(Ldefpackage/rq2;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :goto_1
    move v1, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    sget-object v1, Ldefpackage/ca1;->r:Ldefpackage/ca1;

    .line 69
    .line 70
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    iget-wide v3, p0, Ldefpackage/aq2;->D:J

    .line 78
    .line 79
    sub-long/2addr v1, v3

    .line 80
    iget-wide v3, p0, Ldefpackage/aq2;->C:J

    .line 81
    .line 82
    cmp-long v1, v1, v3

    .line 83
    .line 84
    if-ltz v1, :cond_3

    .line 85
    .line 86
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    iput-wide v1, p0, Ldefpackage/aq2;->D:J

    .line 91
    .line 92
    iget-object v1, p0, Ldefpackage/aq2;->x:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Ldefpackage/aq2;->x:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Ldefpackage/aq2;->y:Ldefpackage/zp2;

    .line 103
    .line 104
    invoke-virtual {p0}, Ldefpackage/zp2;->p()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    iget-object v1, p0, Ldefpackage/aq2;->E:Ldefpackage/zk;

    .line 109
    .line 110
    const/4 v2, 0x1

    .line 111
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-wide v5, p0, Ldefpackage/aq2;->D:J

    .line 119
    .line 120
    add-long/2addr v5, v3

    .line 121
    invoke-virtual {v1, v0, v5, v6}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 122
    .line 123
    .line 124
    :cond_4
    :goto_2
    return-void
.end method

.method public final j(Ldefpackage/rq2;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/aq2;->w:Ldefpackage/rq2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ldefpackage/rq2;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/aq2;->w:Ldefpackage/rq2;

    .line 12
    .line 13
    iget-boolean v0, p0, Ldefpackage/aq2;->A:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/aq2;->t:Ldefpackage/yq2;

    .line 18
    .line 19
    iget-object v1, p0, Ldefpackage/aq2;->u:Ldefpackage/ap2;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ldefpackage/yq2;->e(Ldefpackage/uo;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, p1, v1, v2}, Ldefpackage/yq2;->a(Ldefpackage/rq2;Ldefpackage/uo;I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Ldefpackage/aq2;->i()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :cond_2
    const-string p0, "selector must not be null"

    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldefpackage/aq2;->A:Z

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/aq2;->w:Ldefpackage/rq2;

    .line 8
    .line 9
    iget-object v2, p0, Ldefpackage/aq2;->u:Ldefpackage/ap2;

    .line 10
    .line 11
    iget-object v3, p0, Ldefpackage/aq2;->t:Ldefpackage/yq2;

    .line 12
    .line 13
    invoke-virtual {v3, v1, v2, v0}, Ldefpackage/yq2;->a(Ldefpackage/rq2;Ldefpackage/uo;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/aq2;->i()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dg;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0d00e0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/dg;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Ldefpackage/aq2;->v:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Ldefpackage/fu;->D(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const v1, 0x7f060311

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v1, 0x7f060310

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ldefpackage/aq2;->x:Ljava/util/ArrayList;

    .line 46
    .line 47
    const p1, 0x7f0a03db

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ldefpackage/dg;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Landroid/widget/ImageButton;

    .line 55
    .line 56
    new-instance v1, Ldefpackage/i4;

    .line 57
    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-direct {v1, v2, p0}, Ldefpackage/i4;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Ldefpackage/zp2;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Ldefpackage/zp2;-><init>(Ldefpackage/aq2;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Ldefpackage/aq2;->y:Ldefpackage/zp2;

    .line 71
    .line 72
    const p1, 0x7f0a03dd

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ldefpackage/dg;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    iput-object p1, p0, Ldefpackage/aq2;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    iget-object v1, p0, Ldefpackage/aq2;->y:Ldefpackage/zp2;

    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Ldefpackage/aq2;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const v1, 0x7f050006

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    const/4 v2, -0x1

    .line 111
    if-nez p1, :cond_1

    .line 112
    .line 113
    move p1, v2

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-static {v0}, Ldefpackage/xl;->p(Landroid/content/Context;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    :goto_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    const/4 v2, -0x2

    .line 131
    :goto_2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0, p1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/aq2;->A:Z

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/aq2;->t:Ldefpackage/yq2;

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/aq2;->u:Ldefpackage/ap2;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ldefpackage/yq2;->e(Ldefpackage/uo;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/aq2;->E:Ldefpackage/zk;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
