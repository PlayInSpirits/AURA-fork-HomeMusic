.class public final Lmc1;
.super Lfu;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lf75;
.implements Lba2;
.implements Lj54;
.implements Lxd1;


# instance fields
.field public final A:Lnc1;

.field public final B:Lnc1;

.field public final C:Landroid/os/Handler;

.field public final D:Lmd1;

.field public final synthetic E:Lnc1;


# direct methods
.method public constructor <init>(Lnc1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmc1;->E:Lnc1;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lmd1;

    .line 12
    .line 13
    invoke-direct {v1}, Lld1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lmc1;->D:Lmd1;

    .line 17
    .line 18
    iput-object p1, p0, Lmc1;->A:Lnc1;

    .line 19
    .line 20
    iput-object p1, p0, Lmc1;->B:Lnc1;

    .line 21
    .line 22
    iput-object v0, p0, Lmc1;->C:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final H(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lmc1;->E:Lnc1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lmc1;->E:Lnc1;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final a(Lld1;Lkc1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Le75;
    .locals 0

    .line 1
    iget-object p0, p0, Lmc1;->E:Lnc1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll70;->d()Le75;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f()Lrm3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmc1;->E:Lnc1;

    .line 2
    .line 3
    iget-object p0, p0, Ll70;->q:Lgp3;

    .line 4
    .line 5
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lrm3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h()Lea2;
    .locals 0

    .line 1
    iget-object p0, p0, Lmc1;->E:Lnc1;

    .line 2
    .line 3
    iget-object p0, p0, Lnc1;->I:Lea2;

    .line 4
    .line 5
    return-object p0
.end method
