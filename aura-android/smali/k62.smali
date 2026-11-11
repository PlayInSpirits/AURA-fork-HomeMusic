.class public final Lk62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Lux3;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lux3;

    .line 2
    .line 3
    const-string v1, "^[a-z][a-z0-9_]*$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lk62;->c:Lux3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk62;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lk62;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
