.class public final Ldefpackage/t55;
.super Ldefpackage/rp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b:Ldefpackage/be3;

.field public final c:Ldefpackage/be3;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(Ldefpackage/wv4;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/rp;-><init>(Ldefpackage/wv4;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ldefpackage/be3;

    .line 5
    .line 6
    sget-object v0, Ldefpackage/uc5;->c:[B

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ldefpackage/be3;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/t55;->b:Ldefpackage/be3;

    .line 12
    .line 13
    new-instance p1, Ldefpackage/be3;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p1, v0}, Ldefpackage/be3;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/t55;->c:Ldefpackage/be3;

    .line 20
    .line 21
    return-void
.end method
