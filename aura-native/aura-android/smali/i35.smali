.class public abstract Li35;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lif1;


# virtual methods
.method public abstract a(Lsv0;)V
.end method

.method public b()Lif1;
    .locals 0

    .line 1
    iget-object p0, p0, Li35;->a:Lif1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li35;->b()Lif1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Lx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li35;->a:Lif1;

    .line 2
    .line 3
    return-void
.end method
