.class public abstract Ls51;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ly41;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly41;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ly41;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls51;->a:Ly41;

    .line 8
    .line 9
    return-void
.end method

.method public static a(ILq51;)Li61;
    .locals 3

    .line 1
    new-instance v0, Lko3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lko3;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Li61;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    sget-object v2, Ls51;->a:Ly41;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1, v2, v1}, Li61;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method
