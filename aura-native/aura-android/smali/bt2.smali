.class public final synthetic Lbt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lit2;
.implements Lwc0;
.implements Lq43;
.implements Lmd4;
.implements Lcp3;
.implements Lpy;


# instance fields
.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lbt2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv23;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/google/android/material/navigation/NavigationView;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Luo;->C(Landroid/view/MenuItem;Lv23;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->d()V

    .line 35
    .line 36
    .line 37
    return p1

    .line 38
    :cond_0
    invoke-static {p0}, Luo;->r(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lue1;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lun2;

    .line 8
    .line 9
    check-cast p1, Lst2;

    .line 10
    .line 11
    iget v1, v0, Lue1;->o:I

    .line 12
    .line 13
    iget-object v0, v0, Lue1;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lmt2;

    .line 16
    .line 17
    invoke-interface {p1, v1, v0, p0}, Lst2;->l(ILmt2;Lun2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvp3;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lzn;

    .line 8
    .line 9
    iget-boolean v1, v0, Lvp3;->q:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lvp3;->h()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Lvp3;->o:J

    .line 17
    .line 18
    iget-wide v3, p0, Lzn;->a:J

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, Lzn;->a(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iput-wide v1, p0, Lzn;->a:J

    .line 25
    .line 26
    iget-wide v3, v0, Lvp3;->n:J

    .line 27
    .line 28
    iget-wide v5, p0, Lzn;->b:J

    .line 29
    .line 30
    add-long/2addr v1, v5

    .line 31
    invoke-virtual {v0, v3, v4, v1, v2}, Lvp3;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    xor-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    iput-boolean p0, v0, Lvp3;->q:Z

    .line 38
    .line 39
    :cond_0
    iget-boolean p0, v0, Lvp3;->q:Z

    .line 40
    .line 41
    return p0
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lit2;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lht2;

    .line 8
    .line 9
    invoke-virtual {p1}, Ltn2;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance p0, Lab4;

    .line 16
    .line 17
    const/16 p1, -0x64

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lmw1;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lit2;->h(Ltn2;Lfr2;I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lic2;

    .line 33
    .line 34
    new-instance v0, Leg0;

    .line 35
    .line 36
    const/16 v1, 0x9

    .line 37
    .line 38
    invoke-direct {v0, p1, p2, p0, v1}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {p3, v0}, Lf35;->h0(Lic2;Lmk;)Llb4;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lvb4;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/Intent;

    .line 8
    .line 9
    iget-object p1, p1, Lvb4;->z0:Lr5;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lr5;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public k(Loy;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lbt2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object p0, p0, Lbt2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lgf1;

    .line 8
    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljc2;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v1, v3}, Ljc2;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p1, Loy;->c:Ln04;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    sget-object v4, Lfq0;->n:Lfq0;

    .line 26
    .line 27
    invoke-virtual {v3, v2, v4}, Lg2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v2, Lqo2;

    .line 31
    .line 32
    const/16 v3, 0x16

    .line 33
    .line 34
    invoke-direct {v2, v1, p1, p0, v3}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lj15;->a:Lj15;

    .line 41
    .line 42
    return-object p0
.end method
