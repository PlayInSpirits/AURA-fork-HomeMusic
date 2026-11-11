.class public interface abstract Ldx2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public abstract a(Lif1;)Z
.end method

.method public abstract b(Lwf1;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public c(Ldx2;)Ldx2;
    .locals 1

    .line 1
    sget-object v0, Lax2;->a:Lax2;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lh60;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lh60;-><init>(Ldx2;Ldx2;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
