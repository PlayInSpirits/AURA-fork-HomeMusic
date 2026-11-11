.class public abstract Lhv;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ll90;

.field public static final b:Lgv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lk2;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lk2;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ll90;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ll90;-><init>(Lif1;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lhv;->a:Ll90;

    .line 14
    .line 15
    new-instance v0, Lgv;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lhv;->b:Lgv;

    .line 21
    .line 22
    return-void
.end method
