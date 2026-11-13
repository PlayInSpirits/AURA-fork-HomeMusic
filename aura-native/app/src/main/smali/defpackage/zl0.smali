.class public final synthetic Ldefpackage/zl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/n51;


# instance fields
.field public final synthetic b:Ldefpackage/dm0;

.field public final synthetic c:Ldefpackage/tb1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/dm0;Ldefpackage/tb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zl0;->b:Ldefpackage/dm0;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/zl0;->c:Ldefpackage/tb1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()[Ldefpackage/k51;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/zl0;->b:Ldefpackage/dm0;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/zl0;->c:Ldefpackage/tb1;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ldefpackage/om0;->n(Ldefpackage/tb1;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ldefpackage/un4;

    .line 14
    .line 15
    iget-object v0, v0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ldefpackage/om0;->C(Ldefpackage/tb1;)Ldefpackage/zn4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, p0}, Ldefpackage/un4;-><init>(Ldefpackage/zn4;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ldefpackage/cm0;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Ldefpackage/cm0;-><init>(Ldefpackage/tb1;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x1

    .line 31
    new-array p0, p0, [Ldefpackage/k51;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    aput-object v1, p0, v0

    .line 35
    .line 36
    return-object p0
.end method
