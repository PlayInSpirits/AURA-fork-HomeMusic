.class public final Lpc0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lxi4;

.field public final b:I

.field public final c:Lc52;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ConstraintsCmdHandler"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lpc0;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxi4;ILtp4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lpc0;->a:Lxi4;

    .line 5
    .line 6
    iput p3, p0, Lpc0;->b:I

    .line 7
    .line 8
    iget-object p1, p4, Ltp4;->r:Lsc5;

    .line 9
    .line 10
    iget-object p1, p1, Lsc5;->j:Lz40;

    .line 11
    .line 12
    new-instance p2, Lc52;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Lc52;-><init>(Lz40;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lpc0;->c:Lc52;

    .line 18
    .line 19
    return-void
.end method
