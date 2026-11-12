.class public interface abstract Lg45;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract d(JLce;Lce;Lce;)Lce;
.end method

.method public abstract k(JLce;Lce;Lce;)Lce;
.end method

.method public l(Lce;Lce;Lce;)Lce;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Lg45;->m(Lce;Lce;Lce;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Lg45;->d(JLce;Lce;Lce;)Lce;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public abstract m(Lce;Lce;Lce;)J
.end method
