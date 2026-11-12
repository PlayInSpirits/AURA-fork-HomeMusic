.class public final Lq82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Luc3;

.field public final b:Lrm3;

.field public c:Lll;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Luc3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrm3;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lrm3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lq82;->b:Lrm3;

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lq82;->d:I

    .line 15
    .line 16
    iput-object p1, p0, Lq82;->a:Luc3;

    .line 17
    .line 18
    return-void
.end method
