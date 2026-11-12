.class public interface abstract Lzn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public b([BII)Lqn4;
    .locals 6

    .line 1
    invoke-static {}, Lyw1;->j()Luw1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v5, Lss2;

    .line 6
    .line 7
    const/16 v0, 0x16

    .line 8
    .line 9
    invoke-direct {v5, v0, p2}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sget-object v4, Lyn4;->c:Lyn4;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v3, p3

    .line 18
    invoke-interface/range {v0 .. v5}, Lzn4;->c([BIILyn4;Lwc0;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lmg0;

    .line 22
    .line 23
    invoke-virtual {p2}, Luw1;->f()Lgy3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, Lmg0;-><init>(Lgy3;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public abstract c([BIILyn4;Lwc0;)V
.end method

.method public reset()V
    .locals 0

    .line 1
    return-void
.end method
