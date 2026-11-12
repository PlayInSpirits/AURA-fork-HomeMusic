.class public interface abstract Lwi2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loo0;


# virtual methods
.method public abstract K()Z
.end method

.method public abstract T(IILjava/util/Map;Lif1;Lif1;)Lvi2;
.end method

.method public abstract getLayoutDirection()Lr62;
.end method

.method public v(IILjava/util/Map;Lif1;)Lvi2;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-interface/range {v0 .. v5}, Lwi2;->T(IILjava/util/Map;Lif1;Lif1;)Lvi2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
