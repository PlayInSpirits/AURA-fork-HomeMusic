.class public final Ldefpackage/y10;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/y10;->a:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 73
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ldefpackage/uv;ZZ)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/y10;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 80
    iput-object p2, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 81
    iput-object p3, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 82
    iput-boolean p4, p0, Ldefpackage/y10;->b:Z

    .line 83
    iput-boolean p5, p0, Ldefpackage/y10;->c:Z

    return-void
.end method

.method public constructor <init>(Ldefpackage/bv3;Ldefpackage/s21;Ldefpackage/r21;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/y10;->a:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 76
    iput-object p2, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 77
    iput-object p3, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Looper;Ldefpackage/vp4;I)V
    .locals 2

    .line 1
    iput p4, p0, Ldefpackage/y10;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p4, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p4, Ldefpackage/xc5;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 v1, 0x16

    .line 17
    .line 18
    invoke-direct {p4, v1, p1}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p4, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p3, p2, v0}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p3, p1, v0}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance p4, Ldefpackage/rf2;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p4, p1}, Ldefpackage/rf2;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p4, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {p3, p2, v0}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p3, p1, v0}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/bv3;

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p0, p2, p1, p3}, Ldefpackage/bv3;->f(Ldefpackage/y10;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public b(Lcom/google/android/material/chip/Chip;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    return v3

    .line 21
    :cond_0
    iget-object v2, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/y10;->f()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/google/android/material/chip/Chip;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v2, v3}, Ldefpackage/y10;->m(Lcom/google/android/material/chip/Chip;Z)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-interface {p1}, Landroid/widget/Checkable;->isChecked()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-interface {p1, v0}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return p0
.end method

.method public c(Ldefpackage/oz3;Z)Ldefpackage/o21;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Ldefpackage/y10;->b:Z

    .line 5
    .line 6
    iget-object p2, p1, Ldefpackage/oz3;->d:Ldefpackage/tz3;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ldefpackage/tz3;->contentLength()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p2, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Ldefpackage/r21;

    .line 18
    .line 19
    invoke-interface {p2, p1, v0, v1}, Ldefpackage/r21;->e(Ldefpackage/oz3;J)Ldefpackage/of4;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, Ldefpackage/o21;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1, v0, v1}, Ldefpackage/o21;-><init>(Ldefpackage/y10;Ldefpackage/of4;J)V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method

.method public d(Landroid/view/ViewGroup;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v3, v2, Lcom/google/android/material/chip/Chip;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-object p0
.end method

.method public e()Ldefpackage/cv3;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/r21;

    .line 4
    .line 5
    invoke-interface {p0}, Ldefpackage/r21;->h()Ldefpackage/q21;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Ldefpackage/cv3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Ldefpackage/cv3;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v1

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "no connection for CONNECT tunnels"

    .line 22
    .line 23
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/y10;->b:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    const/4 p0, -0x1

    .line 31
    return p0
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/zg5;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, v0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lcom/google/android/material/chip/ChipGroup;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup;->t:Ldefpackage/n20;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/material/chip/ChipGroup;->u:Ldefpackage/y10;

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ldefpackage/y10;->d(Landroid/view/ViewGroup;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    check-cast v0, Ldefpackage/d34;

    .line 30
    .line 31
    iget-object p0, v0, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lcom/google/android/material/chip/ChipGroup;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup;->u:Ldefpackage/y10;

    .line 36
    .line 37
    iget-boolean v0, v0, Ldefpackage/y10;->b:Z

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/chip/ChipGroup;->getCheckedChipId()I

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public h(ZZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/yp4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ldefpackage/v85;

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2, v1}, Ldefpackage/v85;-><init>(Ljava/lang/Object;ZZI)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v5, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ldefpackage/yp4;

    .line 28
    .line 29
    new-instance v3, Ldefpackage/w85;

    .line 30
    .line 31
    invoke-direct {v3, v1, p0, v5}, Ldefpackage/w85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v6, 0x3e8

    .line 35
    .line 36
    iget-object v1, v2, Ldefpackage/yp4;->a:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {v1, v3, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    new-instance v3, Ldefpackage/x85;

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    move-object v4, p0

    .line 45
    move v6, p1

    .line 46
    move v7, p2

    .line 47
    invoke-direct/range {v3 .. v8}, Ldefpackage/x85;-><init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;ZZI)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public i(ZZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/yp4;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ldefpackage/v85;

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2, v1}, Ldefpackage/v85;-><init>(Ljava/lang/Object;ZZI)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    invoke-direct {v5, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ldefpackage/yp4;

    .line 27
    .line 28
    new-instance v2, Ldefpackage/w85;

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-direct {v2, v3, p0, v5}, Ldefpackage/w85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v3, 0x3e8

    .line 35
    .line 36
    iget-object v1, v1, Ldefpackage/yp4;->a:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    new-instance v3, Ldefpackage/x85;

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    move-object v4, p0

    .line 45
    move v6, p1

    .line 46
    move v7, p2

    .line 47
    invoke-direct/range {v3 .. v8}, Ldefpackage/x85;-><init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;ZZI)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public j(Z)Ldefpackage/j14;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/r21;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldefpackage/r21;->f(Z)Ldefpackage/j14;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iput-object p0, p1, Ldefpackage/j14;->m:Ldefpackage/y10;

    .line 12
    .line 13
    new-instance v0, Ldefpackage/zf0;

    .line 14
    .line 15
    const/4 v1, 0x7

    .line 16
    invoke-direct {v0, v1, p0}, Ldefpackage/zf0;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p1, Ldefpackage/j14;->n:Ldefpackage/gf1;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    :cond_0
    return-object p1

    .line 22
    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p0, p1}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public k(Z)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/y10;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ldefpackage/y10;->c:Z

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iput-boolean p1, p0, Ldefpackage/y10;->c:Z

    .line 12
    .line 13
    iget-boolean v0, p0, Ldefpackage/y10;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0, p1}, Ldefpackage/y10;->i(ZZ)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void

    .line 22
    :pswitch_0
    iget-boolean v0, p0, Ldefpackage/y10;->c:Z

    .line 23
    .line 24
    if-ne v0, p1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iput-boolean p1, p0, Ldefpackage/y10;->c:Z

    .line 28
    .line 29
    iget-boolean v0, p0, Ldefpackage/y10;->b:Z

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p0, v0, p1}, Ldefpackage/y10;->h(ZZ)V

    .line 35
    .line 36
    .line 37
    :cond_3
    :goto_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public l(Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/y10;->c:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/r21;

    .line 7
    .line 8
    invoke-interface {v0}, Ldefpackage/r21;->h()Ldefpackage/q21;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/bv3;

    .line 15
    .line 16
    invoke-interface {v0, p0, p1}, Ldefpackage/q21;->b(Ldefpackage/bv3;Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public m(Lcom/google/android/material/chip/Chip;Z)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/HashSet;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne p2, v1, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v1}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-interface {p1}, Landroid/widget/Checkable;->isChecked()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-interface {p1, v2}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return p0
.end method
