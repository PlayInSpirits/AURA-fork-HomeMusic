.class public final Lk00;
.super Lwn4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public u:Lcn;


# virtual methods
.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk00;->u:Lcn;

    .line 2
    .line 3
    iget-object v0, v0, Lcn;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ll00;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwn4;->r()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Ll00;->b:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
