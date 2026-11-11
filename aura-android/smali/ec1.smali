.class public final Lec1;
.super Lic1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lkc1;


# direct methods
.method public constructor <init>(Lkc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lec1;->a:Lkc1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object p0, p0, Lec1;->a:Lkc1;

    .line 2
    .line 3
    iget-object v0, p0, Lkc1;->g0:Lgp3;

    .line 4
    .line 5
    iget-object v0, v0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxm2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lxm2;->a()V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Le54;->b(Lj54;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lkc1;->o:Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "registryState"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    iget-object p0, p0, Lkc1;->g0:Lgp3;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lgp3;->s(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
