.class public final Lkk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq55;


# instance fields
.field public final synthetic b:Lok2;


# direct methods
.method public constructor <init>(Lok2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkk2;->b:Lok2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ls55;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object p0, p0, Lkk2;->b:Lok2;

    .line 2
    .line 3
    iget-object v0, p0, Lok2;->l1:Landroid/view/Surface;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lok2;->W0:Lrf2;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lrf2;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lok2;->o1:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object p0, p0, Lkk2;->b:Lok2;

    .line 2
    .line 3
    iget-object v0, p0, Lok2;->l1:Landroid/view/Surface;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Lok2;->S0(II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkk2;->b:Lok2;

    .line 2
    .line 3
    iget-object p0, p0, Lgk2;->V:Lk41;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk41;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
