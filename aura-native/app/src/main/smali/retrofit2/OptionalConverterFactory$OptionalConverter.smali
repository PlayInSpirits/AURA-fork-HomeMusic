.class final Lretrofit2/OptionalConverterFactory$OptionalConverter;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Converter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/OptionalConverterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionalConverter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lretrofit2/Converter<",
        "Ldefpackage/n14;",
        "Ljava/util/Optional<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field private final delegate:Lretrofit2/Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Converter<",
            "Ldefpackage/n14;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lretrofit2/Converter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Converter<",
            "Ldefpackage/n14;",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/OptionalConverterFactory$OptionalConverter;->delegate:Lretrofit2/Converter;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 12
    check-cast p1, Ldefpackage/n14;

    invoke-virtual {p0, p1}, Lretrofit2/OptionalConverterFactory$OptionalConverter;->convert(Ldefpackage/n14;)Ljava/util/Optional;

    move-result-object p0

    return-object p0
.end method

.method public convert(Ldefpackage/n14;)Ljava/util/Optional;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/n14;",
            ")",
            "Ljava/util/Optional<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/OptionalConverterFactory$OptionalConverter;->delegate:Lretrofit2/Converter;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lretrofit2/Converter;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
