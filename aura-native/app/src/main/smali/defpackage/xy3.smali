.class public final Ldefpackage/xy3;
.super Ldefpackage/d0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qe0;


# instance fields
.field public final synthetic o:Ldefpackage/x80;

.field public final synthetic p:Ldefpackage/yy3;


# direct methods
.method public constructor <init>(Ldefpackage/x80;Ldefpackage/yy3;)V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/fz0;->S:Ldefpackage/fz0;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/xy3;->o:Ldefpackage/x80;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/xy3;->p:Ldefpackage/yy3;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ldefpackage/d0;-><init>(Ldefpackage/me0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final n(Ldefpackage/ne0;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/fa;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget-object v2, p0, Ldefpackage/xy3;->o:Ldefpackage/x80;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/xy3;->p:Ldefpackage/yy3;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Ldefpackage/si0;->T(Ljava/lang/Throwable;Ldefpackage/gf1;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Ldefpackage/fz0;->S:Ldefpackage/fz0;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/yy3;->n:Ldefpackage/ne0;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ldefpackage/qe0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Ldefpackage/qe0;->n(Ldefpackage/ne0;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    throw p2
.end method
