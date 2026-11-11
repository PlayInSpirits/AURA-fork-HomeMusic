.class public abstract Lv60;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lt60;

.field public static final b:Lu60;

.field public static final c:Lu60;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv60;->a:Lt60;

    .line 7
    .line 8
    new-instance v0, Lu60;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Lu60;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lv60;->b:Lu60;

    .line 15
    .line 16
    new-instance v0, Lu60;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lu60;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lv60;->c:Lu60;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(II)Lv60;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;
.end method

.method public abstract c(ZZ)Lv60;
.end method

.method public abstract d(ZZ)Lv60;
.end method

.method public abstract e()I
.end method
