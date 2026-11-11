.class public final Ls95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ln7;


# instance fields
.field public final a:Lt95;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln7;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ls95;->c:Ln7;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lt95;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls95;->a:Lt95;

    .line 5
    .line 6
    iput p2, p0, Ls95;->b:I

    .line 7
    .line 8
    return-void
.end method
